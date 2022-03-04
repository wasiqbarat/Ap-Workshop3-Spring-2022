public class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact() {
        this.group = "-";
        this.email = "-";
        this.firstName = "-";
        this.lastName = "-";
        this.phoneNumber = new PhoneNumber();
        this.address = new Address();
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
