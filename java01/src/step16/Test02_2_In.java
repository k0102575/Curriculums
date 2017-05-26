/* File I/O - 바이트 스트림 클래스 - FileInputStream II */
package step16;

import java.io.FileInputStream;

public class Test02_2_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_2_In 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    FileInputStream in = new FileInputStream("test02_2.data");
    
    byte[] bytes = new byte[1024];
    int len = 0;
    
    len = in.read(bytes);
    
    
    for (int i = 0; i < len; i++){
      System.out.printf("%x ", bytes[i]);
    }
    
    in.close();
  }

}
