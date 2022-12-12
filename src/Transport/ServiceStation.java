package Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<Transport>();

    private void add(Transport transport) {
        transports.offer(transport);
    }
    public void addCar(Car car) {
        add(car);
    }
    public void addTruck(Truck truck) {
        add(truck);
    }

    public void serve() {
        if (!transports.isEmpty()) {
            Transport transport = transports.poll();
            System.out.println(transport.getBrand() + " " + transport.getModel() + " прошел техобслуживание");
        }
    }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "transports=" + transports +
                '}';
    }
}
