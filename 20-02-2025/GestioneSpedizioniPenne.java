import java.util.ArrayList;
import java.util.Scanner;

class Spedizione {
    int rosso, blu, verde, nero;

    public Spedizione(int rosso, int blu, int verde, int nero) {
        this.rosso = rosso;
        this.blu = blu;
        this.verde = verde;
        this.nero = nero;
    }

    @Override
    public String toString() {
        return "Rosso: " + rosso + ", Blu: " + blu + ", Verde: " + verde + ", Nero: " + nero;
    }
}

public class GestioneSpedizioniPenne {
    static ArrayList<Spedizione> spedizioni = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean esegui = true;
        while (esegui) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungere una spedizione");
            System.out.println("2. Visualizzare tutte le spedizioni");
            System.out.println("3. Calcolare il totale di penne di ogni colore");
            System.out.println("4. Ricerca per colore");
            System.out.println("5. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1 -> aggiungereSpedizione();
                case 2 -> visualizzareSpedizioni();
                case 3 -> calcolareTotalePenne();
                case 4 -> ricercaPerColore();
                case 5 -> esegui = false;
                default -> System.out.println("Scelta non valida!");
            }
        }
        scanner.close();
    }

    static void aggiungereSpedizione() {
        System.out.print("Numero di penne Rosse: ");
        int rosso = scanner.nextInt();
        System.out.print("Numero di penne Blu: ");
        int blu = scanner.nextInt();
        System.out.print("Numero di penne Verdi: ");
        int verde = scanner.nextInt();
        System.out.print("Numero di penne Nere: ");
        int nero = scanner.nextInt();
        scanner.nextLine();

        spedizioni.add(new Spedizione(rosso, blu, verde, nero));
        System.out.println("Spedizione aggiunta con successo!");
    }

    static void visualizzareSpedizioni() {
        if (spedizioni.isEmpty()) {
            System.out.println("Nessuna spedizione registrata.");
        } else {
            for (int i = 0; i < spedizioni.size(); i++) {
                System.out.println("Spedizione " + (i + 1) + ": " + spedizioni.get(i));
            }
        }
    }

    static void calcolareTotalePenne() {
        int totRosso = 0, totBlu = 0, totVerde = 0, totNero = 0;
        for (Spedizione s : spedizioni) {
            totRosso += s.rosso;
            totBlu += s.blu;
            totVerde += s.verde;
            totNero += s.nero;
        }
        System.out.println("Totale penne spedite:");
        System.out.println("Rosso: " + totRosso + ", Blu: " + totBlu + ", Verde: " + totVerde + ", Nero: " + totNero);
    }

    static void ricercaPerColore() {
        System.out.print("Inserisci il colore da cercare (Rosso, Blu, Verde, Nero): ");
        String colore = scanner.nextLine().toLowerCase();
        boolean trovato = false;

        for (int i = 0; i < spedizioni.size(); i++) {
            Spedizione s = spedizioni.get(i);
            if ((colore.equals("rosso") && s.rosso > 0) ||
                    (colore.equals("blu") && s.blu > 0) ||
                    (colore.equals("verde") && s.verde > 0) ||
                    (colore.equals("nero") && s.nero > 0)) {
                System.out.println("Spedizione " + (i + 1) + ": " + s);
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessuna spedizione trovata con penne di questo colore.");
        }
    }
}
