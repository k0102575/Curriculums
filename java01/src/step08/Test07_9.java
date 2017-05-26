/* 컬렉션(Collection) 클래스 II : java.util.HashMap II */
package step08;

import java.util.HashMap;

public class Test07_9{
  
  static class MyKey {
    String value;
    
    public MyKey(String value) {
      this.value = value;
    }
  }
  
  static class Book {
    String title;
    String press;
    int page;
    
    public Book(String title, String press, int page) {
      this.title = title;
      this.press = press;
      this.page = page;
    } // Book(title,press,page)
    
    public String toString() {
      return String.format("%s, %s, %d", title, press, page);
    } // @Over toString()
    
  }
  
  public static void main(String[] args) {
    System.out.println("step08 Test07_9 실행");
    System.out.println();
    
    HashMap map = new HashMap(); 
    
    map.put(new MyKey("key1"), new Book("aaaa", "비트출판사", 100));
    map.put(new MyKey("key2"), new Book("bbbb", "비트출판사", 200));
    map.put(new MyKey("key3"), new Book("cccc", "비트출판사", 300));
    map.put(new MyKey("key4"), new Book("dddd", "비트출판사", 400));
    
    System.out.println(map.get(new MyKey("key1")));
    System.out.println(map.get(new MyKey("key3")));
    // 사용자 정의 데이터타입의 key1의 해쉬코드와
    // map.get의 key1이 해쉬코드가 다르다.
    
    // 왜냐면 String wrapper 클래스가 아닌 우리가 정의한 클래스니까 
    
    MyKey s1 = new MyKey("key1");
    MyKey s2 = new MyKey("key2");
    if (s1 == s2) 
      System.out.println("s1 == s2");
    else 
      System.out.println("s1 != s2");
    System.out.printf("%d, %d\n", s1.hashCode(), s2.hashCode());
    System.out.println(s1.equals(s2));
    
    
    
  } // main
  
  
}



