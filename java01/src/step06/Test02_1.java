/* class 문법의 용도: 관련된 메서드를 묶는 용도 II */

package step06;

public class Test02_1 {
  
  static String name;
  static int[] scores = new int[3];
  static int total;
  static float aver;
  
  public static void main(String[] args) {

    name = "홍길동";
    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;
    total = scores[0] + scores[1] + scores[2];
    aver = total / 3f;
    
    System.out.printf("%s, %d, %d, %d, %d, %.2f\n",
                       name, scores[0], scores[1], scores[2], total, aver);
    
  }

}
