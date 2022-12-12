package Transport;

public class Technic<T extends Transport> {
    private String name;
    private String corpName;


    public Technic(String name, String corpName) {
        this.name = name;
        this.corpName = corpName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public void serve(T t) {
        System.out.println("Машина" + t.getBrand() + " " + t.getModel() + " прошла техобслуживание.");
    }

    public void repair(T t) {
        System.out.println("Машина" + t.getBrand() + " " + t.getModel() + " отремонтирована.");
    }
}
