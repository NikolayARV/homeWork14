package Transport;

import java.util.ArrayList;

public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;
    private boolean diagnostic;



    public Truck(String brand, String model, LoadCapacity loadCapacity, float engineVolume) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;


    }



    public boolean isDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostic = diagnostic;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void goToPitStop() {
        System.out.println("необходимо на пит-стоп");

    }

    @Override
    public void getBestTime(int bestTime) {
        System.out.println(bestTime);
    }

    @Override
    public void getMaxSpeed(int maxSpeed) {
        System.out.println(maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("поехали");
    }

    @Override
    public void stopMoving() {
        System.out.println("стоим");
    }

    @Override
    public void refill() {

    }

    @Override
    public void printType() {

        System.out.println(loadCapacity);

    }

    @Override
    public void getDiagnostic() {
        if (isDiagnostic()) {
            System.out.println("Диагностика пройдена");
        } else {
            throw new RuntimeException("Необходимо пройти диагностику!");
        }
    }
// @Override
    //    public void getDiagnostic(Driver driver) {
    //        if (Objects.equals(driver.getDriverLicense(), "C")) {
    //            System.out.println("Диагностика пройдена");
    //        } else {
    //            throw new RuntimeException("Необходимо указать тип прав!");
    //        }
    //    }

    @Override
    public String toString() {
        return "Марка " + getBrand() + ", модель -  " + getModel() + ", объем двигателя - " + getEngineVolume() + " л." + getClass();
    }


}


