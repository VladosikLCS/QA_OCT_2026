package org.prog.session7.keywords;

public class KeywordsDemo {

    public static final String[] STRINGS = new String[3];

    public static void main(String[] args) {
        STRINGS[0] = "ABCD";
        STRINGS[1] = "ABCDE";
        STRINGS[2] = "ABCDEF";

        Car.brand = "Toyota";
        Car.brrr();

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        Car.brand = "Chevrolet";
        car2.color = "black";

        car1.printCar();
        Car.brand = "Chevrolet";
        car2.printCar();


    }
}
