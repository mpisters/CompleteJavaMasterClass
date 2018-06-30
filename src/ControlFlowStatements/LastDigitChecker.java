package ControlFlowStatements;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 99));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isInRange(a) && isInRange(b) && isInRange(c)) {
            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
            int lastDigitC = c % 10;
            if (lastDigitA == lastDigitB || lastDigitB == lastDigitC || lastDigitA == lastDigitC) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isInRange(int number) {
        return number >= 10 && number <= 1000;
    }
}
