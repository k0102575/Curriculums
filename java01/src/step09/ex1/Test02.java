/* 상속 문법을 사용하기 전 II */

package step09.ex1;

public class Test02 {
  
  public static void main(String[] args) {
    System.out.println("step09 ex1 Test02 실행");
    System.out.println();
    
    AdvancedCalculator calc = new AdvancedCalculator();
    calc.plus(100);
    calc.plus(20);
    calc.minus(30);
    calc.multiple(2);
    
    System.out.println(calc.result);
    
  }
}
