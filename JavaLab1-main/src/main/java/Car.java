import java.util.Objects;

/**
 * Клас представляє інформацію про автомобіль, доступний для оренди.
 */

public class Car {
    private String make;
    private String vin;
    private String plateNumber;
    private String releaseDate;
    private int mileage;

    public Car(String make, String vin, String plateNumber, String releaseDate, int mileage) {
        this.make = make;
        this.vin = vin;
        this.plateNumber = plateNumber;
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

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
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
                ", plateNumber='" + plateNumber + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage && Objects.equals(make, car.make) && Objects.equals(vin, car.vin) && Objects.equals(plateNumber, car.plateNumber) && Objects.equals(releaseDate, car.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, vin, plateNumber, releaseDate, mileage);
    }
}
