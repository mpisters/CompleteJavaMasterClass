package OOPPart1.Classes;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car(4,4, "carrera", "v4", "blue");
        porsche.setModel("blue");
        System.out.println("Model is: " + porsche.getModel());

        Account unknown = new Account();
        VipCustomer me = new VipCustomer();
        System.out.println(me.getEmail() + me.getName() + me.getLimit());
        VipCustomer me2 = new VipCustomer("allo", 23);
        System.out.println(me2.getEmail() + me2.getName() + me2.getLimit());
        VipCustomer me3 = new VipCustomer("allo", 23, "@");
        System.out.println(me3.getEmail() + me3.getName() + me3.getLimit());
    }
}
