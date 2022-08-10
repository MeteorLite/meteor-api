package audio;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {

  static Soundbank soundfont;
  static Sequencer sequencer;
  static Synthesizer synthesizer;

  private static boolean isRunning = false;

  private static int volume = 100;

  private static int fadeTime = 3000;

  private static Thread fadeThread;

  public static void playSound(byte[] sound)
      throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    AudioSystem.getAudioInputStream(new ByteArrayInputStream(sound));

    AudioInputStream stream;
    AudioFormat format;
    DataLine.Info info;
    Clip clip;

    stream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(sound));
    format = stream.getFormat();
    info = new DataLine.Info(Clip.class, format);
    clip = (Clip) AudioSystem.getLine(info);
    clip.open(stream);
    clip.start();
  }

  public static void playSong(byte[] song) {
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
        fadeOut(song);
      } else {

        volume = 100;

        sequencer = MidiSystem.getSequencer(false);
        synthesizer = MidiSystem.getSynthesizer();

        sequencer.open();
        synthesizer.open();
        synthesizer.loadAllInstruments(soundfont);

        sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());
        sequencer.setSequence(new ByteArrayInputStream(song));

        adjustVolume(volume);

        sequencer.start();
        isRunning = true;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void fadeOut(final byte[] nextSong) {
    final long fadeStart = System.currentTimeMillis();
    fadeThread = new Thread(new Runnable() {
      @Override
      public void run() {
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

  public static void kill() {
    if (synthesizer != null)
      synthesizer.close();
  }
}
