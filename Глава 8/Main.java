/*
Кривошейцев Михаил Б763-2
Вариант А
11.   Найти, каких букв, гласных или согласных, больше в каждом предложении текста.
*/

public class Main {
    public static void main(String[] args) {
        String text = "В темные времена хорошо видно светлых людей.";
        String[] sentences = text.split("[.!?]");

        for (String sentence : sentences) {
            int vowelsCount = 0;
            int consonantsCount = 0;
            String vowels = "аеёиоуыэюя";
            String consonants = "бвгджзйклмнпрстфхцчшщ";

            for (char ch : sentence.toCharArray()) {
                if (vowels.indexOf(Character.toLowerCase(ch)) >= 0) {
                    vowelsCount++;
                } else if (consonants.indexOf(Character.toLowerCase(ch)) >= 0) {
                    consonantsCount++;
                }
            }

            System.out.println("Предложение: " + sentence.trim());
            System.out.println("Гласных букв: " + vowelsCount);
            System.out.println("Согласных букв: " + consonantsCount);
        }
    }
}



