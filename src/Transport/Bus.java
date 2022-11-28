package Transport;

public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, float engineVolume) {
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
    // @Override
    //    public void refill() {
    //        if (getYear() < 2000) {
    //            System.out.println("необходимо заправиться дизелем");
    //        } else {
    //            System.out.println("необходимо заправиться бензином");
    //        }
    //
    //    }
}
