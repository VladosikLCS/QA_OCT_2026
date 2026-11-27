package org.prog.session8.collections;

import org.prog.demo.Android;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Android> phones = new ArrayList<>();
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());
        phones.add(new Android());

        phones.get(0).color = "black";
        phones.get(0).model = "Samsung";
        phones.get(1).color = "white";
        phones.get(1).model = "Samsung";
        phones.get(2).color = "blue";
        phones.get(2).model = "Google";
        phones.get(3).color = "black";
        phones.get(3).model = "Xiaomi";
        phones.get(4).color = "red";
        phones.get(4).model = "Samsung";
        phones.get(5).color = "white";
        phones.get(5).model = "Google";
        phones.get(6).color = "gray";
        phones.get(6).model = "Xiaomi";
        phones.get(7).color = "blue";
        phones.get(7).model = "Samsung";
        phones.get(8).color = "black";
        phones.get(8).model = "Google";
        phones.get(9).color = "red";
        phones.get(9).model = "Xiaomi";

        for (Android phone : phones) {
            if (phone.color == null || phone.model == null) {
                throw new MyPhoneException("Phone has null color or model");
            }
        }
    }
}
