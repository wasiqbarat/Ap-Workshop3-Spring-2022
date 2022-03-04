public class PhoneNumber {
    private String countryCode;
    private String number;

    public PhoneNumber() {
        this.countryCode = "-";
        this.number = "-";
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setNumber(String number) {
        if (countryCode.length() == 12) {
            this.number = number;
        }else System.out.println("Your entered number is not valid!");
    }

    public String getNumber() {
        return number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String toString() {
        return "Phone number: " + "("+countryCode + ")" + number;
    }

}
