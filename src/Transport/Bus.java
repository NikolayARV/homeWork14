package Transport;

public class Bus extends Transport implements Competing {
    private BusCapacity busCapacity;

    public Bus(String brand, String model, BusCapacity busCapacity, float engineVolume) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }



    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
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
        System.out.println(busCapacity);
    }

    @Override
    public void getDiagnostic() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");

    }


    @Override
    public String toString() {
        return "Марка " + getBrand() + ", модель -  " + getModel() + ", объем двигателя - " + getEngineVolume() + " л." + getClass();
    }


}
