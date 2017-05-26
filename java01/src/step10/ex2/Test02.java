/* 다형성 - 다형적 변수 II */

package step10.ex2;

public class Test02 {

  public static void main(String[] args) {
    
//    Member m = new Member();
//    Member m = new Student();
    Member m = new FreeStudent();
    
    m.name = "홍길동";
    m.id = "hong";
    m.password = "1111";
    m.tel = "1111-1111";
    m.email = "hong@test.com";
    
//    Student s = new Student();
//    Student s = new FreeStudent();
//    Student s = new Member(); // Member의 변수밖에 없다 Student 에 있는 변수를 사용할수가없다.
    
    
    s.name = "홍길동";
    s.id = "hong";
    s.password = "1111";
    s.tel = "1111-1111";
    s.email = "hong@test.com";
    s.schoolName = "비트대학교";
    s.grade = 4;
    
    
    
    
  }

}
