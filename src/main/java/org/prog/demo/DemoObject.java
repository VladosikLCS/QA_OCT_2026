package org.prog.demo;

public class DemoObject {

    public static void main(String[] args) {

        Android phone1 = new Android();
        Android phone2 = new Android();

        phone1.color = "black";
        phone1.model = "Samsung";

        phone2.color = "black";
        phone2.model = "Samsung";

        System.out.println("Android equals:");
        System.out.println(phone1.equals(phone2));

        System.out.println("Hash codes:");
        System.out.println(phone1.hashCode());
        System.out.println(phone2.hashCode());

        Apple iphone1 = new Apple();
        Apple iphone2 = new Apple();

        iphone1.color = "white";
        iphone1.model = "iPhone 17";

        iphone2.color = "white";
        iphone2.model = "iPhone 17";

        System.out.println("iPhone equals:");
        System.out.println(iphone1.equals(iphone2));

        System.out.println("iPhone hash codes:");
        System.out.println(iphone1.hashCode());
        System.out.println(iphone2.hashCode());
    }
}
