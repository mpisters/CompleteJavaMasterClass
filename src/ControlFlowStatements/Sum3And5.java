package ControlFlowStatements;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if(sum3And5(i)){
                System.out.println(i);
                sum+=i;
                count++;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean sum3And5(int number){
        return number % 3 == 0 && number % 5 == 0;
    }
}
