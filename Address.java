public class Address {
    private String zipCode;
    private String country;
    private String city;
    private String email;

    public Address() {
        this.email = "";
        this.city = "";
        this.zipCode = "";
        this.country = "";
    }


    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Zip code: " + zipCode +"\n"+ "Country: " + country + "\n" + "City: " + "\n" + "Email: " + email;
    }
}
