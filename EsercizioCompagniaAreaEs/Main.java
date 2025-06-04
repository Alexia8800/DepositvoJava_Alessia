package EsercizioCompagniaAreaEs;

public class Main {
    public static void main(String[] args) {

        CompagniaAerea compagnia = new CompagniaAerea("SkyPotatoFly");

        Aereo a1 = new Aereo("Airbus A350", 325, "E654");
        Aereo a2 = new Aereo("Bombardier CRJ900", 90, "F987");

        Pilota p1 = new Pilota("Carlo Fontana", "BR005", 2000);
        Pilota p2 = new Pilota("Elena Gallo", "BR006", 1100);

        compagnia.aggiungiAereo(a1);
        compagnia.aggiungiAereo(a2);

        compagnia.aggiungiPilota(p1);
        compagnia.aggiungiPilota(p2);

        compagnia.stampaInformazioni();
    }
}
