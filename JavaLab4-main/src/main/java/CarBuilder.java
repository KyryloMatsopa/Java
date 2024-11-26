public class CarBuilder {
    private String make;
    private String vin;
    private String number;
    private String releaseDate;
    private int mileage;

    // Setter methods with validation
    public CarBuilder setMake(String make) {
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be empty.");
        }
        this.make = make;
        return this;
    }

    public CarBuilder setVin(String vin) {
        if (vin == null || !vin.matches("^[A-HJ-NPR-Z0-9]{17}$")) {  // VIN is 17 characters, excluding I, O, Q
            throw new IllegalArgumentException("Invalid VIN code. Must be 17 characters without I, O, Q.");
        }
        this.vin = vin;
        return this;
    }

    public CarBuilder setNumber(String number) {
        if (number == null || !number.matches("^[A-Z0-9-]{1,10}$")) {
            throw new IllegalArgumentException("Invalid license plate format.");
        }
        this.number = number;
        return this;
    }

    public CarBuilder setReleaseDate(String releaseDate) {
        if (releaseDate == null || !releaseDate.matches("\\d{4}-\\d{2}-\\d{2}")) {  // Format YYYY-MM-DD
            throw new IllegalArgumentException("Invalid release date format. Expected YYYY-MM-DD.");
        }
        this.releaseDate = releaseDate;
        return this;
    }

    public CarBuilder setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative.");
        }
        this.mileage = mileage;
        return this;
    }

    // Build method with overall validation
    public Car build() {
        StringBuilder validationErrors = new StringBuilder();
        if (make == null || make.isEmpty()) validationErrors.append("Make is invalid or missing.\n");
        if (vin == null || !vin.matches("^[A-HJ-NPR-Z0-9]{17}$")) validationErrors.append("VIN is invalid or missing.\n");
        if (number == null || !number.matches("^[A-Z0-9-]{1,10}$")) validationErrors.append("License plate number is invalid.\n");

        if (validationErrors.length() > 0) {
            throw new IllegalArgumentException("Invalid Car configuration:\n" + validationErrors.toString());
        }

        return new Car(make, vin, number, releaseDate, mileage);
    }
}
