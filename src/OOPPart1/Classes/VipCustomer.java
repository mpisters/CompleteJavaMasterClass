package OOPPart1.Classes;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer(){
        this("Default Name", 0, "Default email");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "Default Email");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

}
