package Transport;

public class Sponsor {
    private String name;
    private int sum;

    public Sponsor(String name) {
        this.name = name;
    }

    public void toSponsor(Transport transport) {
        System.out.println("Заезд" + transport.getBrand() + " " + transport.getModel() + " проспонсирован.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
