package tutorial.adressbook.service;

import tutorial.adressbook.entity.Contact;
import tutorial.adressbook.repository.ArrayRepository;

import java.util.AbstractCollection;

public class PrintingService {
    private ArrayRepository repository;

    public PrintingService(ArrayRepository repository) {
        this.repository = repository;
    }

    public void printContacts() {
        AbstractCollection<Contact> collection = repository.getAllContacts();
        collection.forEach(System.out::println);
    }
}
