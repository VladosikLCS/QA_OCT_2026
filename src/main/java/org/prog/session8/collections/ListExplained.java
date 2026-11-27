package org.prog.session8.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExplained {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        List<String> lList = new LinkedList<>();

        aList.add("e1"); // 0
        aList.add("e2"); // 1
        //....
        aList.add("e3000"); // 3000
        aList.add("e3000001"); //
        //....
        aList.add("e3000000"); // 3000000
        System.out.println(aList.indexOf("e1"));
        System.out.println(aList.indexOf("e2"));
        System.out.println(aList.indexOf("e3"));

        lList.add("e1"); // [start-of-list] - [e1] - [e2]
        //....
        lList.add("e2000"); // [e1999] - [e2000] - [e3000001]
        lList.add("e3000001"); // [e2000] - [e3000001] - [e2001]
        lList.add("e2001"); // [e3000001] - [e2001] - [e2002]
        //....
        lList.add("e3000000"); // [e2999999] - [e3000000] - [end-of-list]
    }
}
