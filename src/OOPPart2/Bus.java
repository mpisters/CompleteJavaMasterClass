package OOPPart2;

public class Bus  extends Car{
    public Bus() {
        super("Bus", true, 2);
    }

    @Override
    public void startEngine() {
        System.out.println("yooo");
     }

    @Override
    public void brake() {
        System.out.println("bla");
    }

    @Override
    public void accelerate() {
        System.out.println("djdjdj");
    }
}
