import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String name;
    private ArrayList<Livre> livres = new ArrayList<>();

    public Bibliotheque(String name, ArrayList<Livre> livres) {
        this.name = name;
        this.livres = livres;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void AjouterLivre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Titre : ");
        String titre = scanner.nextLine();

        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();

        Livre livre = new Livre(titre, auteur);
        livres.add(livre);
        System.out.println("Livre ajouté avec succès !");
    }

    public void ChangerListeLivre(ArrayList<Livre> nouvelleListeLivre){
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

    public void Liste_de_livres() {
        if (livres == null || livres.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < livres.size(); i++) {
                Livre livre = this.livres.get(i);
                System.out.println(livre.getTitre() + " of " + livre.getAuteur());
            }
        }
    }
}