/* File 다루기 - File 클래스 사용법 VII */

package step16;

import java.io.File;
import java.io.FileFilter;

public class Test01_7 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_7 실행");
    System.out.println();
    
    File f = new File("../");
    
    displayDirectory(f, 0);
  } // main()
  
  public static void displayDirectory(File dir, int level) throws Exception{
    File[] files = dir.listFiles(new MyfileFilter());
    // 메서드만있다고되는게 아니라 규칙을 따르는지를 JVM이 확인한다.
    // myfileFilter가 승인한거만 리턴한다.
    
    for (File file : files) {
      
      if (file.isDirectory()) {
        displayDirectory(file, level +1);
      } else {
        System.out.printf("%s\n", file.getPath());
      }
      
    // 디렉토리만 들어가고 아니면 출력한다.
      
    } // for
    
  } // displayDirectory(dir, level)
  
  // 한파일 가져와서 이파일 어떤지 확인해주는 메서드
  // listFile()이 호출하는 메서드
  // FileFilter 규칙에 따른다.
  static class MyfileFilter implements FileFilter {
    
    public boolean accept(File file) {
      if (file.isDirectory() || (file.isFile() && file.getName().endsWith(".class"))) {
        return true;
      }
      return false;
    }
    
  } // MyfileFilter
  
} // class

