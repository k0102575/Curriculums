/* 클래스 변수와 인스턴스 메서드 II */
package step07;

public class Test04_7 {
  
  static class Calculator {
    static int result;
  
    public void plus(int value) {
      result += value; 
      // 로컬변수가 아닌것은 무조건 클래스명.this.변수명이 붙는다.
      // 클래스변수면 클래스명.변수 인스턴스면 this.변수명을 꼭적어라 유지보수하기 편하게
    }
    
    public void minus(int value) {
      result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_7 실행");
    System.out.println();
    
    Calculator c = new Calculator();
    c.plus(10);
    System.out.println(Calculator.result); 
    
  }

}

