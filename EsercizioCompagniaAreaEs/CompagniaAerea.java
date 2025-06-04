package EsercizioCompagniaAreaEs;

import java.util.ArrayList;

public class CompagniaAerea {

    private String nome;
    
    // Lista degli aerei appartenenti alla compagnia
    private ArrayList<Aereo> flotta;
    
    // Lista dei piloti che lavorano per la compagnia
    private ArrayList<Pilota> piloti;

    public CompagniaAerea(String nome) {
        this.nome = nome;
        this.flotta = new ArrayList<>();
        this.piloti = new ArrayList<>();
    }

    public void aggiungiAereo(Aereo aereo) {
        flotta.add(aereo);
    }

    public void aggiungiPilota(Pilota pilota) {
        piloti.add(pilota);
    }

    // Per stampare tutte le informazioni della compagnia e i piloti
    public void stampaInformazioni() {
        System.out.println("Compagnia: " + nome);
        System.out.println("Flotta:");
        for (Aereo aereo : flotta) {
            System.out.println("  " + aereo);
        }
        System.out.println("Piloti:");
        for (Pilota pilota : piloti) {
            System.out.println("  " + pilota);
        }
    }
}
