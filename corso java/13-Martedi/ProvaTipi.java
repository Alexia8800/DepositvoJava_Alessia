public class ProvaTipi {
    public static void main(String[] args) {
        
        //provando i tipi 

        System.out.println(3*2);
        System.out.println(3);

        System.out.println(358);
        
        System.out.println(50000);
        
        /*
         * 
         * commento multilinea
         * 
         */

         //per i valori numerici il + funziona come operatore matematico
         int x=5;
         int y=6;
         System.out.println(x+y);

         /*per dichiarare più variabili dello stesso tipo è possibile utilizzare
          un elenco separato da virgole */
         int a=5, b=6, c=50;
         System.out.println(a+b+c);

         //è inoltre possibile assegnare lo stesso valore a più variabili in una riga
           //indicizzazione a cascata
         int d,e,f;
         d=e=f=50;
         System.out.println(d+e+f);
       


         //float deve finire con f alla fine 
         float myFloat= 5.75f;

         //double deve finire con d alla fine 
         double myDouble = 19.99d;
         System.out.println(myDouble);



    }
}
