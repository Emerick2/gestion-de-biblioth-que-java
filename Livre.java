public class Livre {
    public String titre = "";
    public String auteur = "";
    public int identifiant = 0;
    public bool livreEmprinter = false;

    public void Livre(String titre, String auteur, int identifiant){
        this.titre = titre;
        this.auteur = auteur;
        this.identifiant = identifiant;
    }
}
