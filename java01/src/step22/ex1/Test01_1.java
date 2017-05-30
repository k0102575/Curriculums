/* JDBC 프로그래밍 II : DAO (Data Access Object) 적용 */

package step22.ex1;

public class Test01_1 {
  
  public static void main(String[] args) throws Exception {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    System.out.println("step22 ex1 Test01_1 실행중");System.out.println();
    
    MemberDao memberDao = new MemberDao(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    memberDao.selectList();
    
    System.out.println("--------------------------");
    
    String name;
    String email;
    String tel;
    String password;
    
    memberDao.delete(49);
    
    System.out.println("--------------------------");
    
    memberDao.selectList();
    
    memberDao.insert("홍길동104", "hong104@test.com", "1111-111", "1111");
    
    memberDao.selectList();
    
    System.out.println("--------------------------");
//    
    
    memberDao.update(49, "홍길동변경", "hong104@test.com", "1111-2222", "1313");
    
    memberDao.selectList();
    
    
  } // main

}
