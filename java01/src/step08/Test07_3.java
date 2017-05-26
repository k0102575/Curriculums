/* 컬렉션(Collection) 클래스 II : java.util.HashSet */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_3{
  
  public static void main(String[] args) {
    System.out.println("step08 Test07_3 실행");
    System.out.println();
    
    HashSet dateSet = new HashSet(); 
    
    dateSet.add(Date.valueOf("2017-3-1"));
    dateSet.add(Date.valueOf("2017-5-3"));
    dateSet.add(Date.valueOf("2017-5-5"));
    dateSet.add(Date.valueOf("2017-5-9"));
    Date d1 = Date.valueOf("2017-6-6");
    dateSet.add(d1);
    dateSet.add(d1);
    
    Object[] valueList = dateSet.toArray();  //  날짜가있는 컬렉션객체를 배열로 받는다.
    
    for(int i = 0; i < valueList.length; i++){
      System.out.println(valueList[i]);
    }
    
    System.out.println("----------------------");
    
    Iterator iterator = dateSet.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    
  } // main
  
  
}



