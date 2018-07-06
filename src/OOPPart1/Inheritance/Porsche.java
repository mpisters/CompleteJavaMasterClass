package OOPPart1.Inheritance;

public class Porsche extends Car {
    public Porsche(String color) {
        super(color, 2, "v6", 6);
    }

    @Override
    public boolean move(int speed) {
        if (speed > 300){
            return false;
        }
        return super.move(speed);
    }

    @Override
    public void changingGears(int speed) {
        if (this.getGear() < 6 && super.move(speed)){
            super.changingGears(speed);
        }
    }
}
