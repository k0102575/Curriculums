/* 유틸리티 클래스 : java.sql.date 클래스 */
package step08;

import java.sql.Date;

public class Test05_5{
  
  public static void main(String[] args) {
    System.out.println("step08 Test05_5 실행");
    System.out.println();
    
    //1) 먼저 현재 시간을 밀리초로 알아낸다.
    long currTime = System.currentTimeMillis();
    Date today = new Date(currTime);
    
    System.out.println(today);
    
    
  }
}



