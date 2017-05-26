/* 유틸리티 클래스 : Object */
package step08;

public class Test03_1 {
  
  static class Student {
    String name;
  }
  
  public static void main(String[] args) {
    System.out.println("step08 Test03_1 실행");
    System.out.println();
    
    Student s = new Student();

    System.out.println(s.equals(s));
    System.out.println(s.getClass()); // 클래스 정보
    System.out.println(s.hashCode()); // 10진수 해쉬코드
    System.out.println(s.toString()); // 클래스정보와 16진수 해쉬코드 
  }

}
