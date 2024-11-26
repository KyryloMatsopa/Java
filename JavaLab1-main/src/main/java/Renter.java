import java.util.Objects;

/**
 * Клас представляє інформацію про орендаря.
 */
public class Renter {
    private String firstName;
    private String lastName;
    private String documentId;
    private String driverLicense;

    public Renter(String firstName, String lastName, String documentId, String driverLicense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
        this.driverLicense = driverLicense;
    }

    // Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentId='" + documentId + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renter renter = (Renter) o;
        return Objects.equals(firstName, renter.firstName) && Objects.equals(lastName, renter.lastName) && Objects.equals(documentId, renter.documentId) && Objects.equals(driverLicense, renter.driverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, documentId, driverLicense);
    }
}
