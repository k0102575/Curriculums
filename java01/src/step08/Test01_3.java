/* 프로그램 아규먼트 : 연습 
 * => 두 개의 값과 한 개의 연산자를 입력 받아 계산 결과를 출력하라!
 * 
 * 예)
 *  > java -cp bin step08.Test01_2 10 * 3
 *  10 * 3 = 30
 * */
package step08;

public class Test01_3 {

  public static void main(String[] args) {

    if (args.length < 1){
      System.out.println("[사용법]");
      System.out.println(">java -cp bin step08.Test01_3 가위");
      System.out.println("가능한 입력: (1)가위, (2)바위, (3)보");
      return;
    }
    
    boolean victory = false;
    
    int input = Integer.parseInt(args[0]);
    
    int robot = (int)(Math.random() *3) + 1;
    
    if (input == robot){
      System.out.printf("(나) %s <--> (로봇) %s\n", getLabel(input), getLabel(robot));
      System.out.println("비겼습니다 -.-");
      return;
    } else if ((input == 1 && robot ==3)  ||
              (input == 2 && robot ==1)   || 
              (input ==3 && robot ==2)) 
    {
      victory = true;
    }
    
    printResult(input, robot, victory);
    
  }
  
  public static void printResult(int input, int robot, boolean victory){
    System.out.printf("(나) %s <--> (로봇) %s\n", getLabel(input), getLabel(robot));
    if (victory){
      System.out.println("이겼습니다 ^.^");
    } else {
      System.out.println("졌습니다 T.T");
    }
  }
  
  public static String getLabel(int value) {
    switch (value) {
    case 1: return "가위";
    case 2: return "바위";
    case 3: return "보";
    default: return "?";
    }
  }
    
}
