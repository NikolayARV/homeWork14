import Transport.Bus;
import Transport.Car;
import Transport.Train;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", -1988, "брент-менеджером");
        Human anna = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "проект-менеджером");
        Human artem = new Human("Артем", "Москва", 1995, null);
        Human vladimir = new Human("Владимир", "Казань", 2001, null);
        System.out.println(vladimir);


        Car lada = new Car("Lada", "Granta", 1.7f, "желтого", 2015, "в России", (new Car.Key(false, false)), (new Car.Insurance(LocalDate.now(), 12520, "12358")),-5);

        lada.setTransmisson("manual");

        lada.setSummerTires(true);
        lada.setRegistrNumber("в586аа185");
        lada.setNumberOfSeats(5);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черного", 2020, "в Германии", (new Car.Key(true, true)), (new Car.Insurance(LocalDate.now(), 52000, "123456789")),400);
        audi.setTransmisson("auto");

        audi.setSummerTires(true);
        audi.setRegistrNumber("x666xx999");
        audi.setNumberOfSeats(4);
        Car bmw = new Car("BMW", "Z8", 3.0f, "черного", 2021, "в Германии", (new Car.Key(true, false)), (new Car.Insurance(LocalDate.now(), 85236, "8563214598l")), 590);
        bmw.setTransmisson("auto");

        bmw.setSummerTires(true);
        bmw.setRegistrNumber("d658ff999");
        bmw.setNumberOfSeats(2);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красного", 2018, "в Юнной Корее", (new Car.Key(true, false)), (new Car.Insurance(LocalDate.now(), 89654, "lfkmfkfk4152")), 250);
        kia.setTransmisson("auto");

        kia.setSummerTires(true);
        kia.setRegistrNumber("d898ee856");
        kia.setNumberOfSeats(5);
        Car hyundai = new Car("Hyundai", "Solaris", -5, null, 2016, "в Южной Корее", (new Car.Key(false, true)), (new Car.Insurance(LocalDate.now(), 89654, "lfkmfkfk4152")), 250);
        hyundai.setTransmisson("manual");

        hyundai.setSummerTires(false);
        hyundai.setRegistrNumber("r986gg963");
        hyundai.setNumberOfSeats(5);


        Flower roza = new Flower("Роза обыкновенна", 0);
        roza.setCost(35.59f);
        roza.setCountry("Голландии");
        Flower chrizantema = new Flower("Хризантема", 5);
        chrizantema.setCost(15);
        Flower pion = new Flower("Пион", 1);
        pion.setCountry("Англии");
        pion.setCost(69.90f);
        Flower gipsofila = new Flower("Гипсофила", 10);
        gipsofila.setCountry("Турции");
        gipsofila.setCost(19.5f);
        System.out.println(lada);
        System.out.println(audi);
        audi.changeTires();
        System.out.println(audi);
        System.out.println(hyundai);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "в России", null,301, 3500, 12, "Белорусского вокзала", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "в России", null, 270, 1700, 8, "Ленинградского вокзала", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        //Bus pazik = new Bus("Пазик", "1235", 2005, "России", "желтого", 95);
        //Bus gazel = new Bus("Газель", "Бизнес", 2008, "России", "желтого", 120);
        //Bus ikarus = new Bus("Икарус", "115", 1986, "России", "красного", 95);
        //System.out.println(pazik);
        //System.out.println(gazel);
        //System.out.println(ikarus);
        //lastochka.refill();
        //audi.refill();
        //bmw.refill();
        //gazel.refill();
        //kia.refill();



    }

}