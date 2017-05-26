package step14;

public class Bucket {
  Object value; // 어떤객체의 주소라도 담을수있게 Object로 했다.
  
  public void setValue(Object value) {
    this.value = value;
  }
  
  public Object getValue() {
    return value;
  }
}
