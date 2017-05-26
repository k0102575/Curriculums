/* 다형성 - 다형적 변수 */

package step10.ex2;

public class Test01 {

  public static void main(String[] args) {
    
    Member m = new Member();
    Member m2 = new Student();
    Member m3 = new Teacher();  // 어떤 클래스의 레퍼런스는 자식클래스의 레퍼런스를 가르킬수있다.
    Member m4 = new FreeStudent();
    Student s1 = new FreeStudent();
    Student s2 = new FreeStudent();
    FreeStudent f1 = new FreeStudent();  // 어떤 클래스의 인스턴스 주소를 저장할때 그클래스의 인스턴스
    
    // 상위개념으로 하위개념을 이야기 할수 있지만 하위개념으로 상위개념을 가르킬수없다.
    
    
  }

}
