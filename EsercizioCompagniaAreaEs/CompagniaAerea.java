package EsercizioCompagniaAreaEs;

import java.util.ArrayList;

public class CompagniaAerea {

    private String nome;
    private ArrayList<Aereo> flotta;
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
