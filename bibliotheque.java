public class bibliotheque {
    private String name;
    private Livre[] livres;

    public bibliotheque(String name, Livre[] livres) {
        this.name = name;
        this.livres = livres;
    }

    public String getName() {
        return name;
    }

    public Livre[] getLivres() {
        return livres;
    }
}