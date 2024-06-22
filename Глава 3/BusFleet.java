import java.util.ArrayList;
import java.util.List;

public class BusFleet {
    List<Bus> buses = new ArrayList<>();
    public void addBus(Bus bus) {
        buses.add(bus);
    }
    public void bus_in_route(int routeNumber) {
        System.out.println("список автобусов для заданного номера маршрута: ");
        for (Bus bus : buses) {
            if (bus.routeNumber == routeNumber) {
                System.out.println(bus.busNumber + " - " + bus.brand);
            }
        }
    }
    public void older(int years) {
        int currentYear = java.time.Year.now().getValue();
        for (Bus bus : buses) {
            if (currentYear - bus.startYear > years) {
                System.out.println("список автобусов, которые эксплуатируются больше заданного срока: " + bus.busNumber + " - " + bus.brand);
            }
        }
    }
    public void mileage(int mileage) {
        for (Bus bus : buses) {
            if (bus.mileage > mileage) {
                System.out.println("список автобусов, пробег у которых больше заданного расстояния: "+ bus.busNumber + " - " + bus.brand);
            }
        }
    }
}
