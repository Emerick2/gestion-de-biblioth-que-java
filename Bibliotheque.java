import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String name = "";
    private List<Livre> livres = new ArrayList<Livre>();

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

    public void addLivres(Livre livre) {
        if (livres == null){
            livres = new ArrayList<Livre>();
        }
        this.livres.add(livre);
   }

   public void ChangerListeLivre(List<Livre> nouvelleListeLivre){
        this.livres = nouvelleListeLivre;
   }

   public static Livre TrouverLeLivreParID(List<Livre> listeLivre, int identifiantLivre){
        for (Livre leLivre : listeLivre) {
            if (leLivre != null){
                if (leLivre.getId() == identifiantLivre){
                    return leLivre;
                }
            }
        }
        return null;
   }

    public void Liste_de_livres() {
        String phraseBibliothequeVide = "Il n'y a pas de livre dans la bibliothèque.";
        if (livres == null || livres.isEmpty()) {
            System.out.println(phraseBibliothequeVide);
        } else {
            Boolean ilYAUnLivreOuPlus = false;
            for (int i = 0; i < livres.size(); i++) {
                Livre livre = this.livres.get(i);
                if (livre != null && !livre.IsAvailable()){
                    if (!ilYAUnLivreOuPlus) System.out.println("Voici la liste des livre à rendre dans notre bibliothèque :");
                    ilYAUnLivreOuPlus = true;
                    System.out.println(livre.getTitle() + " écrit par " + livre.getAuthor());
                }
            }
            if (!ilYAUnLivreOuPlus) System.out.println(phraseBibliothequeVide);
        }
    }

    public void Liste_de_livres_empruntable() {
        if (livres == null || livres.isEmpty()) {
            System.out.println("Il n'y a pas de livre dans la bibliothèque.");
        } else {
            Boolean ilYAUnLivreOuPlus = false;
            
            for (int i = 0; i < livres.size(); i++) {
                Livre livre = this.livres.get(i);
                if (livre != null && livre.IsAvailable()){
                    if (!ilYAUnLivreOuPlus) System.out.println("Voici la liste des livre empruntable de notre bibliothèque :");
                    ilYAUnLivreOuPlus = true;
                    System.out.println(livre.getTitle() + " écrit par " + livre.getAuthor());
                }
            }
            if (!ilYAUnLivreOuPlus) System.out.println("Il n'y a plus de livre empruntable dans notre bibliothèque, désolé...");
        }
    }

    public void Liste_de_livres_non_empruntable() {
        if (livres == null || livres.isEmpty()) {
            System.out.println("Il n'y a pas de livre dans la bibliothèque.");
        } else {
            Boolean ilYAUnLivreOuPlus = false;
            
            for (int i = 0; i < livres.size(); i++) {
                Livre livre = this.livres.get(i);
                if (livre != null && !livre.IsAvailable()){
                    if (!ilYAUnLivreOuPlus) System.out.println("Voici la liste des livre à rendre dans notre bibliothèque :");
                    ilYAUnLivreOuPlus = true;
                    System.out.println(livre.getTitle() + " écrit par " + livre.getAuthor());
                }
            }
            if (!ilYAUnLivreOuPlus) System.out.println("Il n'y a plus de livre à rendre dans notre bibliothèque, désolé.");
        }
    }
}