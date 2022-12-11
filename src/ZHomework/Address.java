package ZHomework;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Address(String street, String city, String state, String zipCode, String country) {
        setStreet(street);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
        setCountry(country);
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(String street) {
        if (street.isEmpty()||street.isBlank()||street.length()>50){
            System.out.println("Invalid Street");
            System.exit(0);
        }
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        if(zipCode.length()!=5){
            System.out.println("Invalid zip code");
            System.exit(0);
        }
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
