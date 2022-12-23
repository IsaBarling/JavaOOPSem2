public class Student extends BasePerson{

    public Student(int passNumber, String name) {
        super(passNumber, name);
    }

    @Override
    public void isPresent() {
        System.out.println("Was at the lesson");
    }
}
