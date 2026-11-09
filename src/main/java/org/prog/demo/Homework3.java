package org.prog.demo;

public class Homework3 {
    public static void main(String[] args) {
    String[] emails = {
            "john@mail.com",
            "jo@gmail.com",
            "peter@localhost",
            "alex.smith@company.net",
            "max@b@c.com",
            "bob@a.io",
            "anna@x.y.z",
            ".sara@mail.com",
            "kate.mail.com",
            "lee@ab.cd",
            "john.doe@server",
            "tom@mail.com.",
            "ann@site.org",
            "@mail.com",
            "first.last@my-server.com"
    };

        for (int i = 0; i < emails.length; i++)
        {
            String email = emails[i]; // перебирает все email по очереди.

        int atCount = 0; // счётчик символов @
        int atPosition = -1; // Эта переменная хранит позицию символа @ в строке
        boolean valid = true; // правильный email или нет.

        for (int j = 0; j < email.length(); j++) {
            if (email.charAt(j) == '@') {
                atCount++;
                atPosition = j;
            }
        }// Он перебирает символы конкретного email и считает количество символов @

        if (atCount != 1) {
            valid = false;// проверяем, что @ только одна
        } else if (atPosition < 3) {
            valid = false;// перед @ минимум 3 символа
        } else if (email.length() - atPosition - 1 < 5) {
            valid = false;// после @ минимум 5 символов
        } else if (email.indexOf('.', atPosition) == -1) {
            valid = false;// после @ должна быть точка
        } else if (email.charAt(0) == '.' || email.charAt(email.length() - 1) == '.') {
            valid = false;// точка не должна быть первым или последним символом
        }

        if (valid) {
            System.out.println(email + " - Верный ");
        } else {
            System.out.println(email + " - Неверный");
        }
    }
}
}