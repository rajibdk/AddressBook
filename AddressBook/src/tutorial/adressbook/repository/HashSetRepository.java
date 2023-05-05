package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

import java.util.AbstractCollection;
import java.util.HashSet;

public class HashSetRepository implements ArrayRepository {
    private HashSet<Contact> contacts = new HashSet<>();

    @Override
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    @Override
    public AbstractCollection<Contact> getAllContacts() {
        return contacts;
    }

    @Override
    public Contact findById(Integer id) {
        for (Contact contact : contacts) {
            if(contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }
}
