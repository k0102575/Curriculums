package step16;


import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStream{
  OutputStream out;
  
  public DataOutputStream(OutputStream out){
    this.out = out;
  }
  
  public void writeByte(int b) throws IOException{
    out.write(b);
  }
  
  public void writeShort(int b) throws IOException{
    out.write(b >> 8);
    out.write(b);
  }
  
  public void writeInt(int b) throws IOException{
    out.write(b >> 24);
    out.write(b >> 16);
    out.write(b >> 8);
    out.write(b);
  }
  
  public void writeUTF(String str) throws IOException{
    byte[] bytes = str.getBytes("UTF-8");
    int len = bytes.length;
    // 문자열 크기를 2바이트 정도만 넘긴다.
    // 배열이 아무리 커봐야 65500자가 안될꺼라 가정한다.
    out.write(len >> 8);
    out.write(len);
    out.write(bytes);
  }
  
  public void close() throws IOException {
    out.close();
  }
  
}
