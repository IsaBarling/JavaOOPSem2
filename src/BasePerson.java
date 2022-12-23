/**
 *
 * @author Мария Фомина
 */

public class BasePerson {
    private int passNumber;
    private String name;

    public BasePerson (int passNumber, String name){
        this.passNumber = passNumber;
        this.name = name;
    }

    public void isPresent(){
        System.out.println("is present at the lesson");
    }

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
