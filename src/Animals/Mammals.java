package Animals;
import java.util.Objects;

import static Animals.ValitUtils.*;
public abstract class Mammals extends Animals{
    private String livingEnvironment;
    private int moveSpeed;

    public Mammals() {
            }
    public Mammals(String name, int age, String livingEnvironment, int moveSpeed) {
        super(name, age);
        this.livingEnvironment = validateValues(livingEnvironment);
        this.moveSpeed = validateInteger(moveSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = validateInteger(moveSpeed);
    }

    public abstract void walk();

    @Override
    public String toString() {
        return "Объект - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                ", скорость передвижения - " + getMoveSpeed() + " км/ч" + ", класс - " + getClass();
    }
    @Override
    public int hashCode() {

        return java.util.Objects.hash(getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return moveSpeed == mammals.moveSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }
}
