package inheritance;

public class Car  extends Vehicle{

    public void color(){
        System.out.println("Color of Car");
    }
@Override
   public void speed(){
       System.out.println("Speed of Car");
   }
}
