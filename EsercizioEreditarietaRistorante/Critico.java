package EsercizioEreditarietaRistorante;

public class Critico extends Utente {

    public Critico(String nome, String email) {
        super(nome, email);
        //TODO Auto-generated constructor stub
    }
    
  public void inserisciValutazione(String valutazione, Ristorante ristorante) {
        ristorante.valutazioni.add(valutazione);
        System.out.println("Hai inserito la valutazione: " + valutazione);
    }
}