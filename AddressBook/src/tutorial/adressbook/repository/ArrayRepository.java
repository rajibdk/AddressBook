package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

import java.util.AbstractCollection;

public interface ArrayRepository {
    void addContact(Contact contact);
    AbstractCollection<Contact> getAllContacts();
    Contact findById(Integer Id);
}
