package Transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);

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
    public String toString() {
        return "Марка " + getBrand() + ", модель -  " + getModel() + ", объем двигателя - " + getEngineVolume() + " л." + getClass();
    }
}

