import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        System.out.println("Livre ajouté avec succès !");
    }

    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque.");
            return;
        }
        System.out.println("Liste des livres :");
        for (Livre l : livres) {
            System.out.println("- " + l);
        }
    }
}

