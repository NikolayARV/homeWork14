package Animals;
import java.util.Objects;

import static Animals.ValitUtils.*;
public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String typeOfFood) {
        this.typeOfFood = validateValues(typeOfFood);
    }

    public Herbivores(String name, int age, String livingEnvironment, int moveSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, moveSpeed);
        this.typeOfFood = validateValues(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validateValues(typeOfFood);
    }

    @Override
    public void eat() {
        System.out.println("пасется");
    }

    @Override
    public void go() {
        System.out.println("гуляет");
    }

    @Override
    public void sleep() {
        System.out.println("на лугу");
    }

    @Override
    public void walk() {
        System.out.println("стадом");
    }

    @Override
    public String toString() {
        return "Объект - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                ", скорость передвижения - " + getMoveSpeed() + " км/ч" + ", тип пищи - " + getTypeOfFood()+ ", класс - " + getClass();
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }
}