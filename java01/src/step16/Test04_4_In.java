/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 */

package step16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Test04_4_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test04_2_In 실행");
    System.out.println();
    
    FileInputStream in0 = new FileInputStream("temp/jls8.pdf");
    BufferedInputStream in = new BufferedInputStream(in0);
    
    int b = 0;
    int count = 0;
    
    long start = System.currentTimeMillis();
    
    while ((b = in.read()) != -1) {  
      if ((++count % 10000) == 0) System.out.print(".");
      if ((count % 500000) == 0) System.out.println();
    } // while
    
    long end = System.currentTimeMillis();
    System.out.printf("\n걸린시간 = %d", end - start);
    
    in.close();
    in0.close();
    
    // 만든 순서와 반대로 닫아라
  }

}
