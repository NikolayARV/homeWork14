package Transport;

public class DriverCatB extends Driver<Car> {

    public DriverCatB(String name, String driverLicense) {
        super(name, driverLicense);
    }

    public void startMoving(DriverCatB car) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + car +
                " и будет участвовать в заезде");
    }


}

