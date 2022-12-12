package Transport;

import java.util.*;

public abstract class Transport {

    private String brand;
    private String model;
    private float engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>(1);
    private final Set<Technic<?>> technics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();



    //private final int year;
    //private final String country;
    //private String color;
    //private int speedMax;

    public Transport(String brand, String model, float engineVolume) {
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addTechnic(Technic<?>... technics) {
        this.technics.addAll(Arrays.asList(technics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Technic<?>> getTechnics() {
        return technics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Transport(String brand, String model) {

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


    }
    //if (year <= 0) {
    //  this.year = 2000;
    //} else {
    //   this.year = year;
    //}
    //if (country == null || country.isBlank() || country.isEmpty()) {
    //   this.country = "default";
    //} else {
    //   this.country = country;
    //}
    //if (color == null || color.isEmpty() || color.isBlank()) {
    //     this.color = "default";
    //} else {
    //    this.color = color;
    //}
    //if (speedMax <= 0 || speedMax >= 350) {
    //    this.speedMax = 180;
    //} else {
    //    this.speedMax = speedMax;
    //}


    //public ArrayList<Driver> getDrivers() {return drivers;    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }


    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    //public int getYear() {
    //        return year;
    //    }
    //
    //    public String getCountry() {
    //        return country;
    //    }
    //
    //    public String getColor() {
    //        return color;
    //    }
    //
    //    public int getSpeedMax() {
    //        return speedMax;
    //    }
    //public void setColor(String color) {
    //        if (color == null || color.isEmpty() || color.isBlank()) {
    //            this.color = "default";
    //        } else {
    //            this.color = color;
    //        }
    //    }

    //public void setSpeedMax(int speedMax) {
    //        if (speedMax <= 0 && speedMax >= 350) {
    //            this.speedMax = 180;
    //        } else {
    //            this.speedMax = speedMax;
    //        }
    //    }

    //public abstract void refill();
    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void getDiagnostic();

    public abstract void printType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && drivers.equals(transport.drivers) && technics.equals(transport.technics) && sponsors.equals(transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, technics, sponsors);
    }

    @Override
    public String toString() {
        return "Марка " + getBrand() + ", модель -  " + getModel() + ", объем двигателя - " + getEngineVolume() + " л." + getClass();
    }


}
