package org.prog.session8.collections;

import org.prog.session7.object.Bike;

import java.util.ArrayList;
import java.util.List;

//TODO: Create list of Apple or Android phones (10 items)
//TODO: Assign color and model to each phone in that list
//TODO: * - come up with idea how tp randomize color
//TODO: Write MyPhoneException (extends RuntimeException)
//TODO: for each phone - if phone has null model or null color - throw MyPhoneException

public class ListDemo {

    public static void main(String[] args) {
        List<Bike> bikes = new ArrayList<>();

//        bikes.add(new Bike());
//        bikes.get(0).color = "red";
//
//        Bike b = new Bike();
//        b.color = "red";
//
//        System.out.println(bikes.contains(b));

        List<String> aList = new ArrayList<>();
        List<String> aList2 = new ArrayList<>();
        aList.add("e1");
        aList.add("e2");
        aList.add("e3");

        aList2.add("e3");
        aList2.add("e4");
        aList2.add("e5");

//        System.out.println(aList.retainAll(aList2));
//        System.out.println(aList.size());
//        aList.removeAll(aList2);
//        System.out.println(aList.size());
        aList.addAll(aList2);
//        System.out.println(aList.size());

        for (String someString : aList) {
            System.out.println(someString);
        }

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
    }
}
