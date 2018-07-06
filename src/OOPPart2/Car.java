package OOPPart2;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, boolean engine, int cylinders) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Engine is started");
    }

    public void brake() {
        System.out.println("Car breaks");
    }

    public void accelerate() {
        System.out.println("Car accelerates");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}

