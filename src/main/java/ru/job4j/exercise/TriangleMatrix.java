package ru.job4j.exercise;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int sum = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = sum;
                sum += 1;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        int[][] data = TriangleMatrix.rows(4);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
        }
    }
}

