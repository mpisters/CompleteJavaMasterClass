package Expressions_statements_and_more;

public class ifelse {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;


//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//            System.out.println("this was executed");
//        } else if (score >= 1000) {
//            System.out.println("score was between 5000 and 1000");
//        } else {
//            System.out.println("got here");
//        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

    }
}
