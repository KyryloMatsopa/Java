import java.util.Objects;

/**
 * Клас представляє інформацію про оренду автомобіля.
 * Має агрегацію з класами Car і Renter.
 */
public class Rental implements Comparable<Rental> {
    private Car car;
    private Renter renter;
    private String pickupLocation;
    private String dropoffLocation;
    private String startDate;
    private String endDate;
    private double pricePerDay;
    private double totalPrice;

    public Rental(Car car, Renter renter, String pickupLocation, String dropoffLocation, String startDate, String endDate, double pricePerDay, double totalPrice) {
        this.car = car;
        this.renter = renter;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerDay = pricePerDay;
        this.totalPrice = totalPrice;
    }

    // Comparable
    @Override
    public int compareTo(Rental other) {
        return this.startDate.compareTo(other.startDate);
    }

    // Getters and Setters

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", renter=" + renter +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropoffLocation='" + dropoffLocation + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return Double.compare(rental.pricePerDay, pricePerDay) == 0 && Double.compare(rental.totalPrice, totalPrice) == 0 && Objects.equals(car, rental.car) && Objects.equals(renter, rental.renter) && Objects.equals(pickupLocation, rental.pickupLocation) && Objects.equals(dropoffLocation, rental.dropoffLocation) && Objects.equals(startDate, rental.startDate) && Objects.equals(endDate, rental.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, renter, pickupLocation, dropoffLocation, startDate, endDate, pricePerDay, totalPrice);
    }

}
