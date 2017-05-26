/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 */

package step16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test04_3_In {
  
  static class MyBufferedInputStream {
    InputStream in;
    byte[] buf = new byte[8192];
    int len;
    int cursor;
    
    
    MyBufferedInputStream(InputStream in) {
      this.in = in;
    }
    
    public int read() throws IOException {
      if (cursor == len){
        len = in.read(buf);
        if (len < 0)
          return -1;
        cursor = 0;
        // cursor은 실제 읽은 갯수가 리턴된다.
      }
      return buf[cursor++] & 0x000000FF;
      // ff 가 int로 리턴된다.
      // 원래 0000 0000 FF 를 리턴해야된다.
      // byte를 리턴하면 자동으로 암시적 형변환 INT로 나갈때  FF 앞이 FF FF FF로 리턴된다.
      // 
      
    } // int read()
    
    public void close() {}
    
  }
  
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test04_3_In 실행");
    System.out.println();
    
    FileInputStream in0 = new FileInputStream("temp/jls8.pdf");
    MyBufferedInputStream in = new MyBufferedInputStream(in0);
    
    int b = 0;
    int count = 0;
    
    long start = System.currentTimeMillis();
    
    while ((b = in.read()) != -1) {  
      if ((++count % 10000) == 0) System.out.print(".");
      if ((count % 500000) == 0) System.out.println();
    } // while
    
    long end = System.currentTimeMillis();
    System.out.printf("\n걸린시간 = %d", end - start);
    
    in.close();
    in0.close();
    
    // 만든 순서와 반대로 닫아라
  }

}
