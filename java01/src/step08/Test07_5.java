/* 컬렉션(Collection) 클래스 II : java.util.HashSet III */
package step08;

import java.util.HashSet;
import java.util.Iterator;

public class Test07_5{
  
  static class Book {
    String title;
    String press;
    int page;
    
    public Book(String title, String press, int page) {
      this.title = title;
      this.press = press;
      this.page = page;
    }
    
    public String toString() {
      return String.format("%s, %s, %d", title, press, page);
    }
    
    // toString 을 이용하여 출력한다. Book의 슈퍼클래스 Object에서 tostring을 가져온다.
    // 클래스명 해쉬코드를 출력한다.
    // 그래서 상속받은 tostring을 오버라이딩 한다.
  }
  
  public static void main(String[] args) {
    System.out.println("step08 Test07_5 실행");
    System.out.println();
    
    HashSet set = new HashSet(); 
    
    set.add(new Book("aaaa", "비트출판사", 100));
    set.add(new Book("bbbb", "비트출판사", 200));
    set.add(new Book("cccc", "비트출판사", 300));
    set.add(new Book("dddd", "비트출판사", 400));
    set.add(new Book("eeee", "비트출판사", 500));
    set.add(new Book("ffff", "비트출판사", 600));
    set.add(new Book("ffff", "비트출판사", 600));
    

    Iterator iterator = set.iterator();  
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println("-----------------------");
    
    System.out.println(new Book("ffff", "비트출판사", 600).hashCode());
    System.out.println(new Book("ffff", "비트출판사", 600).hashCode());
    System.out.println(new Book("ffff", "비트출판사", 600).hashCode());

  } // main
  
  
}



