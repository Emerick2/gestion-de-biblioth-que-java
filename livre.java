public class Livre {
    private String titre;
    private String auteur;
    private String identifiant;

    public Livre(String titre, String auteur, String identifiant) {
        this.titre = titre;
        this.auteur = auteur;
        this.identifiant = identifiant;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public String getIdentifiant() { return identifiant; }

    @Override
    public String toString() {
        return identifiant + " - " + titre + " (" + auteur + ")";
    }
}

