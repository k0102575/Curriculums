/* File 다루기 - File 클래스 사용법 VIIII 
 * lamda 문법   -   자바는 람다 자바 스크립트는 클로저
 * */

package step16;

import java.io.File;

public class Test01_9 {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_9 실행");
    System.out.println();
    
    File f = new File("../");
    
    displayDirectory(f, 0);
    
  } // main()
  
  public static void displayDirectory(File dir, int level) throws Exception{
    File[] files = dir.listFiles((File file) -> {
        
      if (file.isDirectory() || (file.isFile() && file.getName().endsWith(".class"))) {
          return true;
        } 
        else {
          return false;
        } // if
      
    }); // dir.listFiles(클로저)
    
    for (File file : files) {
      
      if (file.isDirectory()) {
        displayDirectory(file, level +1);
      } else {
        System.out.printf("%s\n", file.getPath());
      }
    } // for
    
  } // displayDirectory(dir, level)
  
} // class

