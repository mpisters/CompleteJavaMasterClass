package ControlFlowStatements;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
}
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int remainder = 0;
        int sum = 0;
        while(number !=0){
            remainder = number % 10;
            if (remainder % 2 ==0){
                sum+=remainder;
            }
            number = number / 10;

        }
        return sum;
    }
}
