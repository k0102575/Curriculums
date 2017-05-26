/* File I/O - 바이트 스트림 클래스 - FileOutputStream */
package step16;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test03_1 {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test03_1 실행");
    System.out.println();
    
//    byte[] buf = new byte[3];
//    buf[0] = 0x99;
//    buf[1]] = 0x44;
//    buf[2] = 0x78;
    
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    out.write(0x66778899);
    out.write(0x77665544);
    out.write(0x12345678);
    
    byte[] buf = out.toByteArray();
    
    out.close();
    
    // streaming API
    // 이전 data를 읽고 쓰는 대상에 상관없이 일괄된 방법을 사용한다.
    
    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    
    int b = 0;
    while (true){
      b = in.read();
      if (b == -1)
        break;
      System.out.printf("%x ", b);
      
      in.close();
    }
    /*
    for (byte b : buf) {
      System.out.printf("%x ", b);
    }
    */
    
  }

}
