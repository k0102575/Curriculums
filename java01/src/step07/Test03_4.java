/* 초기화블록: 생성자 II */
package step07;

public class Test03_4 {
  
  static class Student {
    
    int age = 20;
     
     Student() { // 기본 생성자
       System.out.println("Student()...호출");
     }
     
  }
  
  static class Student2 {
    
    int age = 20;
     
     // Student2 () {}
     
  }

  public static void main(String[] args) {
    System.out.println("Test03_4 실행");
    System.out.println();
    
    // new Student;
    
    new Student();  
    
    new Student2();
    
    // new Student(20);
    // new Student2(20);
    
    
  }

}
