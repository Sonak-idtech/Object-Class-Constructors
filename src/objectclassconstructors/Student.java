package objectclassconstructors;

public class Student {

    public String Name;
    public int age;


    public Student(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
    }


}
