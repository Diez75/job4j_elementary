package ru.job4j.exercise;

public class Symmetry {
    public static void main(String[] args) {
        int i = 123221;
        String str = Integer.toString(i);
        System.out.println(str);
        System.out.println("str.length() / 2 = " + str.length() / 2);
        for (int j = 0; j < (str.length() / 2); j++) {
            System.out.println(j);
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Не симметрично");
            }
        }
    }
}

/*
for (int j = 0; j > (str.length() / 2); j++) {
            System.out.println(str.charAt(i + 1));
            System.out.println(str.charAt(str.length() - 1 - i));
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                System.out.println(str.charAt(i));
                continue;
            }
        }
*/