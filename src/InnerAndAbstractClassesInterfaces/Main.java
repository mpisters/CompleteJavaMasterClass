package InnerAndAbstractClassesInterfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone phone;
        phone = new DeskPhone(123123, false);
        phone.powerOn();
        phone.callPhone(23239);
        phone.answer();

        phone = new MobilePhone(12312);
        phone.callPhone(23322);
        phone.answer();

    }
}
