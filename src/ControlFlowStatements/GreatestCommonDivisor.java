package ControlFlowStatements;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int a, int b){
        if (a < 10 || b < 10){
            return -1;
        }
        int start = a >= b ? a : b;
        while(start !=0){
            start--;
            if (a % start == 0 && b % start == 0){
                return start;
            }
        }
        return -1;
    }
}
