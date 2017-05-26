/* File 다루기 - File 클래스 사용법 III */

package step16;

import java.io.File;

public class Test01_3 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_3 실행");
    System.out.println();
    
    File f = new File("../");
    
    String[] files = f.list();
    
    for (String name : files){
      System.out.println(name);
    }
    
    
    
  }
}
