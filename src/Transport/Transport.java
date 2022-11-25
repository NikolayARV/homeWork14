package Transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int speedMax;

    public Transport(String brand, String model, int year, String country, String color, int speedMax) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "default";
        } else {
            this.color = color;
        }
        if (speedMax <= 0 || speedMax >= 350) {
            this.speedMax = 180;
        } else {
            this.speedMax = speedMax;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "default";
        } else {
            this.color = color;
        }
    }

    public void setSpeedMax(int speedMax) {
        if (speedMax <= 0 && speedMax >= 350) {
            this.speedMax = 180;
        } else {
            this.speedMax = speedMax;
        }
    }

    public abstract void refill();
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " +
                 + getYear() + " года выпуска, сборка в " + getCountry() + ", " + getColor() + " цвета, " +
                "максималочка " + getSpeedMax() + " км/ч";
    }
}
