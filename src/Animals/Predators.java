package Animals;

import java.util.Objects;

import static Animals.ValitUtils.validateValues;

public class Predators extends Mammals{
    private String typeOfFood;

    public Predators(String typeOfFood) {
        this.typeOfFood = validateValues(typeOfFood);
    }

    public Predators(String name, int age, String livingEnvironment, int moveSpeed, String typeOfFood) {
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
        System.out.println("после удачной охоты");
    }

    @Override
    public void go() {
        System.out.println("гуляет");
    }

    @Override
    public void sleep() {
        System.out.println("в укрытии");
    }

    @Override
    public void walk() {
        System.out.println("в стае или один");
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
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }
}

