import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bibliotheque biblio = new Bibliotheque();

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les livres");
            System.out.println("3. Quitter");
            System.out.print("Choix : ");

            String saisie = scanner.nextLine();  
            switch (saisie) {
                case "1":
                    System.out.print("Titre : ");
                    String titre = scanner.nextLine();

                    System.out.print("Auteur : ");
                    String auteur = scanner.nextLine();

                    System.out.print("Identifiant : ");
                    String id = scanner.nextLine();

                    Livre livre = new Livre(titre, auteur, id);
                    biblio.ajouterLivre(livre);
                    break;

                case "2":
                    biblio.afficherLivres();
                    break;

                case "3":
                    System.out.println("Au revoir !");
                    continuer = false;
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}

