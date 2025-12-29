import generaltasksforOOP.*;


//import objectclassconstructors.Book;
import oopinheritence.ClassEmployee;
import oopinheritence.Developer;
import oopinheritence.Manager;

import java.math.BigDecimal;

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

        /*Address firstaddress = new Address("Khocali", "Baku", "1000");
        Address secondaddress = new Address("Broadway", "New York", "34321");
        Address thirdaddress = new Address("Fifth Avenue", "New York", "865");
        Employee firstemployee = new Employee("Sona",1000,firstaddress);
        Employee secondemployee = new Employee("Vali",1212,secondaddress);
        Employee thirdemployee = new Employee("Ali",4534,thirdaddress);

        System.out.println(firstemployee);
        System.out.println(secondemployee);
        System.out.println(thirdemployee);*/

       // Inheritance
        //1
        /*Animal cat = new Cat();
        Animal dog = new Dog();
        cat.sound();
        dog.sound();*/
        //2
        /*Person person = new Employee("sona", 26, 2345);
        Person person1 = new Person("Sona",26);
        System.out.println(person);
        System.out.println(person1);*/
        //3
        /*Shape shape1 = new Circle();
        Shape shape2 = new Square();
        shape1.area();
        shape2.area();*/
        //4
        /*Vehicle vehicle = new Vehicle();
        vehicle.speed();

        Vehicle car = new Car();
        car.speed();

        Car car2 = new Car();
        car2.color();

        Car electric = new ElectricCar();
        electric.speed();
        electric.color();

        ElectricCar electric2 = new ElectricCar();
        electric2.color();
        electric2.speed();*/
        //5
        /*ClassEmployee[] employees = new ClassEmployee[3];
        employees[0] = new ClassEmployee();
        employees[1] = new Developer();
        employees[2] = new Manager();

        for (ClassEmployee employee : employees) {
            employee.calculateSalary();
        }*/

        //General Tasks for OOP
        //1

         /*Book[] books = new Book[3];
         //Library
         Library library = new Library(books);
         //library.showAvailableBooks();
         library.addBook();
         library.showAvailableBooks();*/

        //2
         /*Animal lion = new Lion();
         Animal monkey = new Monkey();
         Animal elephant = new Elephnat();

          Zoo.sound(lion);
          Zoo.sound(monkey);
          Zoo.sound(elephant);*/

         //3
        //Product product = new Product();
        /*CartItem[] cartItem = new CartItem[3];
        ShoppingCart item1 = new ShoppingCart(cartItem);
        item1.addItem();
        //item1.removeItem();
        item1.getTotalPrice();*/
        //4
        //
         /* BankAccount savingsAccount = new SavingsAccount(new BigDecimal(3000));
         BankAccount checkingAccount = new CheckingAccount(new BigDecimal(2000));
        System.out.println("Savings account balance is " + savingsAccount.getBalance());
        savingsAccount.withdraw();
        savingsAccount.deposit();

        System.out.println("Checking account balance is " + checkingAccount.getBalance());
        checkingAccount.withdraw();
        checkingAccount.deposit();*/
        //5
        //
        UndergraduateStudent student1 = new UndergraduateStudent("Sona", 35);
        GraduateStudent student2 = new GraduateStudent("Sona1", 40);
        System.out.println(student1.getFinalGrade());
        System.out.println(student2.getFinalGrade());
    }

}