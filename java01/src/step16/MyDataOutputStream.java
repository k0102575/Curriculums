package step16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyDataOutputStream extends FileOutputStream{

  public MyDataOutputStream(String name) throws FileNotFoundException {
    super(name);
  }
  
  public void writeByte(int b) throws IOException{
    this.write(b);
  }
  
  public void writeShort(int b) throws IOException{
    this.write(b >> 8);
    this.write(b);
  }
  
  public void writeInt(int b) throws IOException{
    this.write(b >> 24);
    this.write(b >> 16);
    this.write(b >> 8);
    this.write(b);
  }
  
  public void writeUTF(String str) throws IOException{
    byte[] bytes = str.getBytes("UTF-8");
    int len = bytes.length;
    // 문자열 크기를 2바이트 정도만 넘긴다.
    // 배열이 아무리 커봐야 65500자가 안될꺼라 가정한다.
    this.write(len >> 8);
    this.write(len);
    this.write(bytes);
  }
  
  
}
