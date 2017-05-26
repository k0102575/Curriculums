/* 문장: 반복문 while - continue */
package step04;

public class Test03_3 {

  public static void main(String[] args) {
    int i = 0;
    int r = 0;
    
    while (i < 10) {
      i++;
      if (i == 6)
        continue;
      r += i;
    }
    
    System.out.printf("%d,%d\n", i ,r);
    
  }
}
