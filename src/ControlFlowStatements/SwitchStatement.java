package ControlFlowStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3: case 4: case 5:
                System.out.println("3,4,5");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
        char switchChar = 'G';
        switch(switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println(switchChar + " was not found");
                break;
        }
    }


}
