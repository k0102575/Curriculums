/* nested class (=inner class) 
 * 
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * 
 * 
 * */

package step13;
  
public class Test01 {
  
  //static nested class (= top level nested class)
  
  static class A {}
  
  // non-static nested class (member inner class)
  class B {}

  public static void main(String[] args) {
    
    // local class
    class C {}
    
    // anonymous class
    Object obj = new Object() {};
    
    Runnable obj2 = () -> {};
    
  }

}
