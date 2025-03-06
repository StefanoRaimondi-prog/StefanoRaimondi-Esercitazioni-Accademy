// Classe astratta Veicolo
abstract class Veicolo {
    protected String marca;
    protected String modello;
    protected int annoProduzione;

    // Costruttore
    public Veicolo(String marca, String modello, int annoProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
    }

    // Metodo astratto che verrà implementato dalle sottoclassi
    public abstract void mostraDettagli();
}

// Classe Automobile che estende Veicolo
class Automobile extends Veicolo {
    private int numeroPorte;
    private String tipoCarburante;

    // Costruttore
    public Automobile(String marca, String modello, int annoProduzione, int numeroPorte, String tipoCarburante) {
        super(marca, modello, annoProduzione);
        this.numeroPorte = numeroPorte;
        this.tipoCarburante = tipoCarburante;
    }

    // Implementazione del metodo astratto
    @Override
    public void mostraDettagli() {
        System.out.println("Automobile: " + marca + " " + modello + " (" + annoProduzione + ")");
        System.out.println(" - Porte: " + numeroPorte);
        System.out.println(" - Carburante: " + tipoCarburante);
    }
}

// Classe Moto che estende Veicolo
class Moto extends Veicolo {
    private String tipoMoto;
    private int cilindrata;

    // Costruttore
    public Moto(String marca, String modello, int annoProduzione, String tipoMoto, int cilindrata) {
        super(marca, modello, annoProduzione);
        this.tipoMoto = tipoMoto;
        this.cilindrata = cilindrata;
    }

    // Implementazione del metodo astratto
    @Override
    public void mostraDettagli() {
        System.out.println("Moto: " + marca + " " + modello + " (" + annoProduzione + ")");
        System.out.println(" - Tipo: " + tipoMoto);
        System.out.println(" - Cilindrata: " + cilindrata + "cc");
    }
}

// Classe Camion che estende Veicolo
class Camion extends Veicolo {
    private double capacitaCarico;
    private int numeroAssi;

    // Costruttore
    public Camion(String marca, String modello, int annoProduzione, double capacitaCarico, int numeroAssi) {
        super(marca, modello, annoProduzione);
        this.capacitaCarico = capacitaCarico;
        this.numeroAssi = numeroAssi;
    }

    // Implementazione del metodo astratto
    @Override
    public void mostraDettagli() {
        System.out.println("Camion: " + marca + " " + modello + " (" + annoProduzione + ")");
        System.out.println(" - Capacità di carico: " + capacitaCarico + " tonnellate");
        System.out.println(" - Numero di assi: " + numeroAssi);
    }
}

// Classe Main per testare il codice
public class Astrazione1 {
    public static void main(String[] args) {
        // Creazione di oggetti
        Veicolo auto = new Automobile("Fiat", "Panda", 2022, 5, "Benzina");
        Veicolo moto = new Moto("Ducati", "Panigale", 2021, "Stradale", 1100);
        Veicolo camion = new Camion("Iveco", "Stralis", 2019, 15.5, 4);

        // Stampa dei dettagli
        auto.mostraDettagli();
        System.out.println();
        moto.mostraDettagli();
        System.out.println();
        camion.mostraDettagli();
    }
}
