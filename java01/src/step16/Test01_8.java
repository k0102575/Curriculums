/* File 다루기 - File 클래스 사용법 VIII */

package step16;

import java.io.File;
import java.io.FileFilter;

public class Test01_8 {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_8 실행");
    System.out.println();
    
    File f = new File("../");
    
    displayDirectory(f, 0);
    
  } // main()
  
  public static void displayDirectory(File dir, int level) throws Exception{
    File[] files = dir.listFiles(new FileFilter() { // Object의 sub 클래스 default 생성자를 호출한다.
      
      public boolean accept(File file) {
        if (file.isDirectory() || (file.isFile() && file.getName().endsWith(".class"))) {
          return true;
        }
        return false;
      }
      
    }); // dir.listFiles(익명함수)
    
    for (File file : files) {
      
      if (file.isDirectory()) {
        displayDirectory(file, level +1);
      } else {
        System.out.printf("%s\n", file.getPath());
      }
    } // for
    
  } // displayDirectory(dir, level)
  
} // class

