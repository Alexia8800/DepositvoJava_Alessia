package EsericizioAnimaliEreditarietà;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Cane> cani = new ArrayList<>();
        ArrayList<Gatto> gatti = new ArrayList<>();
        ArrayList<Pecora> pecore = new ArrayList<>();

        System.out.println("Quanti cani vuoi inserire?");
        int numeroCani = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroCani; i++) {

            System.out.println("Nome del cane: ");
            String nome = scanner.nextLine();
            System.out.println("Età del cane: ");
            int eta = scanner.nextInt();
            scanner.nextLine();

            cani.add(new Cane(nome, eta));

        }

        System.out.println("Quanti gatti vuoi inserire?");
        int numeroGatti = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroGatti; i++) {

            System.out.println("Nome del gatto: ");
            String nome = scanner.nextLine();
            System.out.println("Età del gatto: ");
            int eta = scanner.nextInt();
            scanner.nextLine();

            gatti.add(new Gatto(nome, eta));

        }

        System.out.println("Quante pecore vuoi inserire?");
        int numeroPecore = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroPecore; i++) {

            System.out.println("Nome della pecora: ");
            String nome = scanner.nextLine();
            System.out.println("Età della pecora: ");
            int eta = scanner.nextInt();
            scanner.nextLine();

            pecore.add(new Pecora(nome, eta));

        }

        System.out.println("----Animali dello Zoo---");
        for (Cane c : cani) {
            c.stampaInformazioni();
        }
        for (Gatto g : gatti) {
            g.stampaInformazioni();
        }

        for (Pecora p : pecore) {
            p.stampaInformazioni();
        }
        scanner.close();

    }
}
