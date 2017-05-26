/* 컬렉션(Collection) 클래스 : 사용자 정의 컬렉션 클래스 사용 - LinkedList */
package step08;

import java.sql.Date;

public class Test06_3{
  
  public static void main(String[] args) {
    System.out.println("step08 Test06_3 실행");
    System.out.println();
    
    Test06_3_LinkedList dateList = new Test06_3_LinkedList(); 
    
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));
    dateList.add(Date.valueOf("2017-5-9"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    System.out.println(dateList.size());
    
    dateList.add(5, Date.valueOf("2017-2-22"));

    Object removedObj = dateList.remove(3);    
    Object oldObj = dateList.set(1, Date.valueOf("2017-5-4"));
    
    for (int i = 0; i < dateList.size(); i++){
      System.out.println(dateList.get(i));
    }
    
   
    System.out.println("==>" + removedObj);
    
    System.out.println("==>" + oldObj);
   
    
  } // main
  
  
}



