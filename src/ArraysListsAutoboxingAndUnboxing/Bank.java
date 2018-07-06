package ArraysListsAutoboxingAndUnboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void addCustomerBranch(String branchName, String name, ArrayList<Double> transactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.createNewCustomer(name, transactions);
        }
        System.out.println("Branch not found");
    }

    public void addTransaction(String branchName, String customerName, Double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if (customer != null){
                branch.addTransactionForCustomer(customerName, transaction);
            }
        }
    }

    public Branch findBranch(String name) {
        for (Branch branch : this.branches) {
            if (name.equals(branch.getName())) {
                return branch;
            }
        }
        return null;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }
}
