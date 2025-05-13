import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //creazione dell'oggetto myObj per l'eggere l'input grazie allo scanner
        Scanner myObj = new Scanner(System.in);

        // String
        System.out.println("Inserisci il valore tipo String:"); //chiede all'utente di inserire il tipo String
        String nome = myObj.nextLine();
        System.out.println("Esempio di tipo String: " + nome); //legge il valore di tipo string inserito dall'utente

        // Boolean
        System.out.println("Inserisci il valore tipo Boolean (true/false):");
        boolean boolValore = myObj.nextBoolean();
        System.out.println("Esempio di tipo Boolean: " + boolValore);

        // Byte
        System.out.println("Inserisci il valore tipo Byte:");
        byte byteValore = myObj.nextByte();
        System.out.println("Esempio di tipo Byte: " + byteValore);

        // Double
        System.out.println("Inserisci il valore tipo Double:");
        double doubleValore = myObj.nextDouble();
        System.out.println("Esempio di tipo Double: " + doubleValore);

        // Float
        System.out.println("Inserisci il valore tipo Float:");
        float floatValore = myObj.nextFloat();
        System.out.println("Esempio di tipo Float: " + floatValore);

        // Int
        System.out.println("Inserisci il valore tipo Int:");
        int intValore = myObj.nextInt();
        System.out.println("Esempio di tipo Int: " + intValore);

        // Long
        System.out.println("Inserisci il valore tipo Long:");
        long longValore = myObj.nextLong();
        System.out.println("Esempio di tipo Long: " + longValore);

        // Short
        System.out.println("Inserisci il valore tipo Short:");
        short shortValore = myObj.nextShort();
        System.out.println("Esempio di tipo Short: " + shortValore);


    }
}
