package OOPPart2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Floor> floors = new ArrayList<>();
//        TV tv = new TV("LG");
//        Shower shower = new Shower(true);
//        FirstFloor firstFloor = new FirstFloor(2,3, tv);
//        SecondFloor secondFloor = new SecondFloor(4, 5, shower);
//        floors.add(firstFloor);
//        floors.add(secondFloor);
//        House house = new House(340, floors);
//
//        Printer printer = new Printer(100, 24, false);
//        printer.printPages(33);
        Burger burger = new Burger("whatever", "chicken", false, true, true);
        System.out.println(burger.price());
        HealthyBurger hburger = new HealthyBurger("deluxe", "chicken", false, true, true, false, false);
        System.out.println(hburger.price());
        DeluxeBurger deluxeBurger = new DeluxeBurger("deluxe", "chicken", "patat", "cola");
        System.out.println(deluxeBurger.price());
    }
}
