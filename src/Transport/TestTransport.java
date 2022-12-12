package Transport;

import java.util.List;

public class TestTransport {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Ман", "2", LoadCapacity.N3, 12);
        Truck truck2 = new Truck("Зил", "131", LoadCapacity.N2, 8);
        Truck truck3 = new Truck("Маз", "555", LoadCapacity.N3, 10);
        Truck truck4 = new Truck("Газон", "53", LoadCapacity.N1, 6);
        Bus bus1 = new Bus("ПАЗ", "1", BusCapacity.S, 5);
        Bus bus2 = new Bus("Газель-Бизнес", "1", BusCapacity.XS, 9);
        Bus bus3 = new Bus("Маз", "3", BusCapacity.M, 6);
        Bus bus4 = new Bus("Лиаз", "4", BusCapacity.L, 8);
        Car car1 = new Car("ЗАЗ", "968", BodyType.SEDAN, 0.7f);
        Car car2 = new Car("УАЗ", "456", BodyType.VNEDOROGNIK, 2.2f);
        Car car3 = new Car("ВАЗ", "01", BodyType.SEDAN, 1.2f);
        Car car4 = new Car("ГАЗ", "21", BodyType.SEDAN, 2.4f);
        car4.getMaxSpeed(250);
        car1.getBestTime(25);
        car3.goToPitStop();
        truck3.getBestTime(56);
        DriverCatB driverCatB = new DriverCatB("ФИО3", "B");
        DriverCatC driverCatC = new DriverCatC("ФИО4", "C");
        DriverCatD driverCatD = new DriverCatD("ФИО5", "D");
        DriverCatD driverCatD1 = new DriverCatD("ФИО1", "D");

        Sponsor sponsor1 = new Sponsor("Sponsor1");
        Sponsor sponsor2 = new Sponsor("Sponsor2");
        Sponsor sponsor3 = new Sponsor("Sponsor3");

        Technic<Car> technic1 = new Technic<Car>("ФИ1", "Фирм1");
        Technic<Truck> technic2 = new Technic<Truck>("ФИ2", "Фирм2");
        Technic<Transport> technic3 = new Technic<Transport>("ФИ3", "Фирм3");

        driverCatB.startMoving(car3);
        driverCatC.startMoving(truck3);
        driverCatD.startMoving(bus4);
        System.out.println(BodyType.CUPE);
        car1.printType();
        truck2.printType();
        bus4.printType();

        car1.setDiagnostic(false);
        car2.setDiagnostic(true);
        car3.setDiagnostic(true);
        truck1.setDiagnostic(true);
        truck2.setDiagnostic(false);
        car2.getDiagnostic();
        truck1.getDiagnostic();
        bus4.getDiagnostic();

        getDiagnostic(car2, car3, truck1, bus4, car1);


        car1.addDriver(driverCatB);
        car1.addSponsor(sponsor1, sponsor3);
        car1.addTechnic(technic1);

        truck1.addDriver(driverCatC);
        truck1.addSponsor(sponsor2, sponsor2);
        truck1.addTechnic(technic2);

        bus1.addDriver(new DriverCatD("ФИО31", "D"));
        bus1.addSponsor(sponsor3);
        bus1.addTechnic(new Technic<Bus>("ФИО311", "Auto"));

        ServiceStation serviceStation = new ServiceStation();


        List<Transport> transports = List.of(car1, truck1, bus1);
        for (Transport transport : transports) {
            showInfo(transport);
        }
        serviceStation.addCar(car1);
        serviceStation.addTruck(truck1);
        serviceStation.addTruck(truck4);

    }

    private static void showInfo(Transport transport) {
        System.out.println("Информация по авто " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водитель ");
        for (Driver<?> driver : transport.getDrivers()){
            System.out.println(driver.getName());
        }

               System.out.println("Спонсоры ");
                for (Sponsor sponsors : transport.getSponsors()) {
                    System.out.println(sponsors.getName() + " " +sponsors.getSum() + " руб.");
               }
               System.out.println("Механики ");
                for (Technic<?> technics : transport.getTechnics()) {
                    System.out.println(technics.getName());
                }

        }


        public static void getDiagnostic (Transport...transports){
            int count = 0;
            try {
                for (Transport transport : transports) {
                    transport.getDiagnostic();
                    count++;
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println(count);
            }

        }
    }

