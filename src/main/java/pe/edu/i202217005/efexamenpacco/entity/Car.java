package pe.edu.i202217005.efexamenpacco.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data  // Esto genera getters, setters, toString, equals y hashCode
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    private String make;
    private String model;
    private Integer year;
    private String vin;
    private String licensePlate;
    private String ownerName;
    private String ownerContact;
    private String purchaseDate;
    private Integer mileage;
    private String engineType;
    private String color;
    private String insuranceCompany;
    private String insurancePolicyNumber;
    private String registrationExpirationDate;
    private String serviceDueDate;


    public Car() {
    }

    public Car(Long carId, String make, Integer year, String vin, String model, String ownerName, String purchaseDate, Integer mileage, String licensePlate, String ownerContact, String engineType, String color, String insurancePolicyNumber, String registrationExpirationDate, String serviceDueDate, String insuranceCompany) {
        this.carId = carId;
        this.make = make;
        this.year = year;
        this.vin = vin;
        this.model = model;
        this.ownerName = ownerName;
        this.purchaseDate = purchaseDate;
        this.mileage = mileage;
        this.licensePlate = licensePlate;
        this.ownerContact = ownerContact;
        this.engineType = engineType;
        this.color = color;
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.registrationExpirationDate = registrationExpirationDate;
        this.serviceDueDate = serviceDueDate;
        this.insuranceCompany = insuranceCompany;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getServiceDueDate() {
        return serviceDueDate;
    }

    public void setServiceDueDate(String serviceDueDate) {
        this.serviceDueDate = serviceDueDate;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    public void setRegistrationExpirationDate(String registrationExpirationDate) {
        this.registrationExpirationDate = registrationExpirationDate;
    }
}