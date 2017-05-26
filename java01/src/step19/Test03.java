/* 멀티 태스킹 : 스레드 만들고 실행하기 II */
// CPU Racing cpu를 가지고 경쟁한다.
package step19;

public class Test03 {
  static class MyThread extends Thread {
    
    public MyThread (String name) {
      this.setName(name);
    }
    
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("[%s] %d\n", this.getName(), i);
      }
    } // run()
    
  } // class MyThread 쓰레드 상속
  
  public static void main(String[] args) {
    System.out.println("step19 Test03 실행중");
    System.out.println();
    
    MyThread t1 = new MyThread("t1");
    MyThread t2 = new MyThread("t2");
    MyThread t3 = new MyThread("t3");
    
    t1.start();
    t2.start();
    t3.start();
    // 비동기 호출 
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("[main] %d\n", i);
    }
    
    
  }
}
