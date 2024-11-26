import java.util.Objects;

/**
 * Клас, що представляє орендаря автомобіля.
 */
public class Renter {
    private String lastName;
    private String firstName;
    private String identificationDocument;
    private String driverLicense;

    // Default constructor
    public Renter() {
    }

    // Parameterized constructor
    public Renter(String lastName, String firstName, String identificationDocument, String driverLicense) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.identificationDocument = identificationDocument;
        this.driverLicense = driverLicense;
    }

    // Getters and Setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Renter{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", identificationDocument='" + identificationDocument + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renter)) return false;
        Renter renter = (Renter) o;
        return Objects.equals(lastName, renter.lastName) &&
                Objects.equals(firstName, renter.firstName) &&
                Objects.equals(identificationDocument, renter.identificationDocument) &&
                Objects.equals(driverLicense, renter.driverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, identificationDocument, driverLicense);
    }
}
