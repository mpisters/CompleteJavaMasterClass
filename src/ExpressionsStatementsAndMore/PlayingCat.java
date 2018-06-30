package ExpressionsStatementsAndMore;

public class PlayingCat {
    public static void main(String[] args) {
        boolean trueOrNot = isCatPlaying(true, 10);
        System.out.println(trueOrNot);
        trueOrNot = isCatPlaying(false, 36);
        System.out.println(trueOrNot);
        trueOrNot = isCatPlaying(false, 35);
        System.out.println(trueOrNot);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        return temperature >= 25 && (summer && temperature <= 45 || !summer && temperature <= 35);
    }
}
