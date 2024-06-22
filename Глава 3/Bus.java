import java.util.ArrayList;
import java.util.List;

class Bus {
    String driverLastNameInitials;
    int busNumber;
    int routeNumber;
    String brand;
    int startYear;
    int mileage;

    public Bus(String driverLastNameInitials, int busNumber, int routeNumber, String brand, int startYear, int mileage) {
        this.driverLastNameInitials = driverLastNameInitials;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.startYear = startYear;
        this.mileage = mileage;
    }
}

