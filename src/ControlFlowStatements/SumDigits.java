package ControlFlowStatements;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }
        int sum = 0;
        int newNumber = number;
        do{
            int lastNumber = newNumber % 10;
            System.out.println("lastnumber: " + lastNumber);
            newNumber = newNumber / 10;
            System.out.println("newNumber: " + newNumber);
            sum+=lastNumber;
        }
        while (newNumber != 0);

        return sum;
    }
}
