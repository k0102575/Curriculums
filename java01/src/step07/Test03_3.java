/* 초기화블록: 생성자 */
package step07;

public class Test03_3 {
  
  static class Student {
   static String name = "홍길동";
   int age = 20;
     static {
       System.out.println("{스태틱 블록 실행...}");
     }
     
     { 
       System.out.println("{인스턴스 블록 실행...1}");
     }
     
     Student() {
       System.out.println("Student()...호출");
     }
     
  }

  public static void main(String[] args) {
    System.out.println("Test03_3 실행");
    System.out.println();
    
    new Student();  
    System.out.println("------------------------");
    new Student();
    
    // 인스턴스를 생성한다  => 인스턴스 블록 => 생성자 호출
    
  }

}
