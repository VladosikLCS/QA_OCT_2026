package org.prog.session7.keywords;

public class Car {

    public static final String MODEL = "A";
    public static String brand;
    public String color;

    public void printCar() {
        System.out.println(color + " " + brand);
    }

    public static void brrr() {
        System.out.println(brand + " does brrr");
    }

    public static class Engine {
        public String volume;
        public String fuelType;
    }
}
