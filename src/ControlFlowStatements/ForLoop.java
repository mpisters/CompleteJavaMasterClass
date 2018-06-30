package ControlFlowStatements;

public class ForLoop {

    public static void main(String[] args) {
            for (int i = 8; i > 1; i--){
                System.out.println(String.format("%.2f",calculateInterest(10000, i)));
            }

            for (int i = 2; i < 9; i++){
                System.out.println(String.format("%.2f",calculateInterest(10000, i)));
            }
            int count = 0;

            for (int i= 0; i < 100; i++){
                System.out.println(i + " " + isPrime(i));
                if(isPrime(i)){
                    count++;
                    if (count == 3){
                        break;
                    }
                }
            }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }



    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i =2; i<= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
