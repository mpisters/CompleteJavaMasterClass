package ControlFlowStatements;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int remainder = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
        }
        return lastDigit + remainder;
    }
}
