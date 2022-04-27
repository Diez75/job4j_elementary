package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int fac = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
}
