package Transport;

public class DriverCatC extends Driver<Truck>{
    public DriverCatC(String name, String driverLicense) {
        super(name, driverLicense);
    }

    public void startMoving(DriverCatC car) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + car +
                " и будет участвовать в заезде");
    }
}
