/* File I/O - 바이트 스트림 클래스 - FileOutputStream IV */
package step16;

import java.io.FileOutputStream;

public class Test02_4_Out {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_4_Out 실행");
    System.out.println();
    
    FileOutputStream out = new FileOutputStream("test02_4.data");
    
    byte b = 0x11;
    out.write(b);
    
    short s = 0x2233;
    out.write(s >> 8);
    out.write(s);
    
    int i = 0x44556677;
    out.write(i >> 24);
    out.write(i >> 16);
    out.write(i >> 8);
    out.write(i);
    
    String str = "ABC가각간";
    byte[] bytes = str.getBytes("UTF-8");
    int len = bytes.length;
    
    out.write(len >> 24);
    out.write(len >> 16);
    out.write(len >> 8);
    out.write(len);
    
    out.write(bytes);
    
    out.close();
    
    System.out.println("파일 출력 완료");
  }

  private static void getBytes() {
    // TODO Auto-generated method stub
    
  }

}
