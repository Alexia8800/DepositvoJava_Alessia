package EsericizioAnimaliEreditarietà;

public class Animale {
    private String nome;
    private int eta;


    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void faiVerso(){
        System.out.println("verso generico....");
    }

    public void stampaInformazioni(){
        System.out.println("Nome: " + nome + " età: " + eta);
        faiVerso();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

   
}
