package Transport;

import static Transport.ValitUtils.validateCategory;
import static Transport.ValitUtils.validateValues;

public class Driver <B extends Transport> {
    private final String name;
    private String driverLicense;
    private int driverExperiense;

    public Driver(String name) {

        this.name = validateValues(name);
         }

    public int getDriverExperiense() {
        return driverExperiense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public String getName() {
        return name;
    }

    public void setDriverExperiense(int driverExperiense) {
        if (driverExperiense <= 0) {
            this.driverExperiense = 0;
        } else {
            this.driverExperiense = driverExperiense;
        }
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = validateCategory(driverLicense);
    }

    public void startMoving(B transport) {
        System.out.println("водитель " + getName() + " управляет автомобилем " + transport.getBrand() + transport.getModel() +
                " и будет участвовать в заезде");

    }
    public void stopMoving() {
        System.out.println(" стоим");
    }
    public void refill() {
        System.out.println(" необходимо заправиться");
    }


}




