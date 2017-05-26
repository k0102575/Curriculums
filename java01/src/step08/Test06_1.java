/* 컬렉션(Collection) 클래스 : 사용전 - 배열을 사용한다. */
package step08;

import java.sql.Date;

public class Test06_1{
  
  public static void main(String[] args) {
    System.out.println("step08 Test06_1 실행");
    System.out.println();
    
    Object[] dateList = new Object[3]; 
    // Object인스턴스 주소를 저장할 레퍼런스배열을3개 만들어라 
    // 한번에 인스턴스를 여러개만드는 문법은 자바에서는 없다
    // new 명령어 하나당 인스턴스1개 
    // 주소를 받을 레퍼런스를 3갸받을 변수만드는것이다.
    // Object 배열을 만들수있는법이 없다.
    
    dateList[0] = Date.valueOf("2017-3-1");  // 문자열을 주면 문자열을 Date객체(java.sql.date) 로 만들어서 리턴해준다.
    dateList[1] = Date.valueOf("2017-5-3");
    dateList[2] = Date.valueOf("2017-5-5");
    
    dateList = growArray(dateList, 2);
    
    dateList[3] = Date.valueOf("2017-5-9");
    dateList[4] = Date.valueOf("2017-6-6");
    
    for (Object obj : dateList){
      System.out.println(obj);
    }
    
  }
  
  
  public static Object[] growArray(Object[] arr, int size){
    Object[] newArr = new Object[arr.length + size];
    for (int i =0; i < arr.length; i++){
      newArr[i] = arr[i];
    } // for
    return newArr;
    
  } // copyArray();
  
  
}



