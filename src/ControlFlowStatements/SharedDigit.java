package ControlFlowStatements;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int a, int b){
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99){
            int remainder1 =0;
            int full1 = a;
            int remainder2 = 0;
            int full2 = b;
            String number1 = String.valueOf(a);
            String number2 = String.valueOf(b);
            while(full1 != 0 && full2 != 0){
                remainder1 = full1 % 10;
                full1 = full1 / 10;
                remainder2 = full2 % 10;
                full2 = full2 / 10;
                if (number1.contains(String.valueOf(remainder2)) || number2.contains(String.valueOf(remainder1))){
                    return true;
                }

            }

        }
        return false;
    }


}
