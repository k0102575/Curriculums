/* character stream 클래스 : FileReader vs FileInputStream */

package step16;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test06_1_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test06_1_In 실행");
    System.out.println();
    
    FileInputStream in = new FileInputStream("test06_1.txt");
    
    int b = 0;
    
    while ((b = in.read()) != -1){
      System.out.printf("%x,", b);
    }
    System.out.println();
    
    in.close();
    System.out.println("------------------------------------");
    
    FileReader in2 = new FileReader("test06_1.txt");
    
    while ((b = in2.read()) != -1) {
      System.out.printf("%x,", b);
    }
    System.out.println();
    
    in2.close();
    
  }

}
