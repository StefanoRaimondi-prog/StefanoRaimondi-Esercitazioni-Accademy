public class Auto {

    public static void main(String[] args) {
        // Creazione di un oggetto Auto
        Auto auto = new Auto("Ferrari", "Rosso");

        // Utilizzo dei metodi della classe Auto
        System.out.println("Modello: " + auto.modello);
        System.out.println("Colore: " + auto.colore);

        auto.accelera(50);
        auto.accelera(20);
        auto.frena(30);
        auto.frena(50);
    }

    // Campi della classe
    public String modello;
    public String colore;
    public int velocita;

    // Costruttore
    public Auto(String modello, String colore) {
        this.modello = modello;
        this.colore = colore;
        this.velocita = 0; // Velocità iniziale
    }

    // Metodo per accelerare
    public void accelera(int incremento) {
        velocita += incremento;
        System.out.println("L'auto " + modello + " ha accelerato. Velocità attuale: " + velocita + " km/h.");
    }

    // Metodo per frenare
    public void frena(int decremento) {
        velocita -= decremento;
        if (velocita < 0) {
            velocita = 0;
        }
        System.out.println("L'auto " + modello + " ha frenato. Velocità attuale: " + velocita + " km/h.");
    }
}