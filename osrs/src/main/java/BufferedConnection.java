import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BufferedConnection implements Runnable {

  public int anInt379;
  public byte aByte380;
  public InputStream inputStream;
  public OutputStream outputStream;
  public Socket socket;
  public boolean dummy;
  public GameStub gameStub;
  public byte[] buffer;
  public int cycle;
  public int bufferIndex;
  public boolean writeIndex;
  public boolean erred;
  public BufferedConnection(Socket socket, GameStub gameStub)
      throws IOException {
    dummy = false;
    writeIndex = false;
    erred = false;
    this.gameStub = gameStub;
    this.socket = socket;
    this.socket.setSoTimeout(30000);
    this.socket.setTcpNoDelay(true);
    inputStream = this.socket.getInputStream();
    outputStream = this.socket.getOutputStream();
  }

  public void close() {
    dummy = true;
    try {
      if (inputStream != null) {
        inputStream.close();
      }
      if (outputStream != null) {
        outputStream.close();
      }
      if (socket != null) {
        socket.close();
      }
    } catch (IOException _ex) {
      System.out.println("Error closing stream");
    }
    writeIndex = false;
    synchronized (this) {
      notify();
    }
    buffer = null;
  }

  public int read() throws IOException {
    if (dummy) {
      return 0;
    } else {
      return inputStream.read();
    }
  }

  public int available() throws IOException {
    if (dummy) {
      return 0;
    } else {
      return inputStream.available();
    }
  }

  public void read(byte[] buffer, int offset, int length) throws IOException {
    if (dummy) {
      return;
    }
    int k;
    for (; length > 0; length -= k) {
      k = inputStream.read(buffer, offset, length);
      if (k <= 0) {
        throw new IOException("EOF");
      }
      offset += k;
    }

  }

  public void write(int i, int j, int k, byte[] data) throws IOException {
    if (dummy) {
      return;
    }
    if (erred) {
      erred = false;
      throw new IOException("Error in writer thread");
    }
    if (buffer == null) {
      buffer = new byte[5000];
    }
    synchronized (this) {
      for (int l = 0; l < j; l++) {
        buffer[bufferIndex] = data[l + k];
        bufferIndex = (bufferIndex + 1) % 5000;
        if (bufferIndex == (cycle + 4900) % 5000) {
          throw new IOException("buffer overflow");
        }
      }

      if (!writeIndex) {
        writeIndex = true;
        gameStub.method12(this, 3);
      }
      notify();
    }
    if (i == 0) {
    }
  }

  @Override
  public void run() {
    while (writeIndex) {
      int i;
      int j;
      synchronized (this) {
        if (bufferIndex == cycle) {
          try {
            wait();
          } catch (InterruptedException _ex) {
          }
        }
        if (!writeIndex) {
          return;
        }
        j = cycle;
        if (bufferIndex >= cycle) {
          i = bufferIndex - cycle;
        } else {
          i = 5000 - cycle;
        }
      }
      if (i > 0) {
        try {
          outputStream.write(buffer, j, i);
        } catch (IOException _ex) {
          erred = true;
        }
        cycle = (cycle + i) % 5000;
        try {
          if (bufferIndex == cycle) {
            outputStream.flush();
          }
        } catch (IOException _ex) {
          erred = true;
        }
      }
    }
  }

  public void debug() {
    System.out.println("dummy:" + dummy);
    System.out.println("tcycl:" + cycle);
    System.out.println("tnum:" + bufferIndex);
    System.out.println("writer:" + writeIndex);
    System.out.println("ioerror:" + erred);
    try {
      System.out.println("available:" + available());
    } catch (IOException _ex) {
    }
  }

}