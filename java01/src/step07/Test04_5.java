/* 클래스 변수와 클래스 메서드 II */
package step07;

public class Test04_5 {
  
  static class Calculator {
    static int result;
  

    public static void plus(int value) {
      result += value;
    }
    
    public static void minus(int value) {
      result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_5 실행");
    System.out.println();
    
    Calculator.plus(10);
    System.out.println(Calculator.result); 
    
  }

}

