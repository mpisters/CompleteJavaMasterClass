package ArraysListsAutoboxingAndUnboxing;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        int j = 0;
        for (int i = revArr.length - 1; i >= 0; i--) {
            revArr[i] = arr[j];
            j++;
        }
        return revArr;
    }
}
