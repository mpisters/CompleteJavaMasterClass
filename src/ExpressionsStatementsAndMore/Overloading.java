package ExpressionsStatementsAndMore;

public class Overloading {
    public static void main(String[] args) {
        calculateScore("tim", 500);
        calculateScore(1000);

        double outcome = calcFeetAndInchesToCentimeters(7, 5);
        double outcome2 = calcFeetAndInchesToCentimeters(54);
        System.out.println(outcome + " " + outcome2);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player "  + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            return (feet * 12 + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >=0){
            return inches * 2.54;
        }
        return -1;
    }

}
