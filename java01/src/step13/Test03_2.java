/* nested class : non static nested class (= inner class) II
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;
  
public class Test03_2 { 
  
  int v1;
  int v2;
  
  class A {
    int v1;
    public void m1() {
      this.v1 = 100;
      System.out.printf("A.v1 = %d\n", this.v1);
      
      System.out.printf("Test03_2.v2 = %d\n", v2);
//      System.out.printf("Test03_2.v2 = %d\n", this.v2); // this를 붙이면 A의 v2를 가르키는것이다.
      
      System.out.printf("A.v1 = %d\n", v1); // A 의 v1 = this.v1 과 같다
      System.out.printf("Test03_2.v1 = %d\n", Test03_2.this.v1); // 이떄는 클래스명을 적어라 원래 이게 정상이다 생략하는것 뿐이다.

    }
  }
  
  public void test() {
    A p = new A();
    p.m1();
    System.out.printf("v1=%d, v2=%d\n", this.v1, this.v2);
  }
  
  public static void main(String[] args) {
    System.out.println("step13 Test03_2 실행");
    System.out.println();
    
    Test03_2 obj = new Test03_2();
    obj.v1 = 10;
    obj.v2 = 20;
    obj.test();
    
  }
}
