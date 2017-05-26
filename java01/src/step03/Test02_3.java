/* 증가/감소 연산자 - 전위 연산자와 후위 연산자의 차이점 II */
package step03;

public class Test02_3 {

  public static void main(String[] args) {
    // 1) 전위 연산자
    int i = 10;
    i = ++i;
    System.out.printf("i = %d\n", i);

    // 2) 후위 연산자
    i = 10;
    i = i++;
    System.out.printf("i = %d\n", i);

}

}
