package step10.ex4;

public class C extends B{
  int c;
  
  public void m2() {
    System.out.println("C.m2()");
  }
  
  public void m3() {
    System.out.println("C.m3()");
  }
  
  public void m5() {
    System.out.println("C.m5()");
  }
  
  public void test1() {
    m1(); // B.m1();
    m2(); // C.m2();
    m3(); // C.m3();
  }
  
  public void test2() {
    super.m1(); // B.m1();
    super.m2(); // B.m2();
    super.m3(); // A.m3();
    m4();       // B.m4();
    super.m4(); // B.m4();  // 자기가 재정의 한게 아니라 super가 무시된다.
    m5();       // C.m5();
//    super.m5(); // 재정의 하거나 상속 받은 메서드가 아니기 때문에 컴파일 오류!
  }
}
