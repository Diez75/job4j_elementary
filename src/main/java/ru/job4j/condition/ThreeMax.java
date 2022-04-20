package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        result = first > second ? first : second;
        result = third > result ? third : result;
        return result;
    }
}