/* 데이터 프로세싱 스트림 클래스 - ObjectInputStream 도입 후 */

package step16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test05_3_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test05_3_In 실행");
    System.out.println();
    
    FileInputStream in0 = new FileInputStream("temp/test05_3.data");
    ObjectInputStream in = new ObjectInputStream(in0);
    
    Student3 s = (Student3) in.readObject();
    
    in.close();
    in0.close();
    
    System.out.println(s);
    s.compute();
    System.out.println(s);
  }
  
}
