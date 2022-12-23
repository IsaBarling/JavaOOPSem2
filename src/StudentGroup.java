import java.util.HashSet;
import java.util.Set;

public class StudentGroup extends Student {
    public StudentGroup() {
        this(122, "Programmers");
    }


    public StudentGroup(int passNumber, String name) {
        super(passNumber, name);
    }

     public static Set<Student> createGroup(){
        Set<Student> createGroup = new HashSet<>();
        createGroup.add(new Student(611244, "Алексеев Андрей Алексеевич "));
        createGroup.add(new Student(611255, "Андреев Иван Андреевич"));
        createGroup.add(new Student(611266, "Воронцова Алина Тимофеевна"));
        createGroup.add(new Student(611277, "Деменкова Татьяна Александровна"));
        createGroup.add(new Student(611288, "Калугин Максим Юрьевич"));
        for (Student i: createGroup()) {
            System.out.println(i);
        }
        return createGroup;
    }
}
