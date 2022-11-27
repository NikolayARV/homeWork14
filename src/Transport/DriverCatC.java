package Transport;

public class DriverCatC extends Driver<Truck>{
    public DriverCatC(String name) {
        super(name);
    }

    public void startMoving(Driver car) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + car +
                " и будет участвовать в заезде");
    }
}
