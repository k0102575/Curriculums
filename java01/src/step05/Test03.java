/* 메서드 : 여러 개의 값을 리턴 하고 싶을 때  */
package step05;

public class Test03 {
  
  // 1) 같은 종류의 값이라면 배열에 담아서 리턴하라!
  public static int[] getScore(int StudentNo) {
    // 학생의 성적 정보를 찾아서 리턴한다고 가정하자!
  int[] scores = {100, 90, 100};
  return scores; // 배열을 리턴 할 수 없다. 배열 객체의 주소를 리턴하는 것이다.
  }
  
  public static void main(String[] args) {
    int[] arr = getScore(100);
    for (int value : arr){
      System.out.println(value);
    }

  }
}
