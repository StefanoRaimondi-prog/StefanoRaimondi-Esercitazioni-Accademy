
import java.util.ArrayList;

public class Gestione_squadra {
    public static void main(String[] args) {
        // Creiamo la lista della squadra
        ArrayList<Calciatore> squadra = new ArrayList<>();

        String[] nomi = {
                "Gianluigi Buffon", "Paolo Maldini", "Franco Baresi", "Fabio Cannavaro",
                "Andrea Pirlo", "Gennaro Gattuso", "Francesco Totti", "Roberto Baggio",
                "Alessandro Del Piero", "Filippo Inzaghi", "Christian Vieri", "Marco Materazzi"
        };

        String[] ruoli = {
                "Portiere", "Difensore", "Difensore", "Difensore",
                "Centrocampista", "Centrocampista", "Centrocampista", "Attaccante",
                "Attaccante", "Attaccante", "Attaccante", "Difensore"
        };

        for (int index = 0; index < 12; index++) {
            squadra.add(new Calciatore(nomi[index], ruoli[index]));
        }

        System.out.println("Squadra:");
        for (Calciatore giocatore : squadra) {
            System.out.println(giocatore.nome + " - " + giocatore.ruolo);
        }
    }
}

class Calciatore {
    String nome;
    String ruolo;

    public Calciatore(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }
}
