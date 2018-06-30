package ControlFlowStatements;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        if (number <= 0 ){
            return false;
        }
        int start = 1;
        int div = 0;
        while(start < number){
            if (number % start == 0){
                div+=start;
            }
            start++;
        }
        return  div == number;
    }
}
