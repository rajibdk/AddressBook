package tutorial.adressbook.main;

import tutorial.adressbook.entity.Contact;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Add a contact: (ID, First Name, Last Name, Mobile Number and Location)");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String mobileNumber = scanner.nextLine();
        String location = scanner.nextLine();

        Contact contact = new Contact();
        contact.setId(Integer.parseInt(id));
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setMobileNumber(Integer.parseInt(mobileNumber));
        contact.setLocation(location);

        System.out.println("Contact " + contact);

        HashSet<Contact> hashSet = new HashSet();
        hashSet.add(contact);

        System.out.println(hashSet);
    }
}
