import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Car car = new CarBuilder()
                    .setMake("Toyota")
                    .setVin("1HGCM82633A123456")
                    .setNumber("ABC-1236")
                    .setReleaseDate("2020-05-10")
                    .setMileage(50000)
                    .build();
            System.out.println("Car created: " + car);

            Renter renter = new Renter("John", "Doe", "ID123456", "DL123456");

            System.out.println("Renter created: " + renter);

            Rental rental = new RentalBuilder()
                    .setCar(car)
                    .setRenter(renter)
                    .setPickupLocation("Downtown Office")
                    .setDropoffLocation("Airport Office")
                    .setStartDate("2024-11-01")
                    .setEndDate("2024-11-07")
                    .setPricePerDay(50.0)
                    .setTotalPrice(300.0)
                    .build();
            System.out.println("Rental created: " + rental);

        } catch (IllegalArgumentException e) {
            System.err.println("Error creating object: " + e.getMessage());
        }
    }
}
