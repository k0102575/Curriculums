/* 클래스 변수와 인스턴스 메서드 */
package step07;

public class Test04_6 {
  
  static class Calculator {
    static int result;
  

    public void plus(int value) {
      Calculator.result += value;
    }
    
    public void minus(int value) {
      Calculator.result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_6 실행");
    System.out.println();
    
    Calculator c = new Calculator();
    c.plus(10);
    System.out.println(Calculator.result); 
    
  }

}

