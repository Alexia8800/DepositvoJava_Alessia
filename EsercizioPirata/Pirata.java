package EsercizioPirata;

public class Pirata extends Persona {
  public Pirata(String nome) {
        super(nome);
    }

    @Override
    public void saluta() {
        System.out.println(" Sono il pirata " + nome + "!");
    }
}