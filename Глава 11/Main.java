/*
Кривошейцев Михаил Б763-2
Вариант А
11. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, -1, 4, -2, 7, -5, 6, -8};

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] < 0 && arr[j] >= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (arr[i] >= 0) {
                    i++;
                }
                if (arr[j] < 0) {
                    j--;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}