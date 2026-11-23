package org.prog.session8;

public class UncheckedMain {

    public static void main(String[] args) {
        myMethod("blue");
//        printStringLength1(null);
//        System.out.println("after exception");
    }

    public static void myMethod(String s) {
        if (s.equals("blue")) {
            throw new RuntimeException();
        } else {
            System.out.println("s was not blue!");
        }
    }

    public static void printStringLength1(String s) {
        printStringLength2(s);
    }

    public static void printStringLength2(String s) {
        printStringLength3(s);
    }

    public static void printStringLength3(String s) {
        try {
            printStringLength4(s);
        } catch (Exception e) {
            System.out.println("printStringLength3 exception");
        }
    }

    public static void printStringLength4(String s) {
        printStringLength5(s);
    }

    public static void printStringLength5(String s) {
        printStringLength6(s);
    }

    public static void printStringLength6(String s) {
        try {
            System.out.println("before string length");
            System.out.println(s.length());
            System.out.println("after string length");
        } finally {
            System.out.println("Always runs");
        }
    }


}
