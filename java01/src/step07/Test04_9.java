/* 클래스 메서드들 끼리 호출하기 */
package step07;

public class Test04_9 {
  
  static class Calculator {
    
    public static void m1() {
      m2();
    }
    
    public static void m2() {
      Calculator.m3();
    }
    
    public static void m3() {
      System.out.println("m3()...");      
    }
    
  } // class Calculator
  
  public static void main(String[] args) {
    System.out.println("Test04_9 실행");
    System.out.println();
    
    Calculator.m1();
    
  }

}

