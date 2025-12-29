package generaltasksforOOP;

import java.util.Random;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, int grade) {
        super(name, grade);
    }


    @Override
    public int getFinalGrade() {
        return super.getFinalGrade() + new Random().nextInt(0,20);
    }

}
