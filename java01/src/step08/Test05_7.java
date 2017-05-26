/* 유틸리티 클래스 : java.util.Calendar 클래스 */
package step08;

import java.util.Calendar;

public class Test05_7{
  
  public static void main(String[] args) {
    System.out.println("step08 Test05_7 실행");
    System.out.println();
    
    // new로 꺼내면 안된다. 개발자가 그렇게 만들었다
    Calendar cal = Calendar.getInstance();
    
//    cal.get(꺼낼값);
    
    System.out.println(cal.get(1));
    System.out.println(cal.get(2) + 1); // 0 ~ 11
    System.out.println(cal.get(5));
    System.out.println(cal.get(7)); // 일(1) ~ 토(7)
    System.out.println(cal.get(10)); // 0 ~ 11
    System.out.println(cal.get(11)); // 0 ~ 23
    System.out.println(cal.get(12));
    System.out.println(cal.get(13));
    
  }
}



