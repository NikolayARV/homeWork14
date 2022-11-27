package Animals;

import java.util.Objects;

import static Animals.ValitUtils.validateInteger;
import static Animals.ValitUtils.validateValues;

public abstract class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = validateValues(name);
        this.age = validateInteger(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateValues(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = validateInteger(age);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

