import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livre> livres = new ArrayList<>();
        Bibliotheque bibliotheque = new Bibliotheque("Ma Bibliothèque", livres);
        String Box = "";
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les livres disponibles");
            System.out.println("3. Emprunter un livre");
            System.out.println("4. Retourner un livre");
            System.out.println("5. Quitter\n\n");
            
            Box = scanner.nextLine();
            switch (Box) {
                case "1":
                    bibliotheque.AjouterLivre();
                    break;
                case "2":
                    bibliotheque.afficherLivres();
                    break;
                case "3":
                    bibliotheque.ChangerListeLivre(EmprunterUnLivre.FenetreEmpruntDeLivre(bibliotheque.getLivres(), bibliotheque));
                    break;
                case "4":
                    bibliotheque.ChangerListeLivre(RetournerUnLivre.FenetreRetourDeLivre(bibliotheque.getLivres(), bibliotheque));
                    break;
                case "5":
                    System.out.println("Quitter");
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide");
            }
            System.out.println("");
        }
        scanner.close();
    }
}