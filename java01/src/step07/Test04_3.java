/* 인스턴스 메서드와 this 변수 II */
package step07;

public class Test04_3 {
  
  static class Calculator {
    int result;
  
    Calculator(int value) {
      Calculator.this.result = value;
    }
    
    public void plus(int value) {
      Calculator.this.result += value;
    }
    
    public void minus(int value) {
      Calculator.this.result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_3 실행");
    System.out.println();
    
    Calculator c1 = new Calculator(10);  
    // 기본생성자가 없었을때는 값을 넘겨주지 않아도 되었다 기본생성자가 생기고 기본생성자가
    // 값을 받아야되기 떄문에 값을 넘겨주어야된다.

    c1.plus(10);
   
    System.out.println(c1.result);
    
    
  }

}

