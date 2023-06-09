package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class ArrayListRepository implements ArrayRepository {
    private ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
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
