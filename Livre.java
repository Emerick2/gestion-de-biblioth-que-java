public class Livre {
    private String titre;
    private int id;
    private String auteur;
    private boolean isAvailable;

     public Livre(String titre, String auteur, int id) {
        this.titre = titre;
        this.auteur = auteur;
        this.id = id;
        this.isAvailable = true;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getId() { return id; }
    public boolean isAvailable() { return isAvailable; }
    
    @Override
    public String toString() {
        return id + " - " + titre + " (" + auteur + ")";
    }
}

