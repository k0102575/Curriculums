/* 클래스 메서드들 끼리 호출하기 */
package step07;

public class Test04_10 {
  
  static class Calculator {
    int value;
    
    Calculator(int value) {
      this.value = value;  
      // 로컬변수(레퍼런스) 와 인스턴스변수를 구분하기 위해 
      // this를 생략하면 로컬변수가 로컬변수에 값을 넣어버린다.
    }
    
    public void m1() {
      m2();
   // 모든 인스턴스 메서드는 앞에 인스턴스 주소를 줘야된다. this를 안주면 자동으로 붙인다.
    }
    
    public void m2() {
      Calculator.this.m3();
    }
    
    public void m3() {
      System.out.println(value);  // 보통은 클래스명 생략 로컬변수와 같은 변수가 없다면 this도 생략
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_10 실행");
    System.out.println();
    
    Calculator c1 = new Calculator(100);
    Calculator c2 = new Calculator(200);
    Calculator c3 = new Calculator(300);
    
    
    c1.m1();
    c2.m1();
    c3.m1();
    
    
    // 메서드를 호출할떄 어떤 메서드에 대해서 호출하는지 호출해야된다.
    
    
  }

}

