/* File I/O - 바이트 스트림 클래스 - DataInputStream */
package step16;

import java.io.FileInputStream;

public class Test02_6_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_6_In 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    FileInputStream in0 = new FileInputStream("test02_6.data");
    DataInputStream in = new DataInputStream(in0);
    
    byte b = in.readByte();
    short s = in.readShort();
    int i = in.readInt();
    String str = in.readUTF();
    
    System.out.printf("%x, %x, %x, %s\n", b, s, i, str);
    
    in.close();
  }

}
