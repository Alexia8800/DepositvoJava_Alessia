import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EsercizioIncapsulamentoPiatti {

    // classe piatto speciale

    static class PiattoSpeciale {
        // lista di ingredienti privati
        private ArrayList<String> ingredientiPrivati;

        // lista di ingredienti pubblici
        public ArrayList<String> ingredientiPubblici;

        // prezzo fisso di base per il piatto
        private final double prezzobase = 1.0;

        // prezzo extra per ogni ingrediente
        private final double prezzoIngrediente = 2.0;

        // costruttore
        public PiattoSpeciale(ArrayList<String> pubblici, ArrayList<String> privati) {
            this.ingredientiPubblici = pubblici;
            this.ingredientiPrivati = privati;
        }

        //metodo per calcolare il prezzo totale
        public double calcolaPrezzo(){
            int totaleIngredienti = ingredientiPrivati.size() + ingredientiPubblici.size();
            return prezzobase + (prezzoIngrediente * totaleIngredienti);
        }

        //metodo per stampare il piatto
        public void stampaPiatto(){
            System.out.println("piatto composto da: ");
            System.out.println("ingredienti pubblici: " + ingredientiPubblici);
            System.out.print("ingredienti privati: "+ ingredientiPrivati);
            System.out.println("Prezzo totale: " + calcolaPrezzo() + " euro");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //lista fissa di ingredienti pubblici disponibili
        ArrayList<String> listaPubbliciDisponibili = new ArrayList<>(Arrays.asList(
            "Pane bianco", "Pane integrale", "Pane sesamo"
        ));

        //lista fissa di ingredienti privati accettabili
       ArrayList<String> listaPrivatiDisponibili = new ArrayList<>(Arrays.asList(
            "Prosciutto", "Formaggio", "Insalata", "Pomodoro", "Salsa"
        ));

         while (true) {
            System.out.println("\n=== MENU ORDINAZIONE PIATTO SPECIALE ===");

            // Selezione ingredienti pubblici
            ArrayList<String> pubbliciScelti = new ArrayList<>();
            System.out.println("Ingredienti pubblici disponibili:");
            for (int i = 0; i < listaPubbliciDisponibili.size(); i++) {
                System.out.println((i + 1) + ". " + listaPubbliciDisponibili.get(i));
            }
            System.out.print("Seleziona un numero (1-3) per il tipo di pane: ");
            int sceltaPane = scanner.nextInt();
            scanner.nextLine(); // Pulisce il buffer
            if (sceltaPane >= 1 && sceltaPane <= listaPubbliciDisponibili.size()) {
                pubbliciScelti.add(listaPubbliciDisponibili.get(sceltaPane - 1));
            } else {
                System.out.println("Scelta non valida, ritorno al menu.");
                continue;
            }

            // Inserimento ingredienti privati
            ArrayList<String> privatiScelti = new ArrayList<>();
            System.out.println("Ingredienti privati disponibili: " + listaPrivatiDisponibili);
            System.out.println("Inserisci gli ingredienti privati uno alla volta (digita 'fine' per terminare):");
            while (true) {
                System.out.print("Ingrediente: ");
                String ingr = scanner.nextLine();
                if (ingr.equalsIgnoreCase("fine")) {
                    break;
                }
                if (listaPrivatiDisponibili.contains(ingr)) {
                    privatiScelti.add(ingr);
                } else {
                    System.out.println("Ingrediente non valido, riprova.");
                }
            }

            // Creazione del piatto
            PiattoSpeciale piatto = new PiattoSpeciale(pubbliciScelti, privatiScelti);
            piatto.stampaPiatto();

            // Loop di continuazione
            System.out.print("Vuoi ordinare un altro piatto? (s/n): ");
            String risposta = scanner.nextLine();
            if (!risposta.equalsIgnoreCase("s")) {
                System.out.println("Grazie per aver ordinato. Arrivederci!");
                break;
            }
        }

        scanner.close();
    }
}