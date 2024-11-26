public class RentalBuilder {
    private Car car;
    private Renter renter;
    private String pickupLocation;
    private String dropoffLocation;
    private String startDate;
    private String endDate;
    private double pricePerDay;
    private double totalPrice;

    public RentalBuilder setCar(Car car) {
        if (car == null) throw new IllegalArgumentException("Car cannot be null.");
        this.car = car;
        return this;
    }

    public RentalBuilder setRenter(Renter renter) {
        if (renter == null) throw new IllegalArgumentException("Renter cannot be null.");
        this.renter = renter;
        return this;
    }

    public RentalBuilder setPickupLocation(String pickupLocation) {
        if (pickupLocation == null || pickupLocation.isEmpty()) {
            throw new IllegalArgumentException("Pickup location cannot be empty.");
        }
        this.pickupLocation = pickupLocation;
        return this;
    }

    public RentalBuilder setDropoffLocation(String dropoffLocation) {
        if (dropoffLocation == null || dropoffLocation.isEmpty()) {
            throw new IllegalArgumentException("Dropoff location cannot be empty.");
        }
        this.dropoffLocation = dropoffLocation;
        return this;
    }

    public RentalBuilder setStartDate(String startDate) {
        if (startDate == null || !startDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid start date format. Expected YYYY-MM-DD.");
        }
        this.startDate = startDate;
        return this;
    }

    public RentalBuilder setEndDate(String endDate) {
        if (endDate == null || !endDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid end date format. Expected YYYY-MM-DD.");
        }
        this.endDate = endDate;
        return this;
    }

    public RentalBuilder setPricePerDay(double pricePerDay) {
        if (pricePerDay < 0) throw new IllegalArgumentException("Price per day cannot be negative.");
        this.pricePerDay = pricePerDay;
        return this;
    }

    public RentalBuilder setTotalPrice(double totalPrice) {
        if (totalPrice < 0) throw new IllegalArgumentException("Total price cannot be negative.");
        this.totalPrice = totalPrice;
        return this;
    }

    public Rental build() {
        StringBuilder validationErrors = new StringBuilder();
        if (car == null) validationErrors.append("Car is missing.\n");
        if (renter == null) validationErrors.append("Renter is missing.\n");
        if (pricePerDay < 0) validationErrors.append("Price per day cannot be negative.\n");
        if (totalPrice < 0) validationErrors.append("Total price cannot be negative.\n");

        if (!validationErrors.isEmpty()) {
            throw new IllegalArgumentException("Invalid Rental configuration:\n" + validationErrors.toString());
        }

        return new Rental(car, renter, pickupLocation, dropoffLocation, startDate, endDate, pricePerDay, totalPrice);
    }
}
