package ArraysListsAutoboxingAndUnboxing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);
    private static void main(String[] args) {
        int[] number = readIntegers();
        System.out.println("min value: " + getMinValueArr(number));
    }

    private static int getTotalNumbers(){
        int number = 0;
        while(number == 0){
            System.out.println("Enter the number of numbers you want to put in: ");
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return number;
    }

    private static int[] readIntegers(){
       int total = getTotalNumbers();
        System.out.println("total is: " + total);
       int number = 0;
       int count = 0;
       int[] numbers = new int[total];
       while(count < total){
           System.out.println("Enter a number: ");
           if(scanner.hasNextInt()){
               number = scanner.nextInt();
               numbers[count] = number;
               count++;
           }
           scanner.nextLine();
       }
       scanner.close();
       return numbers;
    }

    private static int getMinValueArr(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] <  min){
                min = numbers[i];
            }
        }
        return min;
    }
}
