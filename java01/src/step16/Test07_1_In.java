/* 키보드 입력: system.in */

package step16;

import java.io.InputStream;
import java.util.Scanner;


public class Test07_1_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test07_1_In 실행");
    System.out.println();
    
    InputStream in = System.in;
    
    Scanner keyScanner = new Scanner(in);
    
    
    String str = keyScanner.nextLine();
    
    System.out.printf("==>%s \n", str);
    
    keyScanner.close();
    in.close();
  }

}
