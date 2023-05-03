package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

public interface Repository {
    public void addContact(Contact contact);
    public void printContacts();
}
