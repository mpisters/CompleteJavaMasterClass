package ControlFlowStatements;

public class FactorPrinter {
    public static void main(String[] args) {
      printFactors(6);
      printFactors(32);
      printFactors(10);
      printFactors(-1);
    }

    public static void printFactors(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int start = 1;
        do {
            if(number % start == 0){
                System.out.println(start);
            }
            start++;
        }
        while(start < number + 1);
    }
}
