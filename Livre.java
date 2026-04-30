public class Livre {
    private String title;
    private String author;
    private int id;
    private Boolean isAvailable;
    public static int numberOfBooks = 0;

    public Livre(String title, String author) {
        numberOfBooks++;
        this.title = title;
        this.author = author;
        this.id = numberOfBooks;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public Boolean IsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean valeur) {
        isAvailable = valeur;
    }
}