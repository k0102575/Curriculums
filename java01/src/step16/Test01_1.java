/* File 다루기 - File 클래스 사용법 */

package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_1 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_1 실행");
    System.out.println();
    
    File f = new File("./build.gradle");
    
    // 계산 하기 전
    System.out.printf("getAbsolutePath() = %s\n", f.getAbsolutePath());
    
    // 계산 한후
    System.out.printf("getCanonicalPath() = %s\n", f.getCanonicalPath());
    
    System.out.printf("f.getFreeSpace() = %d\n", f.getFreeSpace());
    
    System.out.printf("f.getTotalSpace() = %d\n", f.getTotalSpace());
    
    System.out.printf("f.getUsableSpace() = %d\n", f.getUsableSpace());
    
    // 계산 하기전
    System.out.printf("f.getName() = %s\n", f.getName());
    
    // 계산 한후
    System.out.printf("f.getPath() = %s\n", f.getPath());
    
    System.out.printf("f.exists() = %s\n", f.exists());
    
    System.out.printf("f.isDirectory() = %s\n", f.isDirectory());
    
    System.out.printf("f.isFile() = %s\n", f.isFile());
    
    System.out.printf("f.length() = %s\n", f.length());
    
    System.out.printf("f.lastModified() = %s\n", f.lastModified());
    
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(f.lastModified());
    
    System.out.printf("%d-%d-%d %s %d:%d:%d\n",
           cal.get(Calendar.YEAR),
           cal.get(Calendar.MONTH) + 1,
           cal.get(Calendar.DAY_OF_MONTH),
           (cal.get(Calendar.AM_PM) == Calendar.PM) ? "PM" : "AM",
           cal.get(Calendar.HOUR),
           cal.get(Calendar.MINUTE),
           cal.get(Calendar.SECOND));
    
  }
}
