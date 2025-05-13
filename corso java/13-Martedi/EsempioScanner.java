import java.util.Scanner;

public class EsempioScanner {
    public static void main(String[] args) {
        //oggetto myObj, scanner serve per prendere l'input
        Scanner myObj = new Scanner(System.in);
       
        System.out.println("Enter username");

        String userName =  myObj.nextLine();
        System.out.println("Username is: " +userName);
        

        System.out.println("Inserisci età");
        int eta = myObj.nextInt();
        System.out.println("eta è: " +eta);


        System.out.println("Username is: " +userName+","+ " l'età è " +eta);

        
    }
}
