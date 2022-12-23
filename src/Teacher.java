public class Teacher extends BasePerson{

    public Teacher(int passNumber, String name) {
        super(passNumber, name);
    }

    @Override
    public void isPresent() {
        System.out.println("Taught at the lesson");
    }
}
