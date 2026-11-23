package org.prog.session8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedMain {

    public static void main(String[] args) {
        try {
            readFile1("aaaaa");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    public static void readFile1(String f) {
        readFile2(f);
    }

    public static void readFile2(String f) {
        readFile3(f);
    }

    public static void readFile3(String f) {
        readFile4(f);
    }

    public static void readFile4(String f) {
        readFile5(f);
    }

    public static void readFile5(String f) {
        readFile6(f);
    }

    public static void readFile6(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
