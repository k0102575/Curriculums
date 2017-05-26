/* 상속 문법을 사용한 후 I */

package step09.ex2;

public class Test01 {
  
  public static void main(String[] args) {
    System.out.println("step09 ex2 Test01 실행");
    System.out.println();
    
    BasicCalculator calc = new BasicCalculator();
    calc.plus(100);
    calc.plus(20);
    calc.minus(30);
    
    System.out.println(calc.result);
    
  }
}
