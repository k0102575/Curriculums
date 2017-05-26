/* File I/O - 바이트 스트림 클래스 - MyDataOutputStream */
package step16;

import java.io.FileOutputStream;

public class Test02_6_Out {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_6_Out 실행");
    System.out.println();
    
    FileOutputStream out0 = new FileOutputStream("test02_6.data");
    DataOutputStream out = new DataOutputStream(out0);
    
    byte b = 0x11;
    out.writeByte(b);
    
    short s = 0x2233;
    out.writeShort(s);
    
    int i = 0x44556677;
    out.writeInt(i);
    
    String str = "ABC가각간";
    out.writeUTF(str);
    
    out.close();
    
    System.out.println("파일 출력 완료");
    
  }

}
