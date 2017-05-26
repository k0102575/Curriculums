/* File I/O - 바이트 스트림 클래스 - FileInputStream */
package step16;

import java.io.FileInputStream;

public class Test02_1_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_1_In 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    FileInputStream in = new FileInputStream("test02_1.data");
    
    int b = in.read();
    
    System.out.printf("%x ", b);
    
    b = in.read();
    
    System.out.printf("%x ", b);
    
    b = in.read();
    
    System.out.printf("%x ", b);
    
    
    in.close();
  }

}
