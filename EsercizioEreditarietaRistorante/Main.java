package EsercizioEreditarietaRistorante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ristorante ristorante = new Ristorante();

        List<Chef> listaChef = new ArrayList<>();
        List<Critico> listaCritici = new ArrayList<>();

        while (true) {
            System.out.println("menu");
            System.out.println("1. Crea Chef");
            System.out.println("2. Crea Critico");
            System.out.println("3. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 3)
                break;

            System.out.print("Inserisci nome: ");
            String nome = scanner.nextLine();
            System.out.print("Inserisci email: ");
            String email = scanner.nextLine();

            if (scelta == 1) {
                Chef chef = new Chef(nome, email);
                chef.stampaDati();
                listaChef.add(chef);
                System.out.print("Inserisci piatto da aggiungere: ");
                String piatto = scanner.nextLine();
                chef.aggiungiPiatto(piatto, ristorante);
            } else if (scelta == 2) {
                Critico critico = new Critico(nome, email);
                critico.stampaDati();
                listaCritici.add(critico);
                System.out.print("Inserisci valutazione: ");
                String valutazione = scanner.nextLine();
                critico.inserisciValutazione(valutazione, ristorante);
            }
        }

        System.out.println("\n--- CHEF CREATI ---");
        for (Chef chef : listaChef) {
            chef.stampaDati();
        }

        System.out.println("\n--- CRITICI CREATI ---");
        for (Critico critico : listaCritici) {
            critico.stampaDati();
        }

        scanner.close();
        System.out.println("Programma terminato.");

    }
}
