/* nested class : static nested class III
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;
  
public class Test02_3 { 
  
  static class Member {
    String name;
    String tel;
    int schoolLevel;
    int userType;
    int working;
    int language;
  }
  
  public static void main(String[] args) {
    
    Member m = new Member();
    m.name = "홍길동";
    m.tel = "111-1111";
    
    // 일반변수처럼 보이지만 스태틱 파이널 네스티드 클래스다
    // OGNL 처럼 사용할수 있다. 뭐.뭐.뭐
    m.schoolLevel = Constants.school.BACHELOR;
    m.userType = Constants.userType.TEACHER;
    m.working = Constants.work.NOT_WORKING;
    m.language = Constants.lang.JAVA;
    
  }
  
}
