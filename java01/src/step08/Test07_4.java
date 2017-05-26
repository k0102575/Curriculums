/* 컬렉션(Collection) 클래스 II : java.util.HashSet II */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_4{
  
  public static void main(String[] args) {
    System.out.println("step08 Test07_4 실행");
    System.out.println();
    
    HashSet set = new HashSet(); 
    
    set.add(new String("홍길동"));
    set.add(new String("임꺽정"));
    set.add(new String("유관순"));
    set.add(new String("윤봉길"));
    set.add(new String("안중근"));
    set.add(new String("김구"));
    set.add(new String("김구"));
    
    System.out.println(new String("김구").hashCode());
    System.out.println(new String("김구").hashCode());
    
    Iterator iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    
  } // main
  
  
}



