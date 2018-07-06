package OOPPart2;

import java.sql.SQLOutput;

public class Burger {
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;

    public Burger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean cheese) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
    }

    public double price() {
        double total = 0;
        if (this.breadRollType.equals("deluxe")) {
            total += 2;
        }
        if (!this.breadRollType.equals("deluxe")) {
            total += 1;
        }
        if (this.meat.equals("beef")) {
            total += 2;
        }
        if (!this.meat.equals("beef"))
            total += 1;
        if (this.lettuce) {
            System.out.println("lettuce: +0.5");
            total += 0.5;
        }
        if (this.tomato) {
            System.out.println("tomato: +0.5");

            total += 0.5;
        }
        if (this.cheese) {
            System.out.println("cheese: +0.5");
            total += 0.5;
        }
        return total;
    }
}
