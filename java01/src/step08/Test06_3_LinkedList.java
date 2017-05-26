/* 컬렉션(Collection) 클래스 : 사용전 - 목록을 다루는 클래스 구현 */
package step08;

class Test06_3_LinkedList {
  class Bucket {
    Object value;
    Bucket next;
  }
  
  Bucket start;
  Bucket end;
  private int length;
  
  public Test06_3_LinkedList() {
   start = new Bucket();
   end = start;
  } // LinkedList() 
  
  
  public void add(Object obj) {
    end.value = obj; 
    
    Bucket temp = new Bucket();
    end.next = temp;
    end = temp;
    
    length++;
    
  } // add(obj)
  
  public void add(int index, Object obj){ 
    
    if (index < 0 || index >= length) {
      // LinkedList는 맨끝에 끼여넣는것은 불가능하다 ArrayList 와 다르다.
      throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
    }
    
    Bucket temp = new Bucket();
    temp.value = obj;
    length++;
    // 어디에 집어넣든 length는 늘려야된다.
    
    if (index == 0){
      temp.next = start;
      start = temp;
      return;
    }
    
    
    Bucket cursor = start;
    
    for (int i = 1; i < index; i++){
      cursor = cursor.next;
    }
    temp.next = cursor.next;
    cursor.next = temp;  // 그냥 add와 다르게 인덱스 앞에것을 가르켜야된다.
    
  } // add(index , obj)
  
  public Object remove(int index) {
 
    if (index < 0 || index >= length) {
      throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
    }
    
    length--;

    if (index == 0){
      Bucket temp = start;
      start = start.next;
      return temp;
    }
    
    Bucket cursor = start;
    
    for (int i = 1; i < index; i++){
      cursor = cursor.next;
    }
    
    Bucket removedObj = cursor.next;
    cursor.next = cursor.next.next;
    
    return removedObj.value;
    
  } // remove(index)
  
  
  public int size() {
    return length; // this 생략
  }
  
  public Object get(int index) {
    if (index < 0 && index >= length){       // 예외상황 검사
      throw new RuntimeException("배열의 인덱스의 범위를 벗어났습니다.");
    }
    
    Bucket cursor = start;
    
    for (int i = 0; i < index; i++){
      cursor = cursor.next;
    }
    
    return cursor.value;
  }
  
  
  public Object set(int index, Object obj){
    
    if (index < 0 || index > length) {
      throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
    }
    
    Bucket cursor = start;
    
    for (int i = 0; i < index; i++){
      cursor = cursor.next;
    }
    
    Object oldValue = cursor.value;
    cursor.value = obj;
    
    return oldValue;
    
  } // set(index,obj)
  
} // class ArrayList
