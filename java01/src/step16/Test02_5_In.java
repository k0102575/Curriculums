/* File I/O - 바이트 스트림 클래스 - MyDataInputStream */
package step16;

public class Test02_5_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test02_5_In 실행");
    System.out.println();
    
    // 1) FileOutputStream 객체 생성
    MyDataInputStream in = new MyDataInputStream("test02_5.data");
    
    byte b = in.readByte();
    short s = in.readShort();
    int i = in.readInt();
    String str = in.readUTF();
    
    System.out.printf("%x, %x, %x, %s\n", b, s, i, str);
    
    in.close();
  }

}
