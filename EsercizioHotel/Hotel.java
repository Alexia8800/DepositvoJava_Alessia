package EsercizioHotel;

import java.util.ArrayList;

public class Hotel {

     private String nome;
    private ArrayList<Camera> camere = new ArrayList<>();

    public Hotel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }

    public void aggiungiCamera(Camera camera) {
        camere.add(camera);
    }

    // Metodo statico per contare le Suite
    public static int contaSuite(ArrayList<Camera> lista) {
        int count = 0;
        for (Camera c : lista) {
            if (c instanceof Suite) {
                count++;
            }
        }
        return count;
    }
}