package ControlFlowStatements;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

    }

}
