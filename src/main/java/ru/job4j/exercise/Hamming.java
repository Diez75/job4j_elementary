package ru.job4j.exercise;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int sum = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Hamming.checkStrings("2173896", "2233796"));
    }
}
