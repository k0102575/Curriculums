/* 다형성 - 형변환의 희대의 사기꾼! */

package step10.ex2;

public class Test06 {

  public static void main(String[] args) {
    
    System.out.println("step10 ex2 Test05 실행");
    System.out.println();
    
    Member m = new Member();
    
    m.name = "홍길동";
    m.id = "hong";
    m.password = "1111";
    m.email = "hong@test.com";
    m.tel = "1111";
    
    
    FreeStudent s = (FreeStudent)m;
    s.schoolName = "비트대학교";
    s.grade = 4;
    s.account = "111-11-1111-111";
    s.bank = "비트은행";
    s.working = true;
    
    
    System.out.println(s.name);
    System.out.println(s.id);
    System.out.println(s.password);
    System.out.println(s.email);
    System.out.println(s.tel);
    System.out.println(s.schoolName);
    System.out.println(s.grade);
    System.out.println(s.account);
    System.out.println(s.bank);
    System.out.println(s.working);
    
  }
}