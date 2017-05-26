/* File 다루기 - File 클래스 사용법 V */

package step16;

import java.io.File;

public class Test01_5 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_5 실행");
    System.out.println();
    
    File f = new File("../");
    
    displayDirectory(f, 0);
  } // main
  
  public static void displayDirectory(File dir, int level){
    File[] files = dir.listFiles();
    
    for (File file : files){
      for (int i = 0; i < level; i++)  System.out.print("  ");
      System.out.printf("%s %s\n",
          (file.isDirectory() ? ">" : " "),
          file.getName());
      if (file.isDirectory()){
        displayDirectory(file, level +1);
      }
  }
}
  
} // class

