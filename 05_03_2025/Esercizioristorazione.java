import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Classe Utente
class Utente {
    private String nome;
    private String email;
    private float soldi;

    // Costruttore
    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.soldi = generaSoldi(); // Genera soldi casualmente
    }

    // Metodo per generare soldi random (tra 10 e 100)
    private float generaSoldi() {
        Random rand = new Random();
        return 10 + rand.nextFloat() * 90;
    }

    // Metodo per ricaricare il credito a ogni nuovo login
    public void aggiornaSoldi() {
        this.soldi = generaSoldi();
    }

    // Metodo per stampare i dati dell'utente
    public void stampaDati() {
        System.out.println("\n--- PROFILO UTENTE ---");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Credito: €" + String.format("%.2f", soldi));
    }

    public String getNome() {
        return nome;
    }
}

// Classe Ristorante (Classe Padre)
class Ristorante {
    protected ArrayList<String> piatti = new ArrayList<>();
    protected ArrayList<Integer> valutazioni = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void menuPrincipale() {
        while (true) {
            System.out.println("\n--- MENU PRINCIPALE ---");
            System.out.println("1. Creare un nuovo utente");
            System.out.println("2. Interagire con il profilo");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia buffer

            switch (scelta) {
                case 1:
                    Utente utente = creaUtente();
                    gestisciProfilo(utente);
                    break;
                case 2:
                    System.out.println("Funzione non disponibile senza utente creato.");
                    break;
                case 3:
                    System.out.println("Grazie per aver visitato il ristorante!");
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    // Metodo per creare un nuovo utente
    private Utente creaUtente() {
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci la tua email: ");
        String email = scanner.nextLine();

        Utente nuovoUtente = new Utente(nome, email);
        System.out.println("Utente creato con successo!");
        nuovoUtente.stampaDati();
        return nuovoUtente;
    }

    // Metodo per interagire con il profilo
    private void gestisciProfilo(Utente utente) {
        while (true) {
            System.out.println("\n--- MENU PROFILO ---");
            System.out.println("1. Visualizza i tuoi dati");
            System.out.println("2. Diventa Chef (Aggiungi Piatti)");
            System.out.println("3. Diventa Critico (Aggiungi Valutazioni)");
            System.out.println("4. Esci al menu principale");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia buffer

            switch (scelta) {
                case 1:
                    utente.stampaDati();
                    break;
                case 2:
                    Chef chef = new Chef();
                    chef.aggiungiPiatto();
                    break;
                case 3:
                    Critico critico = new Critico();
                    critico.aggiungiValutazione();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}

// Classe Chef (Figlia di Ristorante)
class Chef extends Ristorante {
    private Scanner scanner = new Scanner(System.in);

    public void aggiungiPiatto() {
        System.out.print("Inserisci il nome del nuovo piatto: ");
        String piatto = scanner.nextLine();
        piatti.add(piatto);
        System.out.println("Piatto '" + piatto + "' aggiunto con successo!");
    }
}

// Classe Critico (Figlia di Ristorante)
class Critico extends Ristorante {
    private Scanner scanner = new Scanner(System.in);

    public void aggiungiValutazione() {
        if (piatti.isEmpty()) {
            System.out.println("Non ci sono piatti da valutare! Aggiungi prima un piatto.");
            return;
        }

        System.out.println("\n--- PIATTI DISPONIBILI ---");
        for (int i = 0; i < piatti.size(); i++) {
            System.out.println((i + 1) + ". " + piatti.get(i));
        }

        System.out.print("Seleziona il numero del piatto da valutare: ");
        int scelta = scanner.nextInt();
        scanner.nextLine(); // Pulizia buffer

        if (scelta > 0 && scelta <= piatti.size()) {
            System.out.print("Inserisci una valutazione da 1 a 5: ");
            int voto = scanner.nextInt();
            scanner.nextLine();

            if (voto >= 1 && voto <= 5) {
                valutazioni.add(voto);
                System.out.println("Valutazione aggiunta con successo!");
            } else {
                System.out.println("Errore: Il voto deve essere tra 1 e 5.");
            }
        } else {
            System.out.println("Errore: Numero piatto non valido.");
        }
    }
}

// Classe principale
public class Esercizioristorazione {
    public static void main(String[] args) {
        Ristorante ristorante = new Ristorante();
        ristorante.menuPrincipale();
    }
}
