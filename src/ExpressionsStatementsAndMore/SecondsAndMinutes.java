package Expressions_statements_and_more;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 00));
    }

    public static String isValueLowerThanTen(int number, String abbr){
        return number < 10 ? "0" + number + abbr : number + abbr;
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){
            int hours = 0;
            int remainingMinutes = minutes % 60;
            int minutesToHours = minutes / 60;

            return  isValueLowerThanTen(minutesToHours, "h")+" " + isValueLowerThanTen(remainingMinutes, "m") + " " + isValueLowerThanTen(seconds, "s");

        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int remainingSeconds = seconds % 60;
            int secondsToMinutes = seconds / 60;
            return getDurationString(secondsToMinutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }


}
