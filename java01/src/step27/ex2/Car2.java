package step27.ex2;

import java.util.List;

public class Car2 {
  String model;
  int cc;
  Engine engine;
  List<Tire> tires;
  
  @Override
  public String toString() {
    return "Car2 [model=" + model + ", cc=" + cc + ", engine=" + engine + ", tires=" + tires + "]";
  }

  public Car2() {
    System.out.println("Car()");
    this.model = "기본자동차";
    this.cc = 900;
  }
  
  public Car2(String model, int cc) {
    System.out.println("Car(String, int)");
    this.model = model;
    this.cc = cc;
  }
  
  public Car2(String model, int cc, Engine engine) {
    System.out.println("Car(String, int, engine)");
    this.model = model;
    this.cc = cc;
    this.engine = engine;
  }
  
  public Car2(String model, int cc, Engine engine, Tire[] tires) {
    System.out.println("Car(String, int, engine)");
    this.model = model;
    this.cc = cc;
    this.engine = engine;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public List<Tire> getTires() {
    return tires;
  }

  public void setTires(List<Tire> tires) {
    this.tires = tires;
  }
  
  
  
}
