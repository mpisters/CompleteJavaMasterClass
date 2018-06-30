package ControlFlowStatements;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int palindrome = number;
        while (palindrome != 0){
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }

}
