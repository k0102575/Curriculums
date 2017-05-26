/* nested class : non static nested class (= inner class)
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;
  
public class Test03_1 { 
  
  // 인스턴스 멤버들
  int a;
  public void m1() {}
  
  class A {
    int a;
  }
  // inner class 도 인스턴스 맴버다
  
  public void test() {
    
    a = 20;
    m1();
    A obj = new A();
    obj.a = 200;
    // 인스턴스 블록안에서는 인스턴스 멤버를 사용할수 있다.
  }
  
  public static void main(String[] args) {
    
    Test03_1 obj = new Test03_1();
    obj.test();
    // 인스턴스 멤버를 사용하려면 그 앞에 인스턴스 를 적어야된다.
    
//    test();
    obj.a = 20;
    obj.m1();
    obj.test();
    
    A obj3 = obj.new A();
    // 실제 사용하지는 않는다. 알아만 둬라
    // 스태틱에서 이렇게 사용하지 않는다.
  }
}
