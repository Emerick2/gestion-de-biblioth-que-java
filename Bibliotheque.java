import java.util.List;

public class Bibliotheque {
    private String name;
    private List<Livre> livres;

    public Bibliotheque(String name, List<Livre> livres) {
        this.name = name;
        this.livres = livres;
    }

    public String getName() {
        return name;
    }

    public List<Livre> getLivres() {
        return livres;
    }
}