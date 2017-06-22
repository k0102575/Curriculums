package step27.ex3;

public class CarFactory {
  public static Car createCar(String name) {
    switch (name) {
    case "람보르기니" : return createLamborghini();
    case "페라리" : return createFerrari();
    default : return null;
    
    }

  }

  private static Car createLamborghini() {
    
    Engine e1 = new Engine(8, 4);

    Tire[] tireList = {
        new Tire("비트타이어", 13),
        new Tire("비트타이어", 13),
        new Tire("비트타이어", 13),
        new Tire("비트타이어", 13)
    };

    Car c1 = new Car();
    c1.setModel("람보르기니");
    c1.setCc(5000);
    c1.setEngine(e1);
    c1.setTires(tireList);
    
    return c1;
    
  }

  private static Car createFerrari() {
    
    Engine e2 = new Engine(16, 8);

    Tire[] tireList2 = {
        new Tire("비트타이어", 15),
        new Tire("비트타이어", 15),
        new Tire("비트타이어", 15),
        new Tire("비트타이어", 15)
    };

    Car c2 = new Car();
    c2.setModel("페라리");
    c2.setCc(7000);
    c2.setEngine(e2);
    c2.setTires(tireList2);
    
    return c2;
  }

}
