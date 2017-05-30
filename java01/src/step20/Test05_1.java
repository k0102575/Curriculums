/* JDBC 프로그래밍 : Prepared Statement 사용 전 */

package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test05_1 {
  
  public static void main(String[] args) {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    String name = "홍길동103";
    String email = "hong103@test.com";
    String tel = "1111-1111";
    String password = "1111";
    
    System.out.println("step20 Test05_1 실행중");System.out.println();
    
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    try(
    Connection con = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
    Statement stmt = con.createStatement();
    ) {
    int count = stmt.executeUpdate("insert into memb(name,tel,email,pwd) values('" + 
                name + "', '"+ 
                tel +"', '" + 
                email +"', password('" + 
                password + "'))");
    
    System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  } // main

}
