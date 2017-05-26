/* File 다루기 - File 클래스 사용법 IV */

package step16;

import java.io.File;

public class Test01_4 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_4 실행");
    System.out.println();
    
    File f = new File("../");
    
    File[] files = f.listFiles();
    
    for (File file : files){
      System.out.printf("%s %12d %s\n",
          (file.isDirectory() ? "d" : "-"),
          file.length(),
          file.getName());
    }
    
    
    
  }
}
