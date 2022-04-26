package ru.job4j.exercise;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.charAt(0) == r.charAt(r.length() - 1)
                || (l.charAt((l.length() - 1)) == r.charAt(0))
                || ((l.length() == 0) && (r.length() == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(PairsCharString.check("A1", "BA"));
    }
}