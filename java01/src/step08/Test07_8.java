/* 컬렉션(Collection) 클래스 II : java.util.HashMap I */
package step08;

import java.util.HashMap;

public class Test07_8{
  
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
    System.out.println("step08 Test07_8 실행");
    System.out.println();
    
    HashMap map = new HashMap(); 
    
    map.put(new String("key1"), new Book("aaaa", "비트출판사", 100));
    map.put("key2", new Book("bbbb", "비트출판사", 200));
    map.put("key3", new Book("cccc", "비트출판사", 300));
    map.put("key4", new Book("dddd", "비트출판사", 400));
    map.put(new Integer(1), new Book("eeee", "비트출판사", 500)); 
    // auto-boxing 키 값은 레퍼런스 변수여야한다 1은 정수값이다.
    // jvm이 자동으로 auto-boxing해서 Integer객체로 넣는다.
    // 마이바티스에서 적용된다.
    map.put(2, new Book("ffff", "비트출판사", 600));
    map.put(3, new Book("ffff", "비트출판사", 600));
    
    System.out.println(map.get(new String("key1")));
    System.out.println(map.get(1));
    
    // String 에서는 hashcode() 를 오버라이딩 되어있다.
    // 같은 hash value를 가지면 같은 주소를 리턴한다.
    // 현업에서는 String 클래스나 integer클래스를 주로쓴다.
    
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    if (s1 == s2) 
      System.out.println("s1 == s2");
    else 
      System.out.println("s1 != s2");
    System.out.printf("%d, %d\n", s1.hashCode(), s2.hashCode());
    System.out.println(s1.equals(s2));
    
    
    
    
  } // main
  
  
}



