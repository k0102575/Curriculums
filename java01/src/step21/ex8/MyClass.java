package step21.ex8;

public class MyClass implements B, C/*, E */{
  
  // 슈퍼 인터페이스 A의 메서드 구현
  public void m1() {};
  
  public void m2() {};
  
  public void m3() {};
  
  // B에 선언된 메서드 구현
  public void m4() {};
//  public void m5() {}; // 서로 난리친다. 이런 경우 조심해라 리턴타입으로 구분할수 없다.
//  public int m5() {}; // 서로 난리친다.
  public void m5() {};

  
  // C에 선언된 메서드 구현
  public void m6() {};
  
}
