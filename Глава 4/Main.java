/*
Кривошейцев Михаил Б763-2
Вариант А
11. Создать объект класса Наседка, используя классы Птица, Воробей.
Методы: летать, петь, нести яйца, высиживать птенцов.
*/

public class Main extends sparrow {
    public void buildNest() {
        System.out.println("Наседка строит гнездо");
    }
    public static void main(String[] args) {
        Main nestling = new Main();
        nestling.fly();
        nestling.sing();
        nestling.layEggs();
        nestling.hatchChicks();
        nestling.buildNest();
    }
}