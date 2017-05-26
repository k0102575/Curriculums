/* File 다루기 - File 클래스 사용법 VI */

package step16;

import java.io.File;
import java.io.IOException;

public class Test01_6 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_6 실행");
    System.out.println();
    
    File f = new File("../");
    
    displayDirectory(f, 0);
  } // main
  
  public static void displayDirectory(File dir, int level) throws IOException{
    File[] files = dir.listFiles();
    
    for (File file : files){
      if (file.isFile() && file.getName().endsWith(".class")) {
        System.out.printf("%s\n", file.getPath());
      }
      
      if (file.isDirectory()){
        displayDirectory(file, level +1);
      }
    }
  }
  
} // class

