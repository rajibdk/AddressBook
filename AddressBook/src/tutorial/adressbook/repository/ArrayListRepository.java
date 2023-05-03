package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

import java.util.ArrayList;

public class ArrayListRepository implements Repository {
    private ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void printContacts() {
        for (Contact contact: contacts) {
            System.out.println(contact);
        }
    }
}
