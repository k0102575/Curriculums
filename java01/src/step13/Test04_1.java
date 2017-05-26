/* nested class : local class
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;
  
public class Test04_1 { 
  
  public static void main(String[] args) {
    
    class A {
      int a;
    }
    
    A obj = new A();
    obj.a = 200;
    
  }
  
  public static void test() {
//    A obj = new A();
  }
}
