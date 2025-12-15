package objectclassconstructors;

public class CarEngine {
    Engine engine;

    public CarEngine(Engine engine) {
        this.engine = engine;
    }
   public  void startCar() {
        engine.startEngine();
    }
}
