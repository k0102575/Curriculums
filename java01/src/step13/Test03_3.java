/* nested class : non static nested class (= inner class) III
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;
  
public class Test03_3 { 
  
  int v1 = 100;
  int v2 = 300;
  
  class A {
    int v1 = 200;
    
    public void m1() {
      System.out.printf("A.v1 = %d\n", v1);
      System.out.printf("A.v1 = %d\n", this.v1);
      System.out.printf("A.v1 = %d\n", A.this.v1);
      System.out.printf("Test03_3.v1 = %d\n", Test03_3.this.v1);
      
      System.out.printf("Test03_3.v2 = %d\n", v2);
      // 그냥 적을떄는 this를 적으며 안된다.
      // this 를 적으려면 바깥 클래스 명을 적어야된다.
      
    }
  } 
  
  public static void main(String[] args) {
    System.out.println("step13 Test03_3 실행");
    System.out.println();
    
    Test03_3 obj = new Test03_3();
    A obj2 = obj.new A();
    obj2.m1();
    
  }
}
