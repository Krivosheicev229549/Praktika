/*
Кривошейцев Михаил Б763-2
Вариант А
11.  С помощью лямбда-выражений создать метод, который на вход принимает
строку, количество копий N, ограничение на общую длину L. Поставить
запятые после каждого слова, сделать N копий, и если слов больше M — не
выводить остальные слова.
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "Привет мир, это тест строк!";
        int N = 3;
        int L = 30;
        int M = 4;
        printCopies(input, N, L, M);
    }
    public static void printCopies(String input, int N, int L, int M) {
        Arrays.stream(input.split("\\s+"))
                .limit(M)
                .map(word -> String.format("%s,", word))
                .collect(Collectors.joining())
                .repeat(N)
                .chars()
                .limit(L)
                .forEach(ch -> System.out.print((char) ch));
    }
}


