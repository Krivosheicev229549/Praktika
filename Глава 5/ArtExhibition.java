/*
Кривошейцев Михаил Б763-2
Вариант А
11.  Создать класс Художественная Выставка с внутренним классом, с помощью объектов которого можно хранить информацию о картинах, авторах и времени проведения выставок.
*/


import java.util.ArrayList;

public class ArtExhibition {
    private String name;
    private String date;
    private ArrayList<Artwork> artworks;
    public ArtExhibition(String name, String date) {
        this.name = name;
        this.date = date;
        this.artworks = new ArrayList<>();
    }
    public void addArtwork(String title, String author) {
        Artwork artwork = new Artwork(title, author);
        artworks.add(artwork);
    }
    public void displayArtworks() {
        System.out.println("Работы на выставке '" + name + "' на " + date + ":");
        for (Artwork artwork : artworks) {
            System.out.println("Название: " + artwork.getTitle() + ", Автор: " + artwork.getAuthor());
        }
    }

    private class Artwork {
        private String title;
        private String author;
        public Artwork(String title, String author) {
            this.title = title;
            this.author = author;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
    }
    public static void main(String[] args) {
        ArtExhibition exhibition = new ArtExhibition("Выставка современного искусства", "28/09/2023");
        exhibition.addArtwork("Звездная ночь", "Винсент Ван Гог");
        exhibition.addArtwork("Утро в сосновом лесу", "Иван Шишкин");
        exhibition.displayArtworks();
    }
}
