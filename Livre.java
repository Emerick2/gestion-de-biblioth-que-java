public class Livre {
    private String title;
    private int id;
    private boolean isAvailable;

    public Livre(String title, int id) {
        this.title = title;
        this.id = id;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}