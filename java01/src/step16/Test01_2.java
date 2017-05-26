/* File 다루기 - File 클래스 사용법 II */

package step16;

import java.io.File;

public class Test01_2 {
  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test01_2 실행");
    System.out.println();
    
    File f = new File("hello.txt");
    
     //1) 파일을 생성하기
//    f.createNewFile();
    
    // 2) 파일을 삭제하기
    f.delete();
  }
}
