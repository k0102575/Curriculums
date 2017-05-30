// memb 테이블의 데이터를 다루는 메서드를 모아둔 클래스이다.

package step22.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDao {
  Connection con;
  
  public MemberDao(String driver, String url, String username, String password) throws Exception {
    
    Class.forName(driver);
    con = DriverManager.getConnection(url, username, password);
  } // 생성자
  
  public void selectList() {
    try (
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");) {
      
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
    
  } // selectList()
  
  public void insert(String name, String tel, String email, String password) {
    try(
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name, tel, email, pwd) values(?, ?, ?, password(?))");
        ) {
        stmt.setString(1, name);
        stmt.setString(2, tel);
        stmt.setString(3, email);
        stmt.setString(4, password);
        
        int count = stmt.executeUpdate();
        
        System.out.println(count);
        } catch (Exception e) {
          e.printStackTrace();
        }
    
  } // insert()
  
  public void delete(int no) {
    try(
        PreparedStatement stmt = con.prepareStatement("delete from memb where mno= ?");
        ) {
      stmt.setInt(1, no);
      int count = stmt.executeUpdate();
      
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
   
  } // delete()
  
  public void update(int no, String name, String tel, String email, String password) {
    try(
        PreparedStatement stmt = con.prepareStatement(
            "update memb set name =?, email=?, tel=?, pwd=password(?) where mno=?");
        ) {
        stmt.setString(1, name);
        stmt.setString(2, tel);
        stmt.setString(3, email);
        stmt.setString(4, password);
        stmt.setInt(5, no);
        
        int count = stmt.executeUpdate();
        
        System.out.println(count);
        } catch (Exception e) {
          e.printStackTrace();
        }
    
  } // insert()
  
}
