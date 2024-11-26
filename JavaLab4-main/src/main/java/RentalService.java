import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {
    private List<Rental> rentals;

    public RentalService() {
        this.rentals = new ArrayList<>();
    }


    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public List<Rental> getRentalsSortedByPrice() {
        return rentals.stream()
                .sorted(Comparator.comparingDouble(Rental::getTotalPrice))
                .collect(Collectors.toList());
    }

    public List<Rental> getRentalsByPickupLocation(String location) {
        return rentals.stream()
                .filter(rental -> rental.getPickupLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }


    public Rental getCheapestRental() {
        return rentals.stream()
                .min(Comparator.comparingDouble(Rental::getTotalPrice))
                .orElse(null);
    }
}
