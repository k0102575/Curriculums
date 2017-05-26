/* 데이터 프로세싱 스트림 클래스 - 직렬화 와 transient 변경자 */

package step16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test05_3_Out {
  
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test05_3_Out 실행");
    System.out.println();
    
    Student3 s = new Student3("홍길동", 100, 90, 80, false);
    
    FileOutputStream out0 = new FileOutputStream("temp/test05_3.data");
    ObjectOutputStream out = new ObjectOutputStream(out0);
    
    out.writeObject(s);
    
    out.close();
    out0.close();
  }

}
