import java.util.Scanner;

public class PhoneBook {
    Scanner scanner = new Scanner(System.in);

    private Contact[] contacts = new Contact[20];

    public boolean addContact(Contact contact1) {

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        for (int i = 0; i < contacts.length; i++) {
            if ( contacts[i].getFirstName().equals(contact1.getFirstName()) && contacts[i].getLastName().equals(contact1.getLastName()) ) {
                return false;
            }
        }
        contact1.setFirstName(firstName);
        contact1.setLastName(lastName);

        System.out.println("Enter group: ");
        String group = scanner.nextLine();
        contact1.setGroup(group);
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        contact1.setEmail(email);

        // phone number
        System.out.println("Enter country code: ");
        String countryCode = scanner.nextLine();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNumber(number);

        contact1.setPhoneNumber(phoneNumber);

        //address
        System.out.println("Enter zip code: ");
        String zipCode = scanner.nextLine();
        System.out.println("Enter country: ");
        String country = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.nextLine();

        Address address = new Address();
        address.setZipCode(zipCode);
        address.setCountry(country);
        address.setCity(city);
        address.setEmail(email);

        contact1.setAddress(address);
        return true;
    }
}
