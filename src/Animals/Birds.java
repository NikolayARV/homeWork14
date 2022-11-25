package Animals;

import java.util.Objects;

import static Animals.ValitUtils.validateValues;

public abstract class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String livingEnvironment) {
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validateValues(livingEnvironment);
    }

    public abstract void hunt();

    @Override
    public String toString() {
        return "Объект - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +  ", класс - " + getClass()+".";

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
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }
}

