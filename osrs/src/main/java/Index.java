import java.io.IOException;
import java.io.RandomAccessFile;

public class Index {

  public static byte[] buffer = new byte[520];
  public RandomAccessFile data;
  public RandomAccessFile index;
  public int storeId;
  public int maximumFileSize;

  public Index(RandomAccessFile index, RandomAccessFile data, int storeId,
      int maximumFileSize) {
    this.maximumFileSize = 65000;
    this.storeId = storeId;
    this.data = data;
    this.index = index;
    this.maximumFileSize = maximumFileSize;
  }

  public synchronized byte[] decompress(int pos) {
    try {
      seek(this.index, pos * 6);
      int offset;
      for (int index = 0; index < 6; index += offset) {
        offset = this.index.read(buffer, index, 6 - index);
        if (offset == -1) {
          return null;
        }
      }

      int fileSize = ((buffer[0] & 0xff) << 16)
          + ((buffer[1] & 0xff) << 8) + (buffer[2] & 0xff);
      int sector = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8)
          + (buffer[5] & 0xff);
      if (fileSize < 0 || fileSize > maximumFileSize) {
        return null;
      }
      if (sector <= 0 || (long) sector > data.length() / 520L) {
        return null;
      }
      byte[] buf = new byte[fileSize];
      int read = 0;
      for (int part = 0; read < fileSize; part++) {
        if (sector == 0) {
          return null;
        }
        seek(data, sector * 520);
        int index_ = 0;
        int unread = fileSize - read;
        if (unread > 512) {
          unread = 512;
        }
        int offset_;
        for (; index_ < unread + 8; index_ += offset_) {
          offset_ = data.read(buffer, index_, unread + 8 - index_);
          if (offset_ == -1) {
            return null;
          }
        }

        int currentIndex = ((buffer[0] & 0xff) << 8)
            + (buffer[1] & 0xff);
        int currentPart = ((buffer[2] & 0xff) << 8)
            + (buffer[3] & 0xff);
        int nextSector = ((buffer[4] & 0xff) << 16)
            + ((buffer[5] & 0xff) << 8) + (buffer[6] & 0xff);
        int currentFile = buffer[7] & 0xff;
        if (currentIndex != pos || currentPart != part
            || currentFile != storeId) {
          return null;
        }
        if (nextSector < 0 || (long) nextSector > data.length() / 520L) {
          return null;
        }
        for (int i = 0; i < unread; i++) {
          buf[read++] = buffer[i + 8];
        }

        sector = nextSector;
      }

      return buf;
    } catch (IOException _ex) {
      return null;
    }
  }

  public synchronized boolean put(byte[] data, int length, int index) {
    boolean exists = putInternal(data, index, true, length);
    if (!exists) {
      exists = putInternal(data, index, false, length);
    }
    return exists;
  }

  public synchronized boolean putInternal(byte[] data, int index,
      boolean exists, int length) {
    try {
      int sector;
      if (exists) {
        seek(this.index, index * 6);
        int offset;
        for (int off = 0; off < 6; off += offset) {
          offset = this.index.read(buffer, off, 6 - off);
          if (offset == -1) {
            return false;
          }
        }

        sector = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8)
            + (buffer[5] & 0xff);
        if (sector <= 0 || (long) sector > this.data.length() / 520L) {
          return false;
        }
      } else {
        sector = (int) ((this.data.length() + 519L) / 520L);
        if (sector == 0) {
          sector = 1;
        }
      }
      buffer[0] = (byte) (length >> 16);
      buffer[1] = (byte) (length >> 8);
      buffer[2] = (byte) length;
      buffer[3] = (byte) (sector >> 16);
      buffer[4] = (byte) (sector >> 8);
      buffer[5] = (byte) sector;
      seek(this.index, index * 6);
      this.index.write(buffer, 0, 6);
      int written = 0;
      for (int part = 0; written < length; part++) {
        int nextSector = 0;
        if (exists) {
          seek(this.data, sector * 520);
          int index_;
          int off;
          for (index_ = 0; index_ < 8; index_ += off) {
            off = this.data.read(buffer, index_, 8 - index_);
            if (off == -1) {
              break;
            }
          }

          if (index_ == 8) {
            int currentIndex = ((buffer[0] & 0xff) << 8)
                + (buffer[1] & 0xff);
            int currentPart = ((buffer[2] & 0xff) << 8)
                + (buffer[3] & 0xff);
            nextSector = ((buffer[4] & 0xff) << 16)
                + ((buffer[5] & 0xff) << 8)
                + (buffer[6] & 0xff);
            int currentFile = buffer[7] & 0xff;
            if (currentIndex != index || currentPart != part
                || currentFile != storeId) {
              return false;
            }
            if (nextSector < 0
                || (long) nextSector > this.data.length() / 520L) {
              return false;
            }
          }
        }
        if (nextSector == 0) {
          exists = false;
          nextSector = (int) ((this.data.length() + 519L) / 520L);
          if (nextSector == 0) {
            nextSector++;
          }
          if (nextSector == sector) {
            nextSector++;
          }
        }
        if (length - written <= 512) {
          nextSector = 0;
        }
        buffer[0] = (byte) (index >> 8);
        buffer[1] = (byte) index;
        buffer[2] = (byte) (part >> 8);
        buffer[3] = (byte) part;
        buffer[4] = (byte) (nextSector >> 16);
        buffer[5] = (byte) (nextSector >> 8);
        buffer[6] = (byte) nextSector;
        buffer[7] = (byte) storeId;
        seek(this.data, sector * 520);
        this.data.write(buffer, 0, 8);
        int unwritten = length - written;
        if (unwritten > 512) {
          unwritten = 512;
        }
        this.data.write(data, written, unwritten);
        written += unwritten;
        sector = nextSector;
      }

      return true;
    } catch (IOException _ex) {
      return false;
    }
  }

  public synchronized void seek(RandomAccessFile file, int position)
      throws IOException {
    if (position < 0 || position > 0x3c00000) {
      System.out.println("Badseek - pos:" + position + " len:"
          + file.length());
      position = 0x3c00000;
      try {
        Thread.sleep(1000L);
      } catch (Exception _ex) {
      }
    }
    file.seek(position);
  }

}