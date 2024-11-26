import java.util.Objects;

/**
 * Клас, що представляє автомобіль.
 */
public class Car {
    private String make;
    private String vin;
    private String number;
    private String releaseDate;
    private int mileage;

    // Default constructor
    public Car() {
    }

    // Parameterized constructor
    public Car(String make, String vin, String number, String releaseDate, int mileage) {
        this.make = make;
        this.vin = vin;
        this.number = number;
        this.releaseDate = releaseDate;
        this.mileage = mileage;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", vin='" + vin + '\'' +
                ", number='" + number + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return mileage == car.mileage &&
                Objects.equals(make, car.make) &&
                Objects.equals(vin, car.vin) &&
                Objects.equals(number, car.number) &&
                Objects.equals(releaseDate, car.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, vin, number, releaseDate, mileage);
    }
}
