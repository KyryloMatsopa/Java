import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти Car і Renter
        Car car1 = new Car("Toyota", "1HGCM82633A123456", "AB1234CD", "2020-01-15", 20000);
        Car car2 = new Car("Honda", "2HGCM82633A123457", "EF5678GH", "2021-05-20", 15000);
        Renter renter1 = new Renter("John", "Doe", "ID123456", "DL123456");
        Renter renter2 = new Renter("Jane", "Smith", "ID654321", "DL654321");

        // Створюємо об'єкти Rental за допомогою RentalBuilder
        Rental rental1 = new RentalBuilder()
                .setCar(car1)
                .setRenter(renter1)
                .setPickupLocation("Kyiv")
                .setDropoffLocation("Lviv")
                .setStartDate("2024-10-01")
                .setEndDate("2024-10-10")
                .setPricePerDay(50.0)
                .setTotalPrice(500.0)
                .build();

        Rental rental2 = new RentalBuilder()
                .setCar(car2)
                .setRenter(renter2)
                .setPickupLocation("Kyiv")
                .setDropoffLocation("Odesa")
                .setStartDate("2024-11-01")
                .setEndDate("2024-11-05")
                .setPricePerDay(60.0)
                .setTotalPrice(300.0)
                .build();

//        // Ініціалізуємо сервіс і додаємо оренди
//        RentalService rentalService = new RentalService();
//        rentalService.addRental(rental1);
//        rentalService.addRental(rental2);
//
//        // Демонстрація роботи сервісних методів
//        System.out.println("Оренди, відсортовані за ціною:");
//        List<Rental> sortedByPrice = rentalService.getRentalsSortedByPrice();
//        sortedByPrice.forEach(System.out::println);
//
//        System.out.println("\nОренди, що починаються з локації 'Kyiv':");
//        List<Rental> kyivRentals = rentalService.getRentalsByPickupLocation("Kyiv");
//        kyivRentals.forEach(System.out::println);
//
//        System.out.println("\nНайдешевша оренда:");
//        Rental cheapestRental = rentalService.getCheapestRental();
//        System.out.println(cheapestRental);

        // Сериалізація та десериалізація
        try {
            // JSON
            JsonSerializer<Rental> jsonSerializer = new JsonSerializer<>();
            File jsonFile = new File("rental.json");
            jsonSerializer.serialize(rental1, jsonFile);
            Rental deserializedJsonRental = jsonSerializer.deserialize(jsonFile);
            System.out.println("Deserialized from JSON: " + deserializedJsonRental);

            // XML
            XmlSerializer<Rental> xmlSerializer = new XmlSerializer<>();
            File xmlFile = new File("rental.xml");
            xmlSerializer.serialize(rental1, xmlFile);
            Rental deserializedXmlRental = xmlSerializer.deserialize(xmlFile);
            System.out.println("Deserialized from XML: " + deserializedXmlRental);

            // YAML
            YamlSerializer<Rental> yamlSerializer = new YamlSerializer<>();
            File yamlFile = new File("rental.yaml");
            yamlSerializer.serialize(rental1, yamlFile);
            Rental deserializedYamlRental = yamlSerializer.deserialize(yamlFile);
            System.out.println("Deserialized from YAML: " + deserializedYamlRental);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
