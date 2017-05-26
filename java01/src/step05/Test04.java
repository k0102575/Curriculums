/* 메서드 : 여러 개의 값을 리턴 하고 싶을 때 II */
package step05;

public class Test04 {
  
  // 1) 다른 종류의 값이라면 Collection 이나 Map 객체에 담아서 그 주소를 리턴하라!
  public static java.util.ArrayList getStudent(int StudentNo) {
    java.util.ArrayList arr = new java.util.ArrayList();
    arr.add("홍길동");
    arr.add(100);
    arr.add(90);
    arr.add(80);
    arr.add(100 + 90 + 80);
    arr.add((100 + 90 + 80) / 3f);
    return arr;
  }
  
  public static void main(String[] args) {
   java.util.ArrayList list = getStudent(100);
   for (int i = 0; i < list.size(); i++){
     System.out.println(list.get(i));
   }
   
  }
}
