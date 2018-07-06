package OOPPart1.Inheritance;

public class Vehicle {
    private int wheels;
    private String color;
    private int seats;
    private int gear;

    public Vehicle(int wheels, String color, int seats, int gear) {
        this.wheels = wheels;
        this.color = color;
        this.seats = seats;
        this.gear = gear;
    }

    public void changingGears(int speed){
        System.out.println("Changing gears action");
    }

    public boolean move(int speed){
        if (speed < 0){
            System.out.println("Moving backwards" + speed);
            return true;
        } else if (speed == 0){
            System.out.println("Not moving");
            return false;
        } else {
            System.out.println("Moving forwards: " + speed);
            return true;
        }
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
