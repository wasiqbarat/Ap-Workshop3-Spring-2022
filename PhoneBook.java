import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<Contact>();
    }

    public void storeContact(Contact contact) {
        contacts.add(contact);
    }

    public int numberOfContacts() {
        return contacts.size();
    }

    public boolean addContact(Contact contact1) {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(contact1.getFirstName()) && contact.getLastName().equals(contact.getLastName())) {
                return false;
            }else {
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

                contacts.add(contact1);

            }
        }
        return true;
    }

    Iterator<Contact> it = contacts.iterator();
    public boolean deleteContact(String firstName, String lastName) {


        while ( it.hasNext()) {
            if ( it.next().getFirstName().equals(firstName) && it.next().getLastName().equals(lastName)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Contact findContact(String firstName, String lastName) {
        while (it.hasNext()) {
            if (it.next().getFirstName().equals(firstName) && it.next().getLastName().equals(lastName)) {
                return it.next();
            }
        }
        return null;
    }

    public Contact[] findContacts(String group) {
        Contact[] contactsInOneGroup = new Contact[contacts.toArray().length];

        for (int i = 0; it.hasNext();) {
            if (it.next().getGroup().equals(group)) {
                contactsInOneGroup[i] = it.next();
                i++;
            }
        }
        if (contactsInOneGroup.length > 1) {
            return contactsInOneGroup;
        }else return null;
    }

    void printContact() {
        for (Contact contact: contacts) {
            contact.toString();
        }
    }
}
