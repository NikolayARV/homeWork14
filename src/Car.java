public class Car {
    //Создан класс car со свойствами brand, model, engineVolume, color, productionYear, productionCountry
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белого";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + engineVolume + " л.";
    }
}
