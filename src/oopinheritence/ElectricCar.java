package oopinheritence;

public class ElectricCar extends Car {
    public void voltage(){
        System.out.println("Voltage of Car");
    }

    @Override
    public void color(){
        System.out.println("Color of ElectricCar");
    }


}
