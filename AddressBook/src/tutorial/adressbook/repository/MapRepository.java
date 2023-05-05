package tutorial.adressbook.repository;

import tutorial.adressbook.entity.Contact;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapRepository {
    private Map<Integer, Contact> contacts = new Hashtable<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    public Contact findById(Integer id) {
        return contacts.get(id);
    }
}
