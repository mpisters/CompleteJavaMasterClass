package OOPPart2;

public class DeluxeBurger extends Burger {
    private String chips;
    private String drink;

    public DeluxeBurger(String breadRollType, String meat, String chips, String drink) {
        super(breadRollType, meat, false, false, false);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double price() {
        System.out.println("chips: +2");
        System.out.println("drink: +2");
        return super.price() + 4;
    }
}
