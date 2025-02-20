/*import java.util.ArrayList;
import java.util.Scanner;

class Prenotazione {
    String nomeCliente;
    int riga;
    int colonna;

    public Prenotazione(String nomeCliente, int riga, int colonna) {
        this.nomeCliente = nomeCliente;
        this.riga = riga;
        this.colonna = colonna;
    }
}

public class SistemaPrenotazioni {
    static final int RIGHE = 3;
    static final int COLONNE = 8;
    static ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean esegui = true;
        while (esegui) {
            System.out.println("\nMenu: ");
            System.out.println("1. Prenotare un posto");
            System.out.println("2. Cercare prenotazioni");
            System.out.println("3. Visualizzare posti");
            System.out.println("4. Report posti");
            System.out.println("5. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    prenotarePosto();
                    break;
                case 2:
                    cercarePrenotazione();
                    break;
                case 3:
                    visualizzarePosti();
                    break;
                case 4:
                    reportPosti();
                    break;
                case 5:
                    esegui = false;
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        }
        scanner.close();
    }

    static void prenotarePosto() {
        System.out.print("Nome cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Riga (1-3): ");
        int riga = scanner.nextInt() - 1;
        System.out.print("Colonna (1-8): ");
        int colonna = scanner.nextInt() - 1;
        scanner.nextLine();

        if (riga < 0 || riga >= RIGHE || colonna < 0 || colonna >= COLONNE) {
            System.out.println("Posizione non valida!");
            return;
        }

        for (Prenotazione p : prenotazioni) {
            if (p.riga == riga && p.colonna == colonna) {
                System.out.println("Posto già prenotato!");
                return;
            }
        }
        prenotazioni.add(new Prenotazione(nome, riga, colonna));
        System.out.println("Prenotazione effettuata!");
    }

    static void cercarePrenotazione() {
        System.out.print("Inserisci nome da cercare: ");
        String nome = scanner.nextLine();
        boolean trovato = false;
        for (Prenotazione p : prenotazioni) {
            if (p.nomeCliente.equalsIgnoreCase(nome)) {
                System.out.println("Prenotazione trovata: " + p.nomeCliente + " - Posto (" + (p.riga + 1) + ", "
                        + (p.colonna + 1) + ")");
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessuna prenotazione trovata.");
        }
    }

    static void visualizzarePosti() {
        char[][] mappa = new char[RIGHE][COLONNE];
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                mappa[i][j] = '-';
            }
        }
        for (Prenotazione p : prenotazioni) {
            mappa[p.riga][p.colonna] = 'X';
        }
        System.out.println("\nMappa posti:");
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                System.out.print(mappa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reportPosti() {
        System.out.println("Posti totali: " + (RIGHE * COLONNE));
        System.out.println("Posti prenotati: " + prenotazioni.size());
        System.out.println("Posti liberi: " + ((RIGHE * COLONNE) - prenotazioni.size()));
    }
}*/

/*import java.util.Scanner;
import java.util.ArrayList;

class Prenotazione {
    String nomeCliente;
    int riga;
    int colonna;

    public Prenotazione(String nomeCliente, int riga, int colonna) {
        this.nomeCliente = nomeCliente;
        this.riga = riga;
        this.colonna = colonna;
    }
}

public class SistemaPrenotazioni {
    static final int RIGHE = 3;
    static final int COLONNE = 8;
    static ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean esegui = true;
        while (esegui) {
            System.out.println("\nMenu: ");
            System.out.println("1. Prenotare un posto");
            System.out.println("2. Cercare prenotazioni");
            System.out.println("3. Visualizzare posti");
            System.out.println("4. Report posti");
            System.out.println("5. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1 -> prenotarePosto();
                case 2 -> cercarePrenotazione();
                case 3 -> visualizzarePosti();
                case 4 -> reportPosti();
                case 5 -> {
                    esegui = false;
                    System.out.println("Uscita...");
                }
                default -> System.out.println("Scelta non valida!");
            }
        }
        scanner.close();
    }

    static void prenotarePosto() {
        System.out.print("Nome cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Riga (1-3): ");
        int riga = scanner.nextInt() - 1;
        System.out.print("Colonna (1-8): ");
        int colonna = scanner.nextInt() - 1;
        scanner.nextLine();

        if (riga < 0 || riga >= RIGHE || colonna < 0 || colonna >= COLONNE) {
            System.out.println("Posizione non valida!");
            return;
        }

        for (Prenotazione p : prenotazioni) {
            if (p.riga == riga && p.colonna == colonna) {
                System.out.println("Posto già prenotato!");
                return;
            }
        }
        prenotazioni.add(new Prenotazione(nome, riga, colonna));
        System.out.println("Prenotazione effettuata!");
    }

    static void cercarePrenotazione() {
        System.out.print("Inserisci nome da cercare: ");
        String nome = scanner.nextLine();
        boolean trovato = false;
        for (Prenotazione p : prenotazioni) {
            if (p.nomeCliente.equalsIgnoreCase(nome)) {
                System.out.println("Prenotazione trovata: " + p.nomeCliente + " - Posto (" + (p.riga + 1) + ", "
                        + (p.colonna + 1) + ")");
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessuna prenotazione trovata.");
        }
    }

    static void visualizzarePosti() {
        char[][] mappa = new char[RIGHE][COLONNE];
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                mappa[i][j] = '-';
            }
        }
        for (Prenotazione p : prenotazioni) {
            mappa[p.riga][p.colonna] = 'X';
        }
        System.out.println("\nMappa posti:");
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                System.out.print(mappa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reportPosti() {
        System.out.println("Posti totali: " + (RIGHE * COLONNE));
        System.out.println("Posti prenotati: " + prenotazioni.size());
        System.out.println("Posti liberi: " + ((RIGHE * COLONNE) - prenotazioni.size()));
    }
}*/

import java.util.Scanner;
import java.util.ArrayList;

// Classe che rappresenta una prenotazione
class Prenotazione {
    String nomeCliente;
    int riga;
    int colonna;

    // Costruttore per inizializzare una prenotazione
    public Prenotazione(String nomeCliente, int riga, int colonna) {
        this.nomeCliente = nomeCliente;
        this.riga = riga;
        this.colonna = colonna;
    }
}

public class SistemaPrenotazioni {
    static final int RIGHE = 3; // Numero di righe disponibili
    static final int COLONNE = 8; // Numero di colonne disponibili
    static ArrayList<Prenotazione> prenotazioni = new ArrayList<>(); // Lista per memorizzare le prenotazioni
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean esegui = true;
        while (esegui) {
            // Mostra il menu principale
            System.out.println("\nMenu: ");
            System.out.println("1. Prenotare un posto");
            System.out.println("2. Cercare prenotazioni");
            System.out.println("3. Visualizzare posti");
            System.out.println("4. Report posti");
            System.out.println("5. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            // Gestione della scelta dell'utente
            switch (scelta) {
                case 1 -> prenotarePosto(); // Prenotazione di un posto
                case 2 -> cercarePrenotazione(); // Ricerca di una prenotazione
                case 3 -> visualizzarePosti(); // Visualizzazione della mappa dei posti
                case 4 -> reportPosti(); // Report dei posti disponibili e occupati
                case 5 -> {
                    esegui = false;
                    System.out.println("Uscita...");
                }
                default -> System.out.println("Scelta non valida!");
            }
        }
        scanner.close();
    }

    // Metodo per prenotare un posto
    static void prenotarePosto() {
        System.out.print("Nome cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Riga (1-3): ");
        int riga = scanner.nextInt() - 1;
        System.out.print("Colonna (1-8): ");
        int colonna = scanner.nextInt() - 1;
        scanner.nextLine();

        // Controllo validità della posizione
        if (riga < 0 || riga >= RIGHE || colonna < 0 || colonna >= COLONNE) {
            System.out.println("Posizione non valida!");
            return;
        }

        // Controllo se il posto è già occupato
        for (Prenotazione p : prenotazioni) {
            if (p.riga == riga && p.colonna == colonna) {
                System.out.println("Posto già prenotato!");
                return;
            }
        }
        prenotazioni.add(new Prenotazione(nome, riga, colonna));
        System.out.println("Prenotazione effettuata!");
    }

    // Metodo per cercare una prenotazione in base al nome
    static void cercarePrenotazione() {
        System.out.print("Inserisci nome da cercare: ");
        String nome = scanner.nextLine();
        boolean trovato = false;
        for (Prenotazione p : prenotazioni) {
            if (p.nomeCliente.equalsIgnoreCase(nome)) {
                System.out.println("Prenotazione trovata: " + p.nomeCliente + " - Posto (" + (p.riga + 1) + ", "
                        + (p.colonna + 1) + ")");
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessuna prenotazione trovata.");
        }
    }

    // Metodo per visualizzare la mappa dei posti
    static void visualizzarePosti() {
        char[][] mappa = new char[RIGHE][COLONNE];
        // Inizializza la mappa con posti vuoti
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                mappa[i][j] = '-';
            }
        }
        // Segna i posti occupati
        for (Prenotazione p : prenotazioni) {
            mappa[p.riga][p.colonna] = 'X';
        }
        // Stampa la mappa
        System.out.println("\nMappa posti:");
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                System.out.print(mappa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Metodo per visualizzare il report dei posti
    static void reportPosti() {
        System.out.println("Posti totali: " + (RIGHE * COLONNE));
        System.out.println("Posti prenotati: " + prenotazioni.size());
        System.out.println("Posti liberi: " + ((RIGHE * COLONNE) - prenotazioni.size()));
    }
}
