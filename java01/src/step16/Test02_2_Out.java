/* File I/O - 바이트 스트림 클래스 - FileOutputStream II */
package step16;

import java.io.FileOutputStream;

public class Test02_2_Out {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_2_Out 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    FileOutputStream out = new FileOutputStream("test02_2.data");
    
    byte[] bytes = {0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77};
    out.write(bytes);
    
    out.close();
    
    System.out.println("파일 출력 완료");
  }

}
