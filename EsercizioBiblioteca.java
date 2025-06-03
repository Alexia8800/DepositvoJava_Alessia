import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioBiblioteca {

    // Classe interna Book
    static class Book {
        private String title;
        private String author;
        private boolean isAvailable;

        // Costruttore
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        // Metodi
        public void displayBookInfo() {
            System.out.println("Titolo: " + title);
            System.out.println("Autore: " + author);
            System.out.println("Disponibile: " + (isAvailable ? "Sì" : "No"));
            System.out.println("-------------------------");
        }

        // metodo getter per il titolo
        public String getTitle() {
            return title;
        }

        // Metodo per verificare se il libro è disponibile
        public boolean isAvailable() {
            return isAvailable;
        }

        // Metodo per impostare la disponibilità del libro
        public void setAvailable(boolean available) {
            isAvailable = available;
        }
    }

    // classe interna Library

    static class Library {

        // Lista di libri presenti in biblioteca
        private ArrayList<Book> books = new ArrayList<>();

        // Metodo per aggiungere un libro alla biblioteca
        public void addBook(Book book) {
            books.add(book);
            System.out.println("Libro aggiunto: " + book.getTitle());
        }

        // Metodo per visualizzare tutti i libri presenti in biblioteca
        public void displayBooks() {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }

        // Metodo per prendere in prestito un libro
        public void borrowBook(String title) {
            for (Book book : books) {
                // Cerca il libro per titolo (ignorando maiuscole/minuscole)
                if (book.getTitle().equalsIgnoreCase(title)) {
                    // Se il libro è disponibile, viene prestato
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Hai preso in prestito: " + title);
                    } else {
                        System.out.println("Il libro non è disponibile.");
                    }
                    return;
                }
            }
            System.out.println("Libro non trovato.");
        }
    }

    // Metodo principale
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Aggiunta di alcuni libri alla biblioteca
        library.addBook(new Book("Il Decamerone", "Giovanni Boccaccio"));
        library.addBook(new Book("Odissea", "Omero"));
        library.addBook(new Book("Il ritratto di Dorian Gray", "Oscar Wilde"));

        boolean running = true; // Variabile per controllare il ciclo del menu

        while (running) {
            System.out.println("\n--- Menu Biblioteca ---");
            System.out.println("1. Mostra libri");
            System.out.println("2. Prendi in prestito un libro");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione: ");
            int choise = scanner.nextInt(); // Lettura della scelta dell'utente
            scanner.nextLine();

            switch (choise) {
                case 1:
                    // Mostra l'elenco dei libri
                    library.displayBooks();
                    break;

                case 2:
                    System.out.print("Inserisci il titolo del libro ");
                    String tile = scanner.nextLine();
                    library.borrowBook(tile);
                    break;
                case 3:
                    running = false;
                    System.out.println("Arrivederci, buona serata");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }
        scanner.close();
    }

}
