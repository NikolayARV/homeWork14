package Transport;

public class DriverCatD extends Driver<Bus>{
    public DriverCatD(String name, String driverLicense) {
        super(name, driverLicense);
    }

    public void startMoving(DriverCatD car) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + car +
                " и будет участвовать в заезде");
    }
}
