public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт Car
        Car car = new Car("Toyota", "1HGCM82633A123456", "AB1234CD", "2020-01-15", 20000);

        // Створюємо об'єкт Renter
        Renter renter = new Renter("John", "Doe", "ID123456", "DL123456");

        // Створюємо об'єкт Rental за допомогою RentalBuilder
        Rental rental = new RentalBuilder()
                .setCar(car)
                .setRenter(renter)
                .setPickupLocation("Kyiv")
                .setDropoffLocation("Lviv")
                .setStartDate("2024-10-01")
                .setEndDate("2024-10-10")
                .setPricePerDay(50.0)
                .setTotalPrice(500.0)
                .build();

        // Виводимо інформацію про оренду
        System.out.println(rental);
    }
}
