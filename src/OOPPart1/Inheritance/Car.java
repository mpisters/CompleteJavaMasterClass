package OOPPart1.Inheritance;

public class Car extends  Vehicle{
    public String engine;

    public Car(String color, int seats, String engine, int gear) {
        super(4, color, seats, 0);
        this.engine = engine;
    }


    public boolean move (int speed){
        return speed > 0;
    }


    @Override
    public void changingGears(int speed) {
        super.changingGears(speed);
        if (super.move(speed) && move(speed)){
            this.setGear(this.getGear() + 1);
        } else if (super.move(speed) && !move(speed)){
            this.setGear(this.getGear() -1);
        } else {
            System.out.println("Nothing happened");
        }
    }


}
