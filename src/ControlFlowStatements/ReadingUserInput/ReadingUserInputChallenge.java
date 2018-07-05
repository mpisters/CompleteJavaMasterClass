package ControlFlowStatements.ReadingUserInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while( count < 10){
            System.out.println("Enter number " +"#" + (count + 1) + ": ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum+=number;
                count++;
            }else{
                System.out.println("Invalid value");
                scanner.nextLine();
            }
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
