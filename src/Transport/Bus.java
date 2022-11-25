package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int speedMax) {
        super(brand, model, year, country, color, speedMax);
    }

    @Override
    public void refill() {
        if (getYear() < 2000) {
            System.out.println("необходимо заправиться дизелем");
        } else {
            System.out.println("необходимо заправиться бензином");
        }

    }
}
