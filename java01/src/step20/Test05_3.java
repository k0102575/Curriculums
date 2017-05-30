/* JDBC 프로그래밍 : Prepared Statement 사용 전 */

package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test05_3 {

  public static void main(String[] args) {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    String email = "hong102@test.com' or email like('hong10%') or email='ㅋㅋ";
    
    System.out.println("step20 Test05_3 실행중");System.out.println();
    
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try(
        Connection con = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
        Statement stmt = con.createStatement();
        ) {

      int count = stmt.executeUpdate("delete from memb where email='"+ email +"'");
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }

  } // main

}
