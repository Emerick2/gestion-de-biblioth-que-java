import java.util.Scanner;
import java.util.ArrayList;

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

    public void AjouterLivre(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Titre : ");
        String titre = scanner.nextLine();

        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();

        Livre livre = new Livre(titre, auteur, id);
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
    // public void Ajouter_livre(int id) {
    //     Scanner myObj = new Scanner(System.in);
    //     System.out.println("Entrez le titre du livre:");
    //     String title = myObj.nextLine();
    //     Livre livre = new Livre(title, id);
    //     for (int i = 0; i < livres.length; i++) {
    //         if (livres[i] == null) {
    //             livres[i] = livre;
    //             break;
    //         }
    //     }
    // }
    // public void Liste_de_livres() {
    //     for (int i = 0; i < livres.length; i++) {
    //         System.out.println(livres[i].getTitle());// + " of " + livres[i].getAuthor());
    //     }
    // }
}