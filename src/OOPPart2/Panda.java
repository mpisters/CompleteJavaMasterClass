package OOPPart2;

public class Panda extends Car {

    public Panda(String name, boolean engine, int cylinders) {
        super("Panda", true, 3);
    }

    @Override
    public void startEngine() {
        System.out.println("wam");
    }
    @Override
    public void brake() {
        System.out.println("ieeee");
    }
    @Override
    public void accelerate() {
        System.out.println("greee");
    }
}
