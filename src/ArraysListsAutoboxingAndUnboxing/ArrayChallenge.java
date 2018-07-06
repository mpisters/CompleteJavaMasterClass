package ArraysListsAutoboxingAndUnboxing;

import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        int[] sortedNumbers = sortIntegers(numbers);
        printArray(sortedNumbers);
    }

    private static int[] getIntegers(int number) {
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            number = scanner.nextInt();
            numbers[i] = number;
        }
        scanner.close();
        return numbers;
    }

    private static int[] sortIntegers(int[] number) {
        int i, j, temp;
        for (j = 0; j < number.length; j++) {
            for (i = 1; i < number.length - j; i++) {
                if (number[i - 1] > number[i]) {
                    temp = number[i];
                    number[i] = number[i - 1];
                    number[i - 1] = temp;
                }
            }
        }
        return number;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
