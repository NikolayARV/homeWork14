package Transport;

public class TestTransport {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Ман", "2",  LoadCapacity.N3, 12 );
        Truck truck2 = new Truck("Зил", "131", LoadCapacity.N2,8);
        Truck truck3 = new Truck("Маз", "555", LoadCapacity.N3,10);
        Truck truck4 = new Truck("Газон", "53",  LoadCapacity.N1,6);
        Bus bus1 = new Bus("ПАЗ", "1", BusCapacity.S,5);
        Bus bus2 = new Bus("Газель-Бизнес", "1", BusCapacity.XS,9);
        Bus bus3 = new Bus("Маз", "3",BusCapacity.M,6);
        Bus bus4 = new Bus("Лиаз", "4", BusCapacity.L,8);
        Car car1 = new Car("ЗАЗ", "968", BodyType.SEDAN,  0.7f);
        Car car2 = new Car("УАЗ", "456", BodyType.VNEDOROGNIK,  2.2f);
        Car car3 = new Car("ВАЗ", "01", BodyType.SEDAN,  1.2f);
        Car car4 = new Car("ГАЗ", "21", BodyType.SEDAN,  2.4f);
        car4.getMaxSpeed(250);
        car1.getBestTime(25);
        car3.goToPitStop();
        truck3.getBestTime(56);
        Driver<Car> driver = new Driver<Car>("ФИО");
        Driver<Truck> driver1 = new Driver<Truck>("ФИО1");
        Driver<Bus> driver2 = new Driver<Bus>("ФИО2");
        DriverCatB driverCatB = new DriverCatB("ФИО3");
        DriverCatC driverCatC = new DriverCatC("ФИО4");
        DriverCatD driverCatD = new DriverCatD("ФИО5");
        driver.startMoving(car2);
        driver1.startMoving(truck1);
        driver2.startMoving(bus4);
        driverCatB.startMoving(car3);
        driverCatC.startMoving(truck3);
        driverCatD.startMoving(bus4);
        System.out.println(BodyType.CUPE);
        car1.printType();
        truck2.printType();
        bus4.printType();
    }

}