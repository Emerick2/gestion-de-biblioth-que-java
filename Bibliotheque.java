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
}