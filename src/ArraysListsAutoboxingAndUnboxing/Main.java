package ArraysListsAutoboxingAndUnboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Contact contact1 = new Contact("a", "0");
//        Contact contact2 = new Contact("b", "1");
//        Contact contact3 = new Contact("c", "2");
//        Contact contact4 = new Contact("d", "3");
//        ArrayList<Contact> contacts = new ArrayList<Contact>();
//        contacts.add(contact1);
//        contacts.add(contact2);
//        contacts.add(contact3);
//        contacts.add(contact4);
//        Mobile mobile = new Mobile(contacts);
//        mobile.deleteContact("c");
//        mobile.searchContacts("c");
//        mobile.updateContacts("d", "30");
//        mobile.searchContacts("d");
        ArrayList<Double> transaction = new ArrayList<>();
        Customer c1 = new Customer(transaction, "a");
        Customer c2 = new Customer(transaction, "b");
        Customer c3 = new Customer(transaction, "c");
        Customer c4 = new Customer(transaction, "d");
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        Branch tech = new Branch("tech", customers);
        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(tech);
        Bank bank = new Bank(branches);
        bank.addTransaction("tech", "d", 1000.0);
        tech.findCustomer("d");
    }
}
