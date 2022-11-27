package Transport;

public class DriverCatB extends Driver<Car> {

    public DriverCatB(String name) {
        super(name);
    }

    public void startMoving(Driver car) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + car +
                " и будет участвовать в заезде");
    }
}
