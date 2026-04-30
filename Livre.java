public class Livre {
    private String title;
    private String author;
    private int id;
    private Boolean isAvailable;

    public Livre(String title) {
        this.title = title;
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