/* 초기화블록: 스태틱 블록 */
package step07;

public class Test03_1 {
  
  static class Student {
   static String name = "홍길동";
     static {
       System.out.println(name);
       System.out.println("static..1");
       name = "임꺽정";
     }
     static {
       System.out.println("static..2");
       name = "유관순";
     }
  }

  public static void main(String[] args) {
    System.out.println("Test03_1 실행");
    System.out.println();
    
    Student.name = "하하하";

    System.out.println(Student.name);
    
    
  }

}
