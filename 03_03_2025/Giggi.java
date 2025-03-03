public class Giggi {
    public static void main(String[] args) {
        Squadra squadra = new Squadra();
        squadra.stampaSquadra();
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

class Squadra {
    Calciatore[] giocatori = new Calciatore[12]; // Array fisso di 12 giocatori

    // Costruttore: inizializza la squadra
    public Squadra() {
        giocatori[0] = new Calciatore("Gianluigi Buffon", "Portiere");
        giocatori[1] = new Calciatore("Paolo Maldini", "Difensore");
        giocatori[2] = new Calciatore("Franco Baresi", "Difensore");
        giocatori[3] = new Calciatore("Fabio Cannavaro", "Difensore");
        giocatori[4] = new Calciatore("Andrea Pirlo", "Centrocampista");
        giocatori[5] = new Calciatore("Gennaro Gattuso", "Centrocampista");
        giocatori[6] = new Calciatore("Francesco Totti", "Centrocampista");
        giocatori[7] = new Calciatore("Roberto Baggio", "Attaccante");
        giocatori[8] = new Calciatore("Alessandro Del Piero", "Attaccante");
        giocatori[9] = new Calciatore("Filippo Inzaghi", "Attaccante");
        giocatori[10] = new Calciatore("Christian Vieri", "Attaccante");
        giocatori[11] = new Calciatore("Marco Materazzi", "Difensore");
    }

    // Metodo per stampare i giocatori
    public void stampaSquadra() {
        System.out.println("Squadra composta da 12 giocatori:");
        for (int i = 0; i < giocatori.length; i++) {
            System.out.println(giocatori[i].nome + " - " + giocatori[i].ruolo);
        }
    }
}
