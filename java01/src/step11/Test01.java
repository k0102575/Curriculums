/* 캡슐화 */
package step11;

public class Test01 {

  public static void main(String[] args) {
    System.out.println("step11 ex1 Test01 실행");
    System.out.println();
    
    Calculator1 c = new Calculator1();
    c.plus(10);
    c.plus(7);
    c.minus(3);
    
    
    c.result = 100;
    System.out.println(c.result);
    
  }

}
