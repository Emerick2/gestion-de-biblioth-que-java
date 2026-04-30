public class bibliotheque {
    private String name;
    private Livre[] listlivres;

    public bibliotheque(String name, Livre[] listlivres) {
        this.name = name;
        this.listlivres = listlivres;
    }

    public String getName() {
        return name;
    }

    public Livre[] getLivres() {
        return listlivres;
    }
}