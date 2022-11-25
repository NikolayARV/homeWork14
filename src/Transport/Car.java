package Transport;

import java.time.LocalDate;
import java.util.regex.Pattern;


public class Car extends Transport {
    private float engineVolume;
    private String transmisson;
    private String bodyType;
    private String registrNumber;
    private int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
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

    public Car(String brand, String model, float engineVolume, String color, int year, String country, Key key, Insurance insurance, int speedMax) {
       super(brand, model, year, country, color, speedMax);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
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
        private String number = "123456789";

        public Insurance(LocalDate expareDate, double cost, String number) {
            if (expareDate == null) {
                this.expareDate = LocalDate.now().plusDays(365);
            } else {
                this.expareDate = expareDate;
            }
            this.cost = cost;
            if (number.length() != 9) {
                this.number = "некорректный";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
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
            if (expareDate.isBefore(LocalDate.now()) || expareDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    @Override
    public void refill() {
        if (getBrand() == "Audi") {
            System.out.println("необходимо заправиться дизелем");
        } else if (getBrand() == "BMW") {
            System.out.println("необходимо заряжать на специальных электропарковках");
        } else {
            System.out.println("необходимо заправиться бензином");

        }
    }

    @Override

    public String toString() {
        return getBrand() + " " + getModel() + ", " +
                "коробка передач " + transmisson + ", "
                + "тип кузова " + bodyType + " , количество мест "
                + numberOfSeats + ", рег.номер " + registrNumber + ", " + getYear() + " года выпуска, сборка в " + getCountry() + ", " + getColor() + " цвета, объем двигателя - " + engineVolume + " л,"
                + (isSummerTires() ? " летние шины " : " зимние шины") + (getKey().isRemoteEngineStart() ? " удаленный запуск" : " нет удаленного запуска ") + (getKey().isKeyLessAccess() ? " безключевой доступ " : " ключевой доступ ") +
                ". Номер страховки " + getInsurance().getNumber() + ". Стоимост страховки " + getInsurance().getCost() + " максималочка " + getSpeedMax() + " км/ч";
    }
}


