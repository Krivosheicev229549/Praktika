/*
Кривошейцев Михаил Б763-2
Вариант А
В символьном файле находится информация об N числах с плавающей запятой с указанием локали каждого числа отдельно. Прочитать информацию из файла. Проверить на корректность, то есть являются ли числа числами. Преобразовать к числовымзначениями вычислить сумму и среднее значениепрочитанных чисел. Создать собственный класс исключения. Предусмотреть обработку исключений, возникающих при нехватке памяти, отсутствии самого файла по заданному адресу, отсутствии или некорректности требуемой записи в файле, недопустимом значении числа (выходящим за пределы максимально допустимых значений) и т.д.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("numbers.txt"));
            scanner.useLocale(Locale.US);
            double sum = 0;
            int count = 0;
            while (scanner.hasNext()) {
                try {
                    double number = scanner.nextDouble();
                    if (Double.isNaN(number) || Double.isInfinite(number)) {
                        throw new InvalidNumberException("Неправильный номер: " + number);
                    }
                    sum += number;
                    count++;
                } catch (InvalidNumberException | NumberFormatException e) {
                    System.err.println("Номер ошибки чтения: " + e.getMessage());
                }
            }
            if (count == 0) {
                System.out.println("В файле не найдено номеров.");
            } else {
                double average = sum / count;
                System.out.println("Сумма: " + sum);
                System.out.println("Среднее значение: " + average);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл numbers.txt не найден");
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}




