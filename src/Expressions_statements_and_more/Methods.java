package Expressions_statements_and_more;

public class Methods {
    public static void main(String[] args) {
        int highScore1 = calculateScore(true, 800, 5, 100);
        int highScore2 = calculateScore(true, 1000, 8, 200);

//        displayHighScorePosition("a", calculateHighScorePosition(1500));
//        displayHighScorePosition("b", calculateHighScorePosition(900));
//        displayHighScorePosition("c", calculateHighScorePosition(400));
//        displayHighScorePosition("c", calculateHighScorePosition(50));
//        printMegaBytesAndKiloBytes(900);
//        System.out.println(bark(true, 22));
//        isLeapYear(1600);
//        isLeapYear(0);
//        isLeapYear(2017);
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainderKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKB + " KB");
        }
        }

    public static boolean bark(boolean barking, int hourOfDay){
         return barking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23));
    }

    public static boolean isLeapYear(int year){
        boolean leapyear = (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
        return leapyear && year > 0 && year <= 9999;
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        numberOne = numberOne * 1000;
        numberTwo = numberTwo * 1000;
        int cOne = (int) numberOne;
        int cTwo = (int) numberTwo;
        return cOne == cTwo;
    }

    public static boolean hasEqualSum(int a,int b, int c){
        return a+b == c;
    }

    public static boolean hasTeen(int a, int b, int c){
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

}
