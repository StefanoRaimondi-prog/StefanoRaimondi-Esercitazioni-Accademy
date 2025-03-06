import java.util.ArrayList;
import java.util.Scanner;

// Classe Piatto (Superclasse)
class Piatto {
    protected String ingredienti;
    protected double prezzo;
    protected String chef;

    // Costruttore
    public Piatto(String ingredienti, double prezzo, String chef) {
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
        this.chef = chef;
    }

    // Metodo per ottenere il prezzo del piatto
    public double getPrezzo() {
        return prezzo;
    }

    // Metodo per stampare le informazioni del piatto
    public void mostraDettagli() {
        System.out.println("Piatto: " + ingredienti + " | Prezzo: €" + prezzo + " | Chef: " + chef);
    }
}

// Classe Ordinazione (Polimorfismo: può contenere qualsiasi piatto)
class Ordinazione {
    private ArrayList<Piatto> piattiOrdinati = new ArrayList<>();

    // Aggiungi un piatto all'ordinazione
    public void aggiungiPiatto(Piatto piatto) {
        piattiOrdinati.add(piatto);
        System.out.println("Hai aggiunto: " + piatto.ingredienti + " (€" + piatto.getPrezzo() + ")");
    }

    // Calcola il totale dell'ordinazione
    public double calcolaTotale() {
        double totale = 0;
        for (Piatto p : piattiOrdinati) {
            totale += p.getPrezzo();
        }
        return totale;
    }

    // Mostra il riepilogo dell'ordinazione
    public void mostraOrdinazione() {
        System.out.println("\n--- Ordinazione ---");
        for (Piatto p : piattiOrdinati) {
            p.mostraDettagli();
        }
        System.out.println("Totale da pagare: €" + calcolaTotale());
    }
}

// Classe Menu per gestire i piatti disponibili
class Menu {
    private ArrayList<Piatto> listaPiatti = new ArrayList<>();

    // Aggiunge un piatto al menu
    public void aggiungiPiattoAlMenu(Piatto piatto) {
        listaPiatti.add(piatto);
    }

    // Mostra i piatti disponibili
    public void mostraMenu() {
        System.out.println("\n--- Menu Disponibile ---");
        int index = 1;
        for (Piatto p : listaPiatti) {
            System.out.print(index + ". ");
            p.mostraDettagli();
            index++;
        }
    }

    // Ottieni un piatto dal menu in base alla scelta dell'utente
    public Piatto getPiatto(int index) {
        if (index > 0 && index <= listaPiatti.size()) {
            return listaPiatti.get(index - 1);
        }
        return null;
    }
}

// Classe Main per eseguire il programma
public class GestioneRistorante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Ordinazione ordinazione = new Ordinazione();

        // Creazione dei piatti nel menu
        menu.aggiungiPiattoAlMenu(new Piatto("Pizza Margherita", 8.5, "Chef Mirko"));
        menu.aggiungiPiattoAlMenu(new Piatto("Spaghetti Carbonara", 10.0, "Chef Anna"));
        menu.aggiungiPiattoAlMenu(new Piatto("Risotto ai funghi", 12.0, "Chef Marco"));
        menu.aggiungiPiattoAlMenu(new Piatto("Insalata mista", 5.0, "Chef Sofia"));

        boolean continua = true;
        while (continua) {
            menu.mostraMenu();
            System.out.print("\nScegli un piatto (1-4) o 0 per terminare l'ordine: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Errore: Inserisci un numero valido.");
                scanner.next();
                continue;
            }

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia buffer

            if (scelta == 0) {
                continua = false;
            } else {
                Piatto piattoScelto = menu.getPiatto(scelta);
                if (piattoScelto != null) {
                    ordinazione.aggiungiPiatto(piattoScelto);
                } else {
                    System.out.println("Scelta non valida!");
                }
            }
        }

        // Mostra il riepilogo dell'ordinazione
        ordinazione.mostraOrdinazione();
        scanner.close();
    }
}
