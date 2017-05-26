/* 데이터 프로세싱 스트림 클래스 - BufferedOutputStream 도입 전 */

package step16;

import java.io.FileOutputStream;

public class Test04_1_Out {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test04_1_Out 실행");
    System.out.println();
    
    FileOutputStream out = new FileOutputStream("temp/test04_1.data");
    
    int b = 0;
    int count = 0;
    int countPoint = 0;
    
    long start = System.currentTimeMillis();
    
    
    for (int i = 1; i < 4000000; i++){
      out.write(i);
      if((i % 10000) == 0) System.out.print(".");
      if ((i % 500000) == 0) System.out.println();
    } // for
    
    long end = System.currentTimeMillis();
    System.out.printf("\n걸린시간 = %d", end - start);
    
  }

}
