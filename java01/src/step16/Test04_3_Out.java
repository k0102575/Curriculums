/* 데이터 프로세싱 스트림 클래스 - BufferedOutputStream 도입 후 */

package step16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04_3_Out {
  
  static class MyBufferedOutputStream {
    OutputStream out;
    int b;
    byte[] buf = new byte[8192];
    int cursor;
    
    MyBufferedOutputStream(OutputStream out) {
     this.out = out;
    }
    
    public void write(int b) throws IOException{
      buf[cursor++] = (byte) b;
      
      if (cursor == buf.length){
        out.write(buf);
        cursor = 0;
      }
    } // write()
    
    public void flush() throws IOException {
       out.write(buf, 0, cursor);
       // 0부터 커서가 가르키는 위치 
       // 중간에 것을 출력하는 것이다.
       
    } // flush()
    
    public void close() {};
  } // class MyBufferedOutputStream

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test04_3_Out 실행");
    System.out.println();
    
    FileOutputStream out0 = new FileOutputStream("temp/test04_1.data");
    MyBufferedOutputStream out = new MyBufferedOutputStream(out0);
    
    int b = 0;
    int count = 0;
    int countPoint = 0;
    
    long start = System.currentTimeMillis();
    
    for (int i = 1; i < 4000000; i++){
      out.write(i);
      if((i % 10000) == 0) System.out.print(".");
      if ((i % 500000) == 0) System.out.println();
    } // for
    
    out.flush();
    
    long end = System.currentTimeMillis();
    System.out.printf("\n걸린시간 = %d", end - start);
    
    out.close();
    out0.close();
    
  }

}
