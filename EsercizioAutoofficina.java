import java.util.ArrayList;

public class EsercizioAutoofficina {

    static class Auto {
        private String targa;
        private String modello;

        public Auto(String targa, String modello) {
            this.targa = targa;
            this.modello = modello;

        }

        public String getTarga() {
            return targa;
        }

        public String getModello() {
            return modello;
        }

        public String toString() {
            return "Targa: " + targa + " Modello: " + modello;
        }

    }

    static class Officina {
        private ArrayList<Auto> listaAuto;

        public Officina() {
            listaAuto = new ArrayList<>();
        }

        public void aggiungiAuto(Auto auto) {
            listaAuto.add(auto);
        }

        public void stampaElencoAuto() {
            System.out.println("Elenco auto presenti nell'officina: ");
            for (Auto auto : listaAuto) {
                System.out.println(auto);
            }
        }
    }

    public static void main(String[] args) {

        Officina officina = new Officina();

        Auto auto1 = new Auto("ABCS123", "Audi Q2");
        Auto auto2 = new Auto("OEPC125", "Audi SQ2");
        Auto auto3 = new Auto("OPEF567", "Alfa Romeo Giulietta");

        officina.aggiungiAuto(auto1);
        officina.aggiungiAuto(auto2);
        officina.aggiungiAuto(auto3);

        officina.stampaElencoAuto();

    }

}
