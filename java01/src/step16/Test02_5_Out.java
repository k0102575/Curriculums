/* File I/O - 바이트 스트림 클래스 - MyDataOutputStream */
package step16;

public class Test02_5_Out {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_5_Out 실행");
    System.out.println();
    
    MyDataOutputStream out = new MyDataOutputStream("test02_5.data");
    
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
