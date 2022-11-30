package Transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;

    public Bus(String brand, String model, Capacity capacity, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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

    @Override
    public void printType() {
        System.out.println(capacity.getFrom());

    }
}
