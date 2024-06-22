/*
Кривошейцев Михаил Б763-2
Вариант А
3.  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        System.out.println("Случайные числа в одну строку с пробелом:");
        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();
        System.out.println("Случайные числа в новой строке:");
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}