public class Main {
    public static void main(String[] args) {
        BusFleet fleet = new BusFleet();
        fleet.addBus(new Bus("Иванов И.И.", 101, 5, "Газель", 2010, 500000));
        fleet.addBus(new Bus("Петров П.П.", 102, 5, "Mercedes", 2012, 350000));
        fleet.bus_in_route(5);
        fleet.older(10);
        fleet.mileage(400000);
    }
}