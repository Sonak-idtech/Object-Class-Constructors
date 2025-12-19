package inheritance;

public class Circle  extends Shape{
 @Override
    public void area() {
        System.out.println("Area of Circle");
    }

    @Override
    public String toString() {
        return "Circle{}";
    }

}
