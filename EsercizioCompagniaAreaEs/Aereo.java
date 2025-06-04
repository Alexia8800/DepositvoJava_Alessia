package EsercizioCompagniaAreaEs;

public class Aereo {

    private String modello;
    private int numeroPosti;
    private String codice;

    public Aereo(String modello, int numeroPosti, String codice) {
        this.modello = modello;
        setNumeroPosti(numeroPosti);
        this.codice = codice;

    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    // Viene accettato solo se il numero è maggiore di 0.
    public void setNumeroPosti(int numeroPosti) {
        if (numeroPosti > 0) {
            this.numeroPosti = numeroPosti;
        }
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String toString() {
        return "Aereo: " + modello + ", posti: " + numeroPosti + ", codice: " + codice;
    }

}
