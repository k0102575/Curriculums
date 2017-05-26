/* 비트 이동 연산자 >> >>> <<*/
package step03;

public class Test03_6 {

  public static void main(String[] args) {
    int a = 0b0000_1011;
    
    // 1) >> 연산자
    
    System.out.println(a);
    System.out.println(a >> 1);
    System.out.println(a >> 2);    
    System.out.println(a >> 3);    
    
    System.out.println("-----------------------");
    
    // 2) >>> 연산자
    
    System.out.println(-10 >> 2);
    System.out.println(-10 >>> 2);
    
    // 3) << 연산자
    
    System.out.println("-----------------------");
    System.out.println(a << 1);
    System.out.println(a << 2);    
    System.out.println(a << 3);  
    
}
}
