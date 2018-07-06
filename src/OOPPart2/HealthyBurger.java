package OOPPart2;

public class HealthyBurger extends Burger{
    private boolean shake;
    private boolean straw;

    public HealthyBurger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean cheese, boolean shake, boolean straw) {
        super("brown", meat, lettuce, tomato, cheese);
        this.shake = shake;
        this.straw = straw;
    }

    @Override
    public double price() {
        double total = super.price();
        if (this.shake){
            System.out.println("Shake: +1");
            total += 1;
        }
        if (this.straw){
            System.out.println("Straw: +0.40");
            total += 0.40;
        }
        return total;
    }
}
