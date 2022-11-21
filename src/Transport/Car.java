package Transport;

import java.time.LocalDate;
import java.util.regex.Pattern;


public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private String transmisson;
    private String bodyType;
    private String registrNumber;
    private int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;


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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmisson() {
        return transmisson;
    }

    public String getRegistrNumber() {
        return registrNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmisson(String transmisson) {
        if (transmisson == null) {
            this.transmisson = "Не указано";
        } else if (transmisson == "auto") {
            this.transmisson = transmisson;
        } else if (transmisson == "manual") {
            this.transmisson = transmisson;
        } else {
            this.transmisson = "Не корректный ввод";
        }
    }

    public void setRegistrNumber(String registrNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", registrNumber)) {
            this.registrNumber = registrNumber;
        } else {
            this.registrNumber = "Не корректный ввод номера";
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null) {
            this.bodyType = "не указано";
        } else {
            this.bodyType = bodyType;
        }
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats >= 2 && numberOfSeats < 9) {
            this.numberOfSeats = numberOfSeats;
        } else {
            System.out.println("не корректный ввод");
        }
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void changeTires() {
        setSummerTires(!this.summerTires);
    }

    public Car(String brand, String model, float engineVolume, String color, int year, String country, Key key, Insurance insurance) {
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
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expareDate;
        private final double cost;
        private  String number ="123456789";

        public Insurance(LocalDate expareDate, double cost, String number) {
            if (expareDate == null) {
                this.expareDate = LocalDate.now().plusDays(365);
            } else {
                this.expareDate = expareDate;
            }
            this.cost = cost;
            if (number.length()!=9) {
                this.number = "некорректный";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null,10000,null);
        }

        public LocalDate getExpareDate() {
            return expareDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkInsDate() {
            if (expareDate.isBefore(LocalDate.now()) || expareDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length()!=9){
                System.out.println("Номер страховки некорректный");
            }
        }
        }

        @Override

        public String toString() {
            return brand + " " + model + ", " +
                    "коробка передач " + transmisson + ", "
                    + "тип кузова " + bodyType + " , количество мест "
                    + numberOfSeats + ", рег.номер " + registrNumber + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + engineVolume + " л,"
                    + (isSummerTires()? " летние шины ":" зимние шины") + (getKey().isRemoteEngineStart()? " удаленный запуск": " нет удаленного запуска ")+(getKey().isKeyLessAccess() ? " безключевой доступ ":" ключевой доступ ") +
                    ". Номер страховки " + getInsurance().getNumber() + ". Стоимост страховки " + getInsurance().getCost();
        }
    }


