/* final: 변수에 final 붙이기 */
package step12.ex3;

public class A {
  int a;
  final int b;
  
  public A() {
    a = 10;
    b = 20;
  }
  
  public void m3() {
    b = 30;
  }
}
