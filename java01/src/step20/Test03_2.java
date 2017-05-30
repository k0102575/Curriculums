/* JDBC 프로그래밍 : try ~ catch ~ 를 이용하여 자원 해제 시키기 II */

package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test03_2 {

  public static void main(String[] args) {
    System.out.println("step20 Test03_2 실행중");
    System.out.println();
    
    try {
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();      
    DriverManager.registerDriver(mysqlDriver);
    } catch (Exception e) {
      e.printStackTrace();
      return;
      // 드라이버를 생성하다가 실패하면 밑에는 실행해 봤자이다 그래서 리턴한다.
    }
    
    try (
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/webappdb", 
            "webapp",
            "1111");
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");
        ) {
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s\n", 
            rs.getInt("mno"),
            rs.getString("name"), 
            rs.getString("tel"), 
            rs.getString("email"));
      } // while
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

}
