/* 다형성 - 다형적 변수와 형변환 */

package step10.ex2;

public class Test05 {

  public static void main(String[] args) {
    
    System.out.println("step10 ex2 Test05 실행");
    System.out.println();
    
    Member m = new FreeStudent();
    
    m.name = "홍길동";
    m.id = "hong";
    m.password = "1111";
    m.email = "hong@test.com";
    m.tel = "1111";
    
    /*
    m.schoolName = "비트대학교";
    m.grade = 4;
    m.account = "111-11-1111-111";
    m.bank = "비트은행";
    m.working = true;
    */
    
    
    FreeStudent s = (FreeStudent)m;
    s.schoolName = "비트대학교";
    s.grade = 4;
    s.account = "111-11-1111-111";
    s.bank = "비트은행";
    s.working = true;
    
    // 컴파일 할때 검사해서 문제가 없으면 실행한다.
    // 주소는 같지만 형변환을 하는 이유는 컴파일러에게 정확하게 알려주어야한다.
    
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
    
    // 같은 주소의 값이기 때문에 s에서 조회가 가능하다 주소로 봐야된다.
  }
}