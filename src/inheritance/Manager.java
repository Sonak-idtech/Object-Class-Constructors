package inheritance;

public class Manager extends ClassEmployee{

    @Override
    public void calculateSalary(){
        System.out.println("Salary of Manager");
    }
}
