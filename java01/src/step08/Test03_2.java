/* 유틸리티 클래스 : Object - toString */
package step08;

public class Test03_2{
  
  static class Student1 {
    String name;
    int age;
    
  } // class Student1
  
  static class Student2 {
    String name;
    int age;
    
    public String toString() {
      return String.format("이름: %s\n나이: %d\n", name, age);
    } // toString()
  
  
  } // class Student2
  
  public static void main(String[] args) {
    System.out.println("step08 Test03_2 실행");
    System.out.println();
    
    Student1 s1 = new Student1();
    s1.name = "홍길동";
    s1.age = 20;
    
    Student2 s2 = new Student2();
    
    s2.name = "임꺽정";
    s2.age = 30;
    
    System.out.println(s1.toString());  // 오리지날 toString 호출  // toString을 재정의 하지 않는다면 클래스값 해쉬코드
    System.out.println("--------------------");
    System.out.println(s2.toString());  // 재 정의한 toString 호출
    
  }

}
