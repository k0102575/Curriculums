/* 클래스 변수와 클래스 메서드 */
package step07;

public class Test04_4 {
  
  static class Calculator {
    static int result;
  
    Calculator(int value) {
      Calculator.result = value;
    }
    
    public static void plus(int value) {
      Calculator.result += value;
    }
    
    public static void minus(int value) {
      Calculator.result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_4 실행");
    System.out.println();
    
    Calculator.plus(10);
    System.out.println(Calculator.result); 
    
  }

}

