/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 전 */

package step16;

import java.io.FileInputStream;

public class Test04_1_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test04_1_In 실행");
    System.out.println();
    
    FileInputStream in = new FileInputStream("temp/jls8.pdf");
    
    int b = 0;
    int count = 0;
    int countPoint = 0;
    
    long start = System.currentTimeMillis();
    
    while ((b = in.read()) != -1){  
      // in.read() 가 b가되고 b가 -1이 될떄까지 반복해라
      if (++count == 10000){
        count = 0;
        System.out.printf(".");
      if ((++countPoint % 50) == 0){
        System.out.println();
      }
    }
      
    } // while
    
    long end = System.currentTimeMillis();
    System.out.printf("\n걸린시간 = %d", end - start);
    
  }

}
