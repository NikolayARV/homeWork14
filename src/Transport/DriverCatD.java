package Transport;

public class DriverCatD extends Driver<Bus>{
    public DriverCatD(String name) {
        super(name);
    }

    public void startMoving(Driver car) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + car +
                " и будет участвовать в заезде");
    }
}
