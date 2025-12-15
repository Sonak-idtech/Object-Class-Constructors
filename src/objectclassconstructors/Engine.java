package objectclassconstructors;

public class Engine {
    private  int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine(){
        System.out.println("Engine Started  "+horsePower);
    }
}
