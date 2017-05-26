/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 전 II */

package step16;

import java.io.FileInputStream;

public class Test04_2_In {

  public static void main(String[] args) throws Exception {
    System.out.println("step16 Test04_2_In 실행");
    System.out.println();
    
    FileInputStream in = new FileInputStream("temp/jls8.pdf");
    
    byte [] buf = new byte[8196]; 
    // 단독 적인 프로그램은 사이즈가 많아도 되지만 서버에서는 동시에 접속해서 작업을 해야되기 떄문에 사이즈를 작게 한다.
    // ex) 8메가 단위를 1000명이 접속하면 7.8125기가가 된다. 메모리가 부족하다.
    // 보통 8k를 기본으로 잡는다.
    int len = 0;
    int countPoint = 0;
    
    long start = System.currentTimeMillis();
    
    while ((len = in.read(buf)) != -1) {  
      // buf 줄테니까 최대 8196바이트 읽어라 리턴값은 실제 읽은 바이트 
      // 8196 바이트 단위로 읽다가 읽을게 없으면 -1을 리턴한다.
      System.out.print(".");
      if ((++countPoint % 50) == 0){
        System.out.println();
      }
    } // while
    
    long end = System.currentTimeMillis();
    System.out.printf("\n걸린시간 = %d", end - start);
    
    in.close();
    
  }

}
