package step25;

public class Test01 {

  public static void main(String[] args) throws Exception {
    
    // 방법1)
//    Class clazz = Class.forName("step25.Class01");
    // 교체를 할 필요가 있다면 이방법
    
    // 방법2)
    Class clazz = Class01.class;
    // 교체를 할 필요가 없다면 이방법
    
    Annotation01 anno01 = (Annotation01) clazz.getAnnotation(Annotation01.class);
    
      if (anno01 == null) {
        System.out.println("Annotation01 애노테이션을 추출 하지 못했다!");
      } else {
        System.out.println("Annotation01 애노테이션을 추출 했다!");
      }
      
    Annotation03 anno03 = (Annotation03) clazz.getAnnotation(Annotation03.class);
    
    if (anno03 == null) {
      System.out.println("Annotation03 애노테이션을 추출 하지 못했다!");
    } else {
      System.out.println("Annotation03 애노테이션을 추출 했다!");
    }
    
    
    
  }

}
