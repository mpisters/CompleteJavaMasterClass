package ControlFlowStatements;

import Expressions_statements_and_more.Methods;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        boolean isLeapYear = Methods.isLeapYear(year);
        int days = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 9: case 11:
                days = 31;
                break;
            case 2:
                if (isLeapYear){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days =30;
                break;
        }
        return days;
    }
}
