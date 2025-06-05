package EsercizioHotel;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel SkyAce");

        // Aggiungo 2 camere normali
        Camera camera1 = new Camera(105, 80.0f);
        Camera camera2 = new Camera(101, 80.0f);

        // Aggiungo 2 suite
        Suite suite1 = new Suite(208, 120.0f, "Suite Jacuzzi, Con Vista mare");
        Suite suite2 = new Suite(205, 180.0f, "Suite Jacuzzi, Minibar, con aggiunta del Balcone");

        hotel.aggiungiCamera(camera1);
        hotel.aggiungiCamera(camera2);
        hotel.aggiungiCamera(suite1);
        hotel.aggiungiCamera(suite2);

       System.out.println("=== Dettagli camere ===");
        camera1.dettagli(); // normale
        camera2.dettagli(true); // overload
        //  camera2.dettagli(false); // overload, senza prezzo
        suite1.dettagli(); // override
        suite2.dettagli(true); // overload + override


        System.out.println("\nTotale suite presenti: " +
                Hotel.contaSuite(hotel.getCamere()));
    }
}
