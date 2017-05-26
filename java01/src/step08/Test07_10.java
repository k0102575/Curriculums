/* 컬렉션(Collection) 클래스 II : java.util.HashMap III */
package step08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test07_10{
  
  static class MyKey {
    String value;
    
    public MyKey(String value) {
      this.value = value;
    }
    
    public String toString() {
      return value;
    } // @Over String()
    
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((value == null) ? 0 : value.hashCode());
      return result;
    } // @Over hashCode()
    
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey other = (MyKey) obj;
      if (value == null) {
        if (other.value != null)
          return false;
      } else if (!value.equals(other.value))
        return false;
      return true;
    } // @Over equals()
    
  } // class MyKey
  
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
    
  } // class Book
  
  public static void main(String[] args) {
    System.out.println("step08 Test07_10 실행");
    System.out.println();
    
    HashMap map = new HashMap(); 
    
    map.put(new MyKey("key1"), new Book("aaaa", "비트출판사", 100));
    map.put(new MyKey("key2"), new Book("bbbb", "비트출판사", 200));
    map.put(new MyKey("key3"), new Book("cccc", "비트출판사", 300));
    map.put(new MyKey("key4"), new Book("dddd", "비트출판사", 400));
    
    Collection valueList = map.values();
    Iterator iterator = valueList.iterator();
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
    System.out.println("------------------------------");
    
    Set keySet = map.keySet();
    
    Object[] keyArray = keySet.toArray();
    for (int i =0; i < keyArray.length; i++){
      System.out.println(map.get(keyArray[i]));
    }
    System.out.println("------------------------------");
    
    for (Object key : keySet){
      System.out.println(map.get(key));
    }
    
    System.out.println("------------------------------");
    
    for (Object value : valueList){
      System.out.println(value);
    }
    
    System.out.println("------------------------------");
    
    Set entrySet = map.entrySet();
    for (Object object : entrySet){
      Entry entry = (Entry)object;
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }
    
  } // main
  
  
}



