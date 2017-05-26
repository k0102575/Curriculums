/* File I/O - 바이트 스트림 클래스 - FileOutputStream */
package step16;

import java.io.FileOutputStream;

public class Test02_1_Out {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_1_Out 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    FileOutputStream out = new FileOutputStream("test02_1.data");
    
    
    out.write(0x66778899);
    out.write(0x77665544);
    out.write(0x12345678);
    
    out.close();
  }

}
