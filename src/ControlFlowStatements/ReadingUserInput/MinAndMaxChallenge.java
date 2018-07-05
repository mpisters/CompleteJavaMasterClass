package ControlFlowStatements.ReadingUserInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        while(true){
            System.out.println("Enter number: ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(number > 0 && number <= 100){
                    numbers.add(number);
                } else{
                    break;
                }
            } else {
                System.out.println("Invalid value");
                break;
            }
            scanner.nextLine();
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Min: " + min + "Max: " + max);
    }
}
