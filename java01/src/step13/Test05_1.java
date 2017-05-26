/* nested class : anonymous class
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;

import java.lang.reflect.Method;

public class Test05_1 { 
  
  public static void main(String[] args) throws Exception {
    
    Object obj = new Object() {
      int value;
      
      {
        System.out.println("인스턴스 블록...");
        value = 100;
      }
      
      public void m1() {
        System.out.println("m1()...");
        System.out.println(value);
      }
    };
    
    System.out.println("step13 Test05_1 실행");
    System.out.println();
    
    // 익명 클래스라도 직접 호출을 할수 없다
    // 클래스 도구를 사용하여 호출해야한다.
//    obj.m1();
    Class clazz = obj.getClass();
    // 변수명을 class로 못써서 비슷한 clazz로 사용한다.
    Method m = clazz.getMethod("m1");
    m.invoke(obj);
    
  }
}
