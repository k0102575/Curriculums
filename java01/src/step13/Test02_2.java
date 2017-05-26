/* nested class : static nested class II
 * 1) static nested class
 * 2) non static nested class (= inner class)
 * 3) local class
 * 4) anonymous class
 * */

package step13;
  
public class Test02_2 { 
  
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
    m.schoolLevel = CSchool.BACHELOR;
    m.userType = CUserType.TEACHER;
    m.working = CWork.NOT_WORKING;
    m.language = CLanguage.JAVA;
    
  }
  
}
