package OOPPart2;

public class Porsche extends Car {
    public Porsche(String name, boolean engine, int cylinders) {
        super("carrera", true, 6);
    }

    @Override
    public void startEngine() {
        System.out.println("wroom");
    }

    @Override
    public void brake() {
        System.out.println("hardbrake");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating");
    }
}
