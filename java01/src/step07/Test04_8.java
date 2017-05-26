/* 인스턴스 변수와 클래스 메서드 III */
package step07;

public class Test04_8 {
  
  static class Calculator {
    int result;
    
    public static void plus(int value) {
      // Calculator.this.result += value;  // 오류 인스턴스가 없는상태에서 result를 찾아야될수있기떄문에 오류이다.
      // 스태틱이 붙어서 스태틱 메서드라 하고 클래스로 접근하기 떄문에 클래스 메서드라 한다 둘다 같은말이다.
    }
    
    public void minus(int value) {
      result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_8 실행");
    System.out.println();
    
    Calculator.plus(10); // 오류 인스턴스가 없는상태에서 result를 찾아야될수있기떄문에 오류이다.
    // System.out.println(Calculator.result); 
    
  }

}

