/* 유틸리티 클래스 : Object - equals */
package step08;

public class Test03_3{
  
  static class Student1 {
    String name;
    int age;
    
  } // class Student1
  
  static class Student2 {
    String name;
    int age;
    
    public boolean equals(Object obj) {  
    // 참조변수는 그것뿐만 아니라 그것의 서브클래스도 담는다
    // Object는 자바의 최상위 슈퍼 클래스이다 어떤 메서드도 다 담는 다는 의미이다.
      if (!(obj instanceof Student2)) return false;
      
      Student2 other = (Student2)obj;
      // 위의 조건문이 있을때 이 형변환을 해야한다. 그래야 사기 치는것이 아니다. 
      
      if (!this.name.equals(other.name)) return false;
      if (this.age != other.age) return false;
      
      return true;
      
    } // equals()
  
  } // class Student2
  
  public static void main(String[] args) {
    System.out.println("step08 Test03_3 실행");
    System.out.println();
    
    Student1 s1 = new Student1();
    s1.name = "홍길동";
    s1.age = 20;
    
    Student1 s2 = new Student1();
    
    s2.name = "홍길동";
    s2.age = 20;
    
    System.out.println(s1 == s2);  // 당연히 주소가 다르다. 인스턴스가 다르니까
    System.out.println(s1.equals(s2));
    
    System.out.println("--------------------");
    
    Student2 s3 = new Student2();
    s3.name = "홍길동";
    s3.age = 20;
    
    Student2 s4 = new Student2();
    
    s4.name = "홍길동";
    s4.age = 20;
    
    System.out.println(s3 == s4);  // 당연히 주소가 다르다. 인스턴스가 다르니까
    System.out.println(s3.equals(s4));
    
    // object의 equals 는 주소를 비교하는것이다. == 과 같다.
    // 하지만 tostring처럼 값을 비교하고 싶으면 object의 equals를 재정의 하라 
    // 재정의 할때는 파라미터 변수를 같게 해야된다 그래야 재정의 이지 파라미터를 바꾸면 오버로딩이다.
    
  }

}
