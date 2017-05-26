/* nested class : static nested class I
 * 
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * 
 * 
 * */

package step13;
  
public class Test02_1 { 
  // 패키지 멤버 클래스
  
  // static variable
  static int v1;
  
  // static method
  static void m1() {}
  
  //static nested class (= top level nested class)
  static class A {
    int a;
  }
  
  public static void main(String[] args) {
    
    v1 = 10;
    m1();
    A obj = new A();
    
    
  }
  
  // instance method
  public void test(int v1) {
    v1 = 20;
    
    m1();
    
    A obj = new A();
  }
}
