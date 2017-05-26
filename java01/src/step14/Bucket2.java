package step14;

public class Bucket2<T> {
  // <T> 타입정보를 받을 변수
  // 타입 = Primitive type, class type, interface type
  T value;
  
  public void setValue(T value) {
    this.value = value;
  }
  
  public T getValue() {
    return value;
  }
}
