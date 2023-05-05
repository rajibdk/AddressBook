package tutorial.adressbook.main;

import tutorial.adressbook.entity.Contact;
import tutorial.adressbook.repository.HashSetRepository;
import tutorial.adressbook.repository.ArrayRepository;
import tutorial.adressbook.service.PrintingService;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        ArrayRepository repository = new HashSetRepository();
        PrintingService service = new PrintingService(repository);

        while (true) {
            System.out.println("Add a contact: (ID, First Name, Last Name, Mobile Number and Location)");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            if(id.equals("0")) {
                break;
            }

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
            repository.addContact(contact);
        }
        service.printContacts();
    }
}
