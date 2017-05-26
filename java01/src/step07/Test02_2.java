/* 인스턴스 변수 와 클래스 변수 */
package step07;

public class Test02_2 {
  
  static class Student {
    
    static int guest = 0;
    static int member = 1;
    static int admin = 2;
    
    String name; 
    int age;
    boolean working;
    int level;
   
  }

  public static void main(String[] args) {
    
    Student s1 = new Student();
    Student s2 = new Student();
    
    System.out.println("Test02_1 실행");
    System.out.println();

    s1.name = "홍길동";
    s1.age = 20;
    s1.working = true;
    s1.level = Student.guest;  // guest부분은 s1으로 적어도 되나 클래스변수이니 클래스명으로 쓰는것이 좋다! 이렇게 써라
    
    s2.name = "임꺽정";
    s2.age = 30;
    s2.working = true;
    s2.level = Student.admin;
    
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.working);
    
    
  }

}
