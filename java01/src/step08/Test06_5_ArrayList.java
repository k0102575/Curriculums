/* 목록을 다루는 클래스 구현 : 제네릭 적용*/
package step08;

class Test06_5_ArrayList <T>{
  
  public static final int DEFAULT_SIZE = 3; 
  static final public int GROW_SIZE = 3;

  private T[] list; 
  private int length;
  
  public Test06_5_ArrayList() {
    list = (T[])new Object[DEFAULT_SIZE];
  } // ArrayList()
  
  public Test06_5_ArrayList(int capacity) {
    if (capacity < DEFAULT_SIZE || capacity > GROW_SIZE) {  
      list = (T[])new Object[DEFAULT_SIZE];
    } else {
    list = (T[])new Object[capacity];
    }
  } // ArrayList(capacity)
  
  public void add(T obj) {
    list[length++] = obj;
    if (length == list.length) {
    increaseList();
    }
  } // add(obj)
  
  public void add(int index, T obj){ 
    // 배열의 중간에 넣겠다.
    // 배열이 꽉차 있으면 늘려야되고 1개라도 남아있으면 그냥 밀어넣는다.
    
    if (length == list.length) {
      increaseList();
    }
    
    if (index < 0 || index > length) {
      throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
    }
    
    if (index < length) {
      for (int i = length; i > index; i--){
        list[i] = list[i - 1];
      }
    } 
    
    list[index] = obj;
    length++;
  } // add(index , obj)
  
  public T remove(int index) {
    
    if (index < 0 || index > length) {
      throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
    }
    
    T removedObj = list[index];
    // 지우려는 값을 보관시켜놓는다 
    
    if (index < (length - 1)) {
      for (int i = index; i < (length - 1); i++){
        list[i] = list[i+1];
      }
    }
    length--;
    return removedObj;
    // 굳이 청소할 필요가 없다 그냥 length만 줄여서 배열의 최대 사이즈만 바꾸면된다.
    // 뭘 없앴는지 리턴한다.
  }
  
  private void increaseList() {
    T[] newList = (T[])new Object[list.length + GROW_SIZE];
    for (int i = 0; i < list.length; i++){
      newList[i] = list[i];
    }
    list = newList; // list에다가 새 배열의 주소를 담아라
  } // increaseList()
  
  public int size() {
    return length; // this 생략
  }
  
  public T get(int index) {
    if (index < 0 && index >= length){       // 예외상황 검사
      throw new RuntimeException("배열의 인덱스의 범위를 벗어났습니다.");
    }
    
    return list[index];
  }
  
  
  public T set(int index, T obj){
    if (index < 0 || index > length) {
      throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
    }
    
    T oldObj = list[index];
    // 바꾸기전 인덱스를 따로 저장한다.
    list[index] = obj;
    return oldObj;
    
  }
  
} // class ArrayList
