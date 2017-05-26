/* File I/O - 바이트 스트림 클래스 - FileInputStream IV */
package step16;

import java.io.FileInputStream;

public class Test02_4_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_4_In 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    FileInputStream in = new FileInputStream("test02_4.data");
    
    byte b;
    b = (byte) in.read();
    
    short s = 0x2233;
    
    s = (short)(in.read() << 8);
    s |= (short)(in.read());
    
    int i;
    
    
    i = in.read() << 24;
    i |= in.read() << 16;
    i |= in.read() << 8;
    i |= in.read();
    
    int len;
    len = in.read() << 24;
    len |= in.read() << 16;
    len |= in.read() << 8;
    len |= in.read();
    
    byte[] buf = new byte[len];
    in.read(buf);
    String str = new String(buf, "UTF-8");
    
    System.out.printf("%x, %x, %x, %s\n", b, s, i, str);
    
    
    in.close();
  }

}
