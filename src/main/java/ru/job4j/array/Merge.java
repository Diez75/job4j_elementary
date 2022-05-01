package ru.job4j.array;

/*
 Даны два отсортированных по возрастанию массива.
 Как без сортировки их объединить в третий массив?
*/

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int id1 = 0;
        int id2 = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (left[id1] < right[id2]) {
                rsl[i] = left[id1];
                id1 += 1;
            } else {
                rsl[i] = right[id2];
                id2 += 1;
            }
        }
        return rsl;
    }
}