package Animals;
import static Animals.ValitUtils.*;
public class Flying extends Birds{
    private String movementTtype;

    public Flying(String livingEnvironment, String movementTtype) {
        super(livingEnvironment);
        this.movementTtype = movementTtype;
    }

    public Flying(String name, int age, String livingEnvironment, String movementTtype) {
        super(name, age, livingEnvironment);
        this.movementTtype = movementTtype;
    }

    public String getMovementTtype() {
        return movementTtype;
    }

    public void setMovementTtype(String movementTtype) {
        this.movementTtype = validateValues(movementTtype);
    }

    @Override
    public void go() {
        System.out.println("летать");
    }

    @Override
    public void sleep() {
        System.out.println("спит в гнезде");
    }

    @Override
    public void eat() {
        System.out.println("после удачной охоты");
    }

    @Override
    public void hunt() {
        System.out.println("охотиться");
    }
}

