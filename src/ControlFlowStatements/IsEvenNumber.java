package ControlFlowStatements;

public class IsEvenNumber {
    public static void main(String[] args) {
        int number = 0;
        int evenNumbersFound = 0;
        while(number <= 20){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumbersFound++;
            System.out.println(number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }


}
