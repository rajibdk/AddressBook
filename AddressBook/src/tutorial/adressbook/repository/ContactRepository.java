package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

import java.util.HashSet;

public class ContactRepository implements Repository{
    private HashSet<Contact> contacts = new HashSet<>();

    @Override
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    @Override
    public void printContacts() {
        for (Contact contact: contacts) {
            System.out.println(contact);
        }
    }
}
