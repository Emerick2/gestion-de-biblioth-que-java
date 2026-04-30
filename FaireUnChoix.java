import java.util.Scanner;

public class FaireUnChoix {
    public static int NouveauChoix(int min, int max){
        // minimum et maximum sont tous les deux inclus.
        if (min > max){
            int temps = min;
            min = max;
            max = temps;
        }
        Integer valeurChoisie = min;
        Boolean valeurAffecter = false;
        System.out.println("Veuillez saisir un nombre entre "+min+" et "+max+".");
        while (!valeurAffecter) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            try {
                if (str != null){
                    valeurChoisie = Integer.parseInt(str);
                    if (valeurChoisie != null && valeurChoisie >= min && valeurChoisie <= max){
                        valeurAffecter = true;
                    }
                }
            } catch(Error e){
                throw e;
            }
        }

        return valeurChoisie;//Integer.parseInt(valeurChoisie);
    }
}
