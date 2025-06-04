package EsercizioEreditarietaRistorante;

public class Utente {
    
    protected String nome;
    protected String email;
    protected float soldi;

    public Utente(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.soldi = creditoGenerato();
    }

    private float creditoGenerato(){
        return (float) (Math.random() * 100); 
    }


    public void stampaDati(){
        System.out.println("Nome: " + nome);
         System.out.println("Email: " + email);
          System.out.println("Credito: " + soldi);
    }
}
