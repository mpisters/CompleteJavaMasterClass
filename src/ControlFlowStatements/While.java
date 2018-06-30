package ControlFlowStatements;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println(count);
            count++;
        }

        count = 1;
        while(true){
            if (count ==6){
                break;
            }
            System.out.println(count);
            count++;
        }
        count = 6;
        do {
            System.out.println(count);
            count++;
        } while (count != 6);
    }
}
