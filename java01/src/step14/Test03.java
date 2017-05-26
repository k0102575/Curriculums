/* 제네릭(Generic) 문법 : 사용 후 II */
package step14;

import java.util.Date;

public class Test03 {
  
  public static void main(String[] args) {
    System.out.println("step14 Test02 실행");
    System.out.println();
    
    // 2) 타입을 지정해보자!
//    Bucket2<String> b = new Bucket2<String>();
    // 둘다 된다. java 7버전 이상부터
    Bucket2<String> b = new Bucket2<>();
    
    b.setValue(new String("Hello"));
    String str = (String)b.getValue();
    System.out.println(str);
    
//    
//    b.setValue(new Date());
//    b.setValue(new Integer(10));
    
    
  }
}
