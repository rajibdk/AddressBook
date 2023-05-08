package tutorial.adressbook.collection;

import tutorial.adressbook.entity.Contact;

public interface ContactCollection {
    void add(Contact contact);
    void delete(Contact contact);
    Contact search(Contact contact);
}
