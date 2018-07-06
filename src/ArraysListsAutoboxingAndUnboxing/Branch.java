package ArraysListsAutoboxingAndUnboxing;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name, ArrayList<Customer> customers) {
        this.customers = customers;
        this.name = name;
    }

    public void createNewCustomer(String name, ArrayList<Double> transactions){
        if (transactions.size() == 0){
            transactions.add((double) 0);
        }
        this.customers.add(new Customer(transactions, name));
    }

    public void addTransactionsForCustomer(String name, ArrayList<Double> transactions){
        Customer customer = findCustomer(name);
        if (customer != null){
            ArrayList<Double> newTransactionList = new ArrayList<Double>();
            newTransactionList.addAll(transactions);
            newTransactionList.addAll(customer.getTransactions());
            customer.setTransactions(newTransactionList);
        } else {
            System.out.println("Customer not found");
        }
    }

    public void addTransactionForCustomer(String name, double transaction){
        Customer customer = findCustomer(name);
        if (customer != null){
            customer.getTransactions().add(transaction);
        } else {
            System.out.println("Customer not found");
        }
    }

    public Customer findCustomer(String name){
        for (Customer customer: this.customers){
            if (customer.getName().equals(name)){
                System.out.println(customer.getName() + " " + customer.getTransactions());
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
