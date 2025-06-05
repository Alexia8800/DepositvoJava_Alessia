package EsericizioAnimaliEreditarietà;

public class Gatto extends Animale {

    Gatto(String nome, int eta) {
        super(nome, eta);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void faiVerso() {
        System.out.println("miao");
       
    }


}
