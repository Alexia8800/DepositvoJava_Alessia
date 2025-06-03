import java.util.ArrayList;

public class EsercizioLavoroGruppo {

    // Classe che rappresenta un artista musicale
    static class Artista {
        private String nome;
        private String genereMusicale;

        // Costruttore della classe Artista
        public Artista(String nome, String genereMusicale) {
            this.nome = nome;
            this.genereMusicale = genereMusicale;
        }

        // Metodo per ottenere il nome dell'artista
        public String getNome() {
            return nome;

        }

        // Metodo per ottenere il genere musicale dell'artista
        public String getGenereMusicale() {
            return genereMusicale;

        }

    }

    // Classe che rappresenta un album musicale
    static class Album {
        private String titolo;
        private int annoPubblicazione;
        private Artista artista;

        // Costruttore della classe Album
        public Album(String titolo, int annoPubblicazione, Artista artista) {
            this.titolo = titolo;
            this.annoPubblicazione = annoPubblicazione;
            this.artista = artista;
        }

        // Metodo per ottenere il titolo dell'album
        public String getTitolo() {
            return titolo;
        }

        // Metodo per ottenere l'anno di pubblicazione
        public int getAnnoPubblicazione() {
            return annoPubblicazione;
        }

        // Metodo per ottenere l'artista associato all'album
        public Artista geArtista() {
            return artista;
        }
    }

    // Classe che rappresenta una casa discografica
    static class CasaDiscografica {
        private String nomeCasa;
        private ArrayList<Album> albumPubblicati;

        // Costruttore della classe CasaDiscografica
        public CasaDiscografica(String nomeCasa) {
            this.nomeCasa = nomeCasa;
            this.albumPubblicati = new ArrayList<>();
        }

        // Metodo per aggiungere un album alla lista di album pubblicati
        public void aggiungiAlbum(Album album) {
            albumPubblicati.add(album);
        }

        // Metodo per stampare gli album pubblicati dalla casa discografica
        public void stampaAlbum() {
            System.out.println("Album pubblicati da " + nomeCasa + " :");
            for (Album album : albumPubblicati) {
                System.out
                        .println("- " + album.getTitolo() + " " + "(" + album.getAnnoPubblicazione() + ")"
                                + " | Artista: "
                                + album.geArtista().getNome() + " genere: " + album.geArtista().getGenereMusicale());
            }
        }
    }

    public static void main(String[] args) {

        // Creazione degli artisti
        Artista artista1 = new Artista("Taylor Swift", "Pop");
        Artista artista2 = new Artista("Kendrick Lamar", "Hip-Hop");
        Artista artista3 = new Artista("Bob Marley", "Reggae");

        // creazione degli album
        Album album1 = new Album("Fearless", 2008, artista1);
        Album album2 = new Album("To Pimp a Butterfly", 2015, artista2);
        Album album3 = new Album("Natty Dread", 1974, artista3);

        // Creazione della casa discografica
        CasaDiscografica casa = new CasaDiscografica("Sony Music Italy");

        // aggiunta degli album
        casa.aggiungiAlbum(album1);
        casa.aggiungiAlbum(album2);
        casa.aggiungiAlbum(album3);

        // stampa degli album
        casa.stampaAlbum();
    }
}




