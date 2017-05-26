/* 컬렉션(Collection) 클래스 : 사용전 - 목록을 다루는 클래스 구현 */
package step08;

import java.sql.Date;

public class Test06_2{
  
  public static void main(String[] args) {
    System.out.println("step08 Test06_2 실행");
    System.out.println();
    
    Test06_2_ArrayList dateList = new Test06_2_ArrayList(); 
    
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));
    dateList.add(Date.valueOf("2017-5-9"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    dateList.add(2, Date.valueOf("2017-2-22"));
    Object removedObj = dateList.remove(3);
    
    Object oldObj = dateList.set(1, Date.valueOf("2017-5-4"));
    
    for (int i = 0; i < dateList.size(); i++){
      System.out.println(dateList.get(i));
    }
    
    System.out.println("==>" + removedObj);
    System.out.println("==>" + oldObj);
    
  } // main
  
  
}



