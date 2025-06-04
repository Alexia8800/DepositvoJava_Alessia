package EsercizioEreditarietaRistorante;

public class Chef extends Utente{

    public Chef(String nome, String email) {
        super(nome, email);
        //TODO Auto-generated constructor stub
    }

     public void aggiungiPiatto(String piatto, Ristorante ristorante) {
        ristorante.pasti.add(piatto);
        System.out.println("Hai aggiunto il piatto: " + piatto);
    }
}