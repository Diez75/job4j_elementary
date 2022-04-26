package ru.job4j.exercise;

public class Cryptography {
    public static String code(String s) {
        if (s == "") {
            return "empty";
        }
        if (s.length() <= 4) {
            return s;
        }

        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < (s.length() - 4); i++) {
            str.setCharAt(i, '#');
        }

        String st = str.toString();
        return st;
    }

    public static void main(String[] args) {
        System.out.println(Cryptography.code("1223445464564565456453"));
    }
}
