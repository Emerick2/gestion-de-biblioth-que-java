public class Livre {
    private String titre;
    private int id;
    private String auteur;
    private boolean isAvailable;
    public static int numberOfBooks = 0;

     public Livre(String titre, String auteur) {
        numberOfBooks++;
        this.titre = titre;
        this.auteur = auteur;
        this.id = numberOfBooks;
        this.isAvailable = true;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getId() { return id; }
    public boolean isAvailable() { return isAvailable; }
    
    public void setIsAvailable(Boolean valeur) {
        isAvailable = valeur;
    }

   public void ToString(){
        String emprunt = "emprunté";
        if (isAvailable()){
            emprunt = "non emprunté";
        }
        System.out.println(getId()+" | "+getTitre()+" - "+getAuteur()+ " ("+emprunt+")");
    }
}

