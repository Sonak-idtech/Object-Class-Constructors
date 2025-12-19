package inheritance;

public class Square extends Shape {
 @Override
    public void area() {
        System.out.println("Area of Square");
    }

    @Override
    public String toString() {
        return "Square{}";
    }

}