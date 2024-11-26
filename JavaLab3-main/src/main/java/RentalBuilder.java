/**
 * Builder для класу Rental.
 */
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
        this.car = car;
        return this;
    }

    public RentalBuilder setRenter(Renter renter) {
        this.renter = renter;
        return this;
    }

    public RentalBuilder setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
        return this;
    }

    public RentalBuilder setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
        return this;
    }

    public RentalBuilder setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public RentalBuilder setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public RentalBuilder setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public RentalBuilder setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Rental build() {
        return new Rental(car, renter, pickupLocation, dropoffLocation, startDate, endDate, pricePerDay, totalPrice);
    }
}
