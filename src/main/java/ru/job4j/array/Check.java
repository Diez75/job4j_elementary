package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length - 1; i++) {
            if (data[0] != data[i]) {
                    return false;
            }
        }
        return result;
    }
}


