/* class 문법의 용도: 관련된 메서드를 묶는 용도 II */

package step06;

public class Test02_2 {
  
  static String name;
  static int[] scores = new int[3];
  static int total;
  static float aver;
  
  public static void init(String n, int k, int e, int m){
    
    name = n;
    scores[0] = k;
    scores[1] = e;
    scores[2] = m;
  
  } // init()
  
  public static void compute(){ 
    
    total = scores[0] + scores[1] + scores[2];
    aver = total / 3f;    
  
  } // compute()

  public static void print(){
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        name, scores[0], scores[1], scores[2], total, aver);

  }  // print()
  
  public static void main(String[] args) {

    init("홍길동", 100, 100, 100);
    compute();
    print();
    
  }

}
