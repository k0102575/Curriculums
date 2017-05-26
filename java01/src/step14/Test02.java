/* 제네릭(Generic) 문법 : 사용 후 */
package step14;

import java.util.Date;

public class Test02 {
  
  public static void main(String[] args) {
    System.out.println("step14 Test02 실행");
    System.out.println();
    
    // 1) 제네릭 클래스를 사용할 떄 타입을 지정하지 않으면 기본이 Object이다.
    Bucket2 b = new Bucket2();
    
    
    b.setValue(new String("Hello"));
    String str = (String)b.getValue();
    
    b.setValue(new java.util.Date());
    Date date = (Date)b.getValue();
        
    b.setValue(new Integer(10));
    Integer i = (Integer)b.getValue();
    
    
  }
}
