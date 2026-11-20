package org.prog.session7.object;

//TODO: Android and Apple phones:
//TODO: - add String color and String model
//TODO: - write equals and hash code that will check model and color
//TODO: * - do it using abstract class

public class DemoObject {

    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();


        b1.color = "red";
        b2.color = "blue";

        System.out.println("Our bikes: ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
