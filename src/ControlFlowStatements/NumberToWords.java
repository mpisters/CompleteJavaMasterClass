package ControlFlowStatements;

public class NumberToWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int remainder = 0;
        int reversedNumber = reverse(number);
        int totalZeros = getDigitCount(number) - getDigitCount(reversedNumber);
        while(reversedNumber != 0){
            remainder = reversedNumber % 10;
            reversedNumber = reversedNumber / 10;
            printWords(remainder);
        }
        for (int i = 0; i < totalZeros; i++){
            System.out.println("Zero");
        }

    }


    public static int reverse(int number) {
        int remainder = 0;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        return number >= 0 ? String.valueOf(number).length(): -1;
    }

    public static void printWords(int reversedNumber){
        switch (reversedNumber){
            case 0:
                System.out.println("Zero");
                break;
             case 1:
                System.out.println("One");
                break;
             case 2:
                System.out.println("Two");
                break;
             case 3:
                System.out.println("Three");
                break;
             case 4:
                System.out.println("Four");
                break;
             case 5:
                System.out.println("Five");
                break;
             case 6:
                System.out.println("Six");
                break;
             case 7:
                System.out.println("Seven");
                break;
             case 8:
                System.out.println("Eight");
                break;
             case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}
