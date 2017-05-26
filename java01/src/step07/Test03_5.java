/* 초기화블록: 생성자 III */
package step07;

public class Test03_5 {
  
  static class Student {
    
    int age = 20;
     
     Student() { // 기본 생성자
       System.out.println("Student()...호출");
     }
     
     Student(int a) {
       System.out.println("Student(int)...호출");
      this.age = a;
     }
     
     Student(int a, String n) {
       System.out.println("Student(int, String)...호출");
      this.age = a;
     }
     
     Student(String n, int a) {
       System.out.println("Student(String, int)...호출");
      this.age = a;
     }
     
     // Student(int b) {
     //   System.out.println("Student(int)...호출");
     //  this.age = a;
     // }
     
  }

  public static void main(String[] args) {
    System.out.println("Test03_5 실행");
    System.out.println();
    
    new Student();  
    new Student(20);
    System.out.println("------------------");
    new Student("홍길동", 20);
    new Student(20, "홍길동");
    // new Student(20L);
    // new Student(true);
    
    
  }

}
