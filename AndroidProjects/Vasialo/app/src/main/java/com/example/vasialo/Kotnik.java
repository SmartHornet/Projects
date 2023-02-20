package com.example.vasialo;

public class Kotnik {
    String GetWork(String string) {
        if (string.equals("Вася")) {
            return "Страдает Хуйней";
        }

        if (string.equals("Коть")) {
            return "Лапку Лижет";
        }

        if (string.equals("Собака")) {
            return "Делает Кусь";
        }

        return "";
    }
}
