import java.util.Scanner;

public class Menu {
    public Bibliotheque bibliotheque;
    public Menu() {
        Livre[] livres = new Livre[0];
        this.bibliotheque = new Bibliotheque("Ma Bibliothèque", livres);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        String Box = "";
        int id = 0;

        while (!Box.equals("5")) {
            System.out.println("Bienvenue à la bibliothèque");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les livres disponibles");
            System.out.println("3. Emprunter un livre");
            System.out.println("4. Retourner un livre");
            System.out.println("5. Quitter\n\n");
            Scanner myObj = new Scanner(System.in);
            Box = myObj.nextLine();
            switch (Box) {
                case "1":
                    if (id >= 10) {
                        System.out.println("La bibliothèque est pleine");
                        break;
                    } else {
                        menu.bibliotheque.Ajouter_livre(id);
                        id++;
                    }
                    break;
                case "2":
                    menu.bibliotheque.Liste_de_livres();
                    break;
                case "3":
                    System.out.println("Emprunter un livre");
                    break;
                case "4":
                    System.out.println("Retourner un livre");
                    break;
                case "5":
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Option invalide");
            }
            System.out.println("");
        } 
    }
}
