package tutorial.adressbook.collection;

import tutorial.adressbook.entity.Contact;

public class ArrayContactCollection implements ContactCollection {
    private Object[] contacts = new Object[10];
    private int index = 0;
    @Override
    public void add(Contact contact) {
        contacts[index++] = contact;
    }

    @Override
    public void delete(Contact contact) {
        Object[] tempContacts = new Object[contacts.length];
        int i = 0;
        for (Object temp : contacts) {
            if(temp.equals(contact)) {
                i++;
            }
            tempContacts[i++] = contacts[i];
        }
    }

    @Override
    public Contact search(Contact contact) {
        for (Object temp : contacts) {
            if(temp.equals(contact)) {
               return (Contact) temp;
            }
        }
        return null;
    }
}
