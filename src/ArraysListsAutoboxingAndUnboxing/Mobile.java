package ArraysListsAutoboxingAndUnboxing;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Mobile {
    private ArrayList<Contact> contacts;

    public Mobile(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void updateContacts(String name, String phoneNumber) {
        boolean isUpdated = false;
        Contact contact = searchContacts(name);
        if (contact != null) {
            contact.setPhoneNumber(phoneNumber);
            System.out.println("phone number updated");
        } else {
            System.out.println("Couldn't find contact");
        }
    }

    public void createContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        this.contacts.add(contact);
    }

    public void deleteContact(String name){
        Contact contact = searchContacts(name);
        if (contact != null) {
            this.contacts.remove(contact);
        } else {
            System.out.println("contact is removed");
        }
    }

    public Contact searchContacts(String name){
        for(Contact contact: this.contacts){
            if(contact.getName().equals(name)){
                System.out.println("Found: " + contact.getName() + " " + contact.getPhoneNumber());
                return contact;
            }
        }
        return null;
    }


}
