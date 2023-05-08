package tutorial.adressbook.repository;

import tutorial.adressbook.collection.ArrayContactCollection;
import tutorial.adressbook.collection.ContactCollection;
import tutorial.adressbook.entity.Contact;

import java.util.AbstractCollection;

public class ContactArrayRepository implements ArrayRepository {
    private ContactCollection contactCollection = new ArrayContactCollection();
    @Override
    public void addContact(Contact contact) {
        contactCollection.add(contact);
    }

    @Override
    public AbstractCollection<Contact> getAllContacts() {
        return null;
    }

    @Override
    public Contact findById(Integer Id) {
        return null;
    }
}
