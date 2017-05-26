/* 컬렉션(Collection) 클래스 II : java.util.ArrayList */
package step08;

import java.sql.Date;
import java.util.ArrayList;

public class Test07_1{
  
  public static void main(String[] args) {
    System.out.println("step08 Test07_1 실행");
    System.out.println();
    
    ArrayList dateList = new ArrayList(); 
    
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));
    dateList.add(Date.valueOf("2017-5-9"));    
    Date d1 = Date.valueOf("2017-6-6");
    dateList.add(d1);
    dateList.add(d1);
    
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



