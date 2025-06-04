import java.util.ArrayList;
import java.util.Scanner;

public class IncapsulamentoClasseStudente {

    static class Studente {
        // Attributi privati
        private String nome;
        private int voto;
        private static int nextId = 1;
        private int id;

        // Costruttore
        public Studente(String nome, int voto) {
            this.nome = nome;
            this.id = nextId++;
            setVoto(voto); // usa il setter per validare il voto
        }

        // Getter per nome
        public String getNome() {
            return nome;
        }

        // Getter per voto
        public int getVoto() {
            return voto;
        }

        // Getter per ID
        public int getId() {
            return id;
        }

        // Setter per voto con validazione
        public void setVoto(int nuovoVoto) {
            if (nuovoVoto >= 0 && nuovoVoto <= 10) {
                this.voto = nuovoVoto;
            } else {
                System.out.println("Errore: il voto deve essere tra 0 e 10.");
            }
        }

        // Metodo per stampare le info dello studente
        public void stampaInfo() {
            System.out.println("Studente: " + nome + " | Voto: " + voto + " | ID: " + id);
        }
    }

    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Crea uno studente
        Studente s1 = new Studente("Luca", 8);
        studenti.add(s1);

        // Prova a cambiare il voto
        System.out.println("Prova a impostare voto = 9");
        s1.setVoto(9);
        s1.stampaInfo();

        System.out.println("Prova a impostare voto = 11 (non valido)");
        s1.setVoto(11);
        s1.stampaInfo();

        // Aggiungiamo un altro studente
        Studente s2 = new Studente("Giulia", 7);
        studenti.add(s2);

        s2.stampaInfo();

        // Cerca studente per nome
        System.out.print("Inserisci nome studente da cercare: ");
        String nomeRicerca = scanner.nextLine();

        boolean trovato = false;
        for (Studente s : studenti) {
            if (s.getNome().equalsIgnoreCase(nomeRicerca)) {
                s.stampaInfo();
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Studente non trovato.");
        }

        scanner.close();
    }
}
