import objectclassconstructors.Address;
import objectclassconstructors.Employee;
import objectclassconstructors.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
   //first question
        /* Car car = new Car();
     car.brand = "BMW";
     car.model = "Ford";
     car.year = 2018;
     System.out.println("car brand is  - "+ car.brand + "    "  +"car model is - " + car.model + "    "
             + "car year is - "+car.year);*/

    //second question
    /*Student firstStudent = new Student("Sona",25);
    Student secondStudent = new Student("Vali",20);
    firstStudent.displayInfo();
    secondStudent.displayInfo();*/

        //third question
        /*Book firstbook = new Book();
        Book secondbook = new Book("Tolstoy","War and Peace");
        Book thirdbook = new Book("Hamlet,","Shakespeare",2134);
        System.out.println(firstbook);
        System.out.println(secondbook);
        System.out.println(thirdbook);*/

        //fourth question
        /*Person firsetperson = new Person();
        Person secondperson = new Person();
        firsetperson.setName("John");
        firsetperson.setHeight(120.909);
        secondperson.setName("Jane");
        secondperson.setHeight(180.876);
        firsetperson.displayInfo();
        secondperson.displayInfo();*/

        //fifth question
         /*Engine engine = new Engine(124);
         CarEngine carEngine = new CarEngine(engine);
         carEngine.startCar();*/

        //sixth question
        /*Rectangle firstrectangle = new Rectangle(2, 5);
        System.out.println(firstrectangle.getArea());
        System.out.println(firstrectangle.getPerimeter());

        Rectangle secondrectangle = new Rectangle(3, 5);
        System.out.println(secondrectangle.getArea());
        System.out.println(secondrectangle.getPerimeter());*/

        Address firstaddress = new Address("Khocali", "Baku", "1000");
        Address secondaddress = new Address("Broadway", "New York", "34321");
        Address thirdaddress = new Address("Fifth Avenue", "New York", "865");
        Employee firstemployee = new Employee("Sona",1000,firstaddress);
        Employee secondemployee = new Employee("Vali",1212,secondaddress);
        Employee thirdemployee = new Employee("Ali",4534,thirdaddress);

        System.out.println(firstemployee);
        System.out.println(secondemployee);
        System.out.println(thirdemployee);
        //~/Desktop/Java Foundation/ldTechJava/StudentAppIDTech/src/repository/StudentRepository.java
    }

}