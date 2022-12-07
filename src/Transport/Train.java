package Transport;
import static Transport.ValitUtils.*;

public class Train extends Transport {

    private int price;
    private int time;
    private String depStation;
    private String finalStation;
    private int numberOfWagons;

    public Train(String brand, String model, int year,
                 String country, String color, int speedMax, int price,
                 int time, String depStation, String finalStation, int numberOfWagons) {
        super(brand, model);
        this.price = validatePrice(price);
        this.time = validateTime(time);
        this.depStation = validateValues(depStation) ;
        this.finalStation = validateValues(finalStation);
        this.numberOfWagons = validateWagons(numberOfWagons);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = validatePrice(price);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = validateTime(time);
    }

    public String getDepStation() {
        return depStation;
    }

    public void setDepStation(String depStation) {
        this.depStation = validateValues(depStation);
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = validateValues(finalStation);
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = validateWagons(numberOfWagons);
    }

    //@Override
    //    public void refill() {
    //        if (time > 10) {
    //            System.out.println("необходима заправка дизелем");
    //        }
    //    }

    @Override
    public void startMoving() {
        System.out.println("поехали");
    }

    @Override
    public void stopMoving() {
        System.out.println("приехали");
    }

    @Override
    public void printType() {
    }

    @Override
    public void getDiagnostic() {

    }

    @Override
    public String toString() {
        return "Поезд " +  getBrand() + ", модель " + getModel() + ", "  + " , отходит от " +
                getDepStation() + " и следует до станции " +getFinalStation() + ". Цена поездки — " + getPrice() + " рублей, в поезде " + getNumberOfWagons() + " вагонов.";
    }
}