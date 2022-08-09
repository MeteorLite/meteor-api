package audio.music;

import java.io.ByteArrayInputStream;
import java.util.Objects;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;

public class MidiPlayer {

  static Soundbank soundfont;
  static Sequencer sequencer;
  static Synthesizer synthesizer;

  private static boolean isRunning = false;

  private static int volume = 100;

  private static int fadeTime = 3000;

  private static Thread fadeThread;

  public static void playSong(byte[] nextSong) {
    try {
      if (soundfont == null) {
        soundfont = MidiSystem.getSoundbank(
            Objects.requireNonNull(
                ClassLoader.getSystemClassLoader().getResourceAsStream("osrs_sound_font.sf2")));
      }
      if (sequencer == null) {
        sequencer = MidiSystem.getSequencer(false);
      }

      if (synthesizer == null) {
        synthesizer = MidiSystem.getSynthesizer();
      }

      if (isRunning) {
        fadeOut(nextSong);
      } else {
        fadeIn(nextSong);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void fadeOut(byte[] nextSong) {
    long fadeStart = System.currentTimeMillis();
    fadeThread = new Thread(() -> {
      while (System.currentTimeMillis() < fadeStart + fadeTime) {
        if (volume >= 10) {
          volume -= 10;
          adjustVolume(volume);
        }

        try {
          Thread.sleep(fadeTime / 10);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
      synthesizer.close();
      isRunning = false;
      playSong(nextSong);
    });
    fadeThread.start();
  }

  private static void fadeIn(byte[] nextSong) {
    long fadeStart = System.currentTimeMillis();

    try {
      sequencer = MidiSystem.getSequencer(false);
      synthesizer = MidiSystem.getSynthesizer();

      sequencer.open();
      synthesizer.open();
      synthesizer.loadAllInstruments(soundfont);

      sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());
      sequencer.setSequence(new ByteArrayInputStream(nextSong));

      sequencer.start();
      isRunning = true;
    } catch (Exception e) {
      e.printStackTrace();
    }

    fadeThread = new Thread(() -> {
      while (System.currentTimeMillis() < fadeStart + fadeTime) {
        if (volume <= 90) {
          volume += 10;
          adjustVolume(volume);
        }

        try {
          Thread.sleep(fadeTime / 10);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });
    fadeThread.start();
  }

  private static void adjustVolume(int volume) {
    MidiChannel[] channels = synthesizer.getChannels();
    for (MidiChannel channel : channels) {
      channel.controlChange(7, volume);
    }
  }
}
