package ControlFlowStatements;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }
        String star = "*";
        for (int i = 1; i <= number; i++) {
            int column = number;
            String stars = "";
            for (int j = 1; j <= number; j++) {

                if ((i == 1) || (i == number) || (j == 1) || (j == number) ||
                        (i == j) || (j == ((number - i) + 1))) {
                    stars = stars.concat(star);

                } else {
                    stars = stars.concat(" ");
                }
            }
            System.out.println(stars);
        }
    }


}

//    public static void printSquareStar(int number) {
//        int rowNumber = 0;
//        int columnNumber = 0;
//        int rowCount = 0;
//        int currentRow = 0;
//        if (number < 5) {
//            System.out.println("Invalid value");
//        } else {
//            for (int i = 1; i <= number; i++) {
//                for (int j = 1; j <= number; j++) {
//                    currentRow = i;
//                    columnNumber = j;
//                    rowNumber = currentRow;
//                    rowCount = number;
//                    if (rowNumber < 2 || rowNumber == rowCount) {
//                        System.out.print("*");
//                    } else if (columnNumber < 2 || columnNumber == number) {
//                        System.out.print("*");
//                    } else if (rowNumber == columnNumber) {
//                        System.out.print("*");
//                    } else if (columnNumber == rowCount - currentRow + 1) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }