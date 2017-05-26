/* 데이터 프로세싱 스트림 클래스 - ObjectOutputStream 도입 전 */

package step16;

import java.io.FileOutputStream;

public class Test05_1_Out {
  
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test05_1_Out 실행");
    System.out.println();
    
    Student s = new Student("홍길동", 100, 90, 80, false);
    
    FileOutputStream out0 = new FileOutputStream("temp/test05_1.data");
    java.io.DataOutputStream out = new java.io.DataOutputStream(out0);
    // 여러개의 데이터를 출력하기 위해서 DataOutputStream을 쓴다.
    
    out.writeUTF(s.name);
    out.writeInt(s.kor);
    out.writeInt(s.eng);
    out.writeInt(s.math);
    out.writeFloat(s.aver);
    out.writeBoolean(s.working);
    
    out.close();
    out0.close();
  }

}
