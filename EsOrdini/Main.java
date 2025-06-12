import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        OrdineService service = new OrdineService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Aggiungi ordine");
            System.out.println("2. Visualizza storico ordini");
            System.out.println("3. Aggiorna stato ordine");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            try {
                switch (scelta) {
                    case 1: service.aggiungiOrdine(scanner); break;
                    case 2: service.visualizzaStorico(scanner); break;
                    case 3: service.aggiornaStato(scanner); break;
                    case 0: System.exit(0);
                    default: System.out.println("Scelta non valida.");
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
    }
}