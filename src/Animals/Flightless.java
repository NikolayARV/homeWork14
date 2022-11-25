package Animals;
import java.util.Objects;

import static Animals.ValitUtils.*;
public class Flightless extends Birds{
    private String movementTtype;

    public Flightless(String livingEnvironment, String movementTtype) {
        super(livingEnvironment);
        this.movementTtype = validateValues(movementTtype);
    }

    public Flightless(String name, int age, String livingEnvironment, String movementTtype) {
        super(name, age, livingEnvironment);
        this.movementTtype = validateValues(movementTtype);
    }

    public String getMovementTtype() {
        return movementTtype;
    }

    public void setMovementTtype(String movementTtype) {
        this.movementTtype = validateValues(movementTtype);
    }

    @Override
    public void go() {
        System.out.println("гулять");
    }

    @Override
    public void sleep() {
        System.out.println("спит на земле");
    }

    @Override
    public void eat() {
        System.out.println("после удачной охоты");
    }

    @Override
    public void hunt() {
        System.out.println("охотиться");
    }
    @Override
    public String toString() {
        return "Объект - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                 ", тип передвижения - " + getMovementTtype() + ", класс - " + getClass();
    }
    @Override
    public int hashCode() {

        return java.util.Objects.hash(getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementTtype, that.movementTtype);
    }
}
