package Animals;

import java.util.Objects;

import static Animals.ValitUtils.validateValues;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String livingEnvironment) {
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("после удачной охоты");
    }

    @Override
    public void sleep() {
        System.out.println("спит, когда холодно");
    }

    @Override
    public void go() {
        System.out.println("прыгает или ползает");
    }

    @Override
    public String toString() {
        return "Объект - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() + ", класс - " + getClass();
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
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }
}

