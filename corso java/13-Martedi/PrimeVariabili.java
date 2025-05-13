public class PrimeVariabili {
    public static void main(String[] args) {

            int provaNumero = 12;
            String provaTesto = "Ciaoo";
            boolean provaBool = true;

            boolean provaBool2;
            provaBool = false;
            provaBool = true;

            System.out.print(provaNumero+" "+provaTesto);

            //final serve per rendere immutabili oggetti, classi, metodi o variabili.
            //per valori che non cambiano
            final int provaaNumero = 15;
            provaNumero = 20;
            

            //combinare il testo con variabile
             String testo = "Mondo";
            System.out.print("ciao"+provaTesto);

            //È possibile farlo anche all'interno di una variabile e anche tra variabili
            String firstPart = "Ciao ";
            String lastPart = "Mondo";
            String fullPart = firstPart + lastPart;
            System.out.println(fullPart);

            

    }

}
