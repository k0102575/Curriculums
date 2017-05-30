/* JDBC 프로그래밍 : Statement 객체 - SELECT문 실행 */

package step20;

import java.sql.DriverManager;

public class Test02_1 {

  public static void main(String[] args) throws Exception {
    System.out.println("step20 Test02_1 실행중");
    System.out.println();
    
    // 1) MySQL JDBC 드라이버 관리 객체 생성
    
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
    
    // 2) MySQL JDBC 드라이버를 "드라이버 관리자"에 등록한다.
    
    DriverManager.registerDriver(mysqlDriver);
    
    // 3) 드라이버 관리자를 통해 DBMS와 연결한다.
    
    java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/webappdb", 
        "webapp",
        "1111");
    
    // 4) SQL을 실행할 Statement 객체 얻기
    // 주요함수 
    // executeQuery() : select
    // executeUpdate() : insert, update, delete
    // executeBatch() : 여러개의 SQL문을 실행할 떄 사용
    //                  SELECT, INSERT, UPDATE 문을 실행할때 사용
    java.sql.Statement stmt = con.createStatement();
    
    // 5) SELECT SQL문을 DBMS에 보낸다.
    java.sql.ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");
    // sql 날것 그대로 보내는게 아니라 DBMS가 원하는 형태로 파싱해서 보낸다.
    
    // 5) ResultSet 객체를 통해 서버에 결과를 한 개씩 가져온다.
    
    while (rs.next()) {
      System.out.printf("%d, %s, %s, %s\n", 
          rs.getInt("mno"),
          rs.getString("name"), 
          rs.getString("tel"), 
          rs.getString("email"));
    }
    
    // 6) 지금까지 사용한 JDBC 관련 객체의 자원을 해제한다.
    rs.close();
    
    stmt.close();
    
    con.close();
    
  }

}
