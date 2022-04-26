package ru.job4j.exercise;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder builder = new StringBuilder();
        for (String i : s.split(" ")) {
            builder.append(i.substring(0, 1).toUpperCase());
        }
        return builder.toString();
    }
}






/*
1.8. Аббревиатуры
Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие
выражения сокращаем, забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с
прописной буквы. Необходимо из полученной строки сформировать аббревиатуру.
Для формирования новой строки используйте StringBuilder и его метод append().
 */