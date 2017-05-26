/* 인스턴스 메서드와 this 변수 */
package step07;

public class Test04_2 {
  
  static class Calculator {
    int result;
  
    Calculator(int value) {
      result = value;
    }
    
    public void plus(int value) {
      result += value;
    }
    
    public void minus(int value) { // 파라미터와 인스턴스를 구분하기 위해서 this.를 붙인다.
                                   // 로컬변수와 이름이 달라서 해깔리지 않는다면 this.를 생략한다.
      result -= value;
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_2 실행");
    System.out.println();
    
    Calculator c1 = new Calculator(10);  
    // 기본생성자가 없었을때는 값을 넘겨주지 않아도 되었다 기본생성자가 생기고 기본생성자가
    // 값을 받아야되기 떄문에 값을 넘겨주어야된다.

    c1.plus(10);
   
    System.out.println(c1.result);
    
    
  }

}

