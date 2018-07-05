package ControlFlowStatements;

public class FlourPacker {
    public static void main(String[] args) {
//        System.out.println(canPack(0,12,12));
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,12));
//        System.out.println(canPack(-3,2,12));
//        System.out.println(canPack(0,0,0));
//        System.out.println(canPack(2,1,0));
//        System.out.println(canPack(5,6,31));
        System.out.println(canPack(2,10,18));
        System.out.println(canPack(4,18,19));

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount *  5 +smallCount < goal || bigCount < 0 || smallCount < 0 ){
            return false;
        }
        int bigTotal = bigCount * 5;
        while(goal > 0){
            if (bigCount > 0 && goal >= 5){
                goal -= 5;
                bigCount -= 1;
            }
            else if (smallCount > 0 && goal < 5|| bigCount == 0 && smallCount > 0) {
                goal -= 1;
                smallCount -= 1;
            } else{
                break;
            }
        }
        return goal == 0;
    }
}
