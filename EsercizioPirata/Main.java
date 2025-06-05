package EsercizioPirata;

public class Main {
  public static void main(String[] args) {
        // Creo due oggetti Persona e li faccio salutare
        Persona persona1 = new Persona("Alessia");
        Persona persona2 = new Persona("Mario");
        persona1.saluta();
        persona2.saluta();

        // Creo un oggetto Pirata e lo faccio salutare
        Pirata pirata1 = new Pirata("Barbanera");
        pirata1.saluta();
    }
}