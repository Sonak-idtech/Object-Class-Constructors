package objectclassconstructors;

public class Employee {
    private String name;
    private int salary;
    Address address;
    public Employee(String name, int salary, Address address){
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

}
