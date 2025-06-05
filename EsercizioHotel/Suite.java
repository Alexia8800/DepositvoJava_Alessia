package EsercizioHotel;

public class Suite extends Camera{

      private String serviziExtra;

    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo);
        this.serviziExtra = serviziExtra;
    }

    public String getServiziExtra() {
        return serviziExtra;
    }

    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    // Override di dettagli()
    @Override
    public void dettagli() {
        super.dettagli(); // stampa numero e prezzo
        System.out.println("Servizi extra: " + serviziExtra);
    }

    @Override
    public void dettagli(boolean conPrezzo) {
        super.dettagli(conPrezzo);
        System.out.println("Servizi extra: " + serviziExtra);
    }
}