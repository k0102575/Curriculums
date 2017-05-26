/* 다형성 - 다형적 변수의 응용 */

package step10.ex2;

public class Test03 {

  public static void main(String[] args) {
    
    Member[] arr = new Member[10]; 
    // arr 배열은 멤버의 어떤 자식이라도 담을수 있다.
    // 여러가지 정보를 배열에 저장하고 싶으면 그 저장하려는 클래스 정도의 공통 슈퍼클래스를 넣으면 된다.
    
    arr[0] = new Member();
    arr[1] = new Student();
    arr[2] = new Manager();
    arr[3] = new Teacher();
    arr[4] = new FreeStudent();
    
  }

}
