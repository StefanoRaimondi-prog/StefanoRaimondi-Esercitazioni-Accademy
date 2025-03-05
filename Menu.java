/*import java.util.ArrayList;
import java.util.Scanner;

// Classe PiattoSpeciale con incapsulamento
class PiattoSpeciale {
    private ArrayList<String> ingredienti;
    private double prezzoBase = 1.0; // Prezzo fisso di base
    private String[] ingredientiDisponibili = { "Panino normale", "Panino di sesamo", "Formaggio", "Bacon", "Uovo" };
    private double[] prezziIngredienti = { 2.0, 2.5, 1.5, 2.0, 1.0 }; // Prezzi corrispondenti agli ingredienti
    private double prezzoTotale;

    // Costruttore
    public PiattoSpeciale() {
        this.ingredienti = new ArrayList<>();
        this.prezzoTotale = prezzoBase;
    }

    // Metodo per mostrare gli ingredienti disponibili
    public void mostraIngredienti() {
        System.out.println("\nIngredienti disponibili per il Piatto Speciale:");
        for (int i = 0; i < ingredientiDisponibili.length; i++) {
            System.out.println(" - " + ingredientiDisponibili[i] + " (€" + prezziIngredienti[i] + ")");
        }
    }

    // Metodo per aggiungere un ingrediente se è disponibile nella lista
    public boolean aggiungiIngrediente(String ingrediente) {
        for (int i = 0; i < ingredientiDisponibili.length; i++) {
            if (ingredientiDisponibili[i].equalsIgnoreCase(ingrediente)) {
                ingredienti.add(ingrediente);
                prezzoTotale += prezziIngredienti[i];
                return true;
            }
        }
        return false;
    }

    // Metodo per ottenere il prezzo totale
    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    // Metodo per mostrare il riepilogo dell'ordine
    public void mostraOrdine() {
        System.out.println("\nPiatto Speciale ordinato:");
        for (String ingr : ingredienti) {
            System.out.println(" - " + ingr);
        }
        System.out.println("Prezzo totale: €" + prezzoTotale);
    }
}

// Classe Menu
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBenvenuto nel ristorante! Vuoi ordinare un Piatto Speciale? (si/no)");
            String risposta = scanner.nextLine().toLowerCase();

            if (!risposta.equals("si")) {
                System.out.println("Grazie per la visita! Arrivederci.");
                break;
            }

            PiattoSpeciale piatto = new PiattoSpeciale();
            piatto.mostraIngredienti();

            while (true) {
                System.out.print("\nInserisci un ingrediente dalla lista (o scrivi 'fine' per completare l'ordine): ");
                String ingrediente = scanner.nextLine();

                if (ingrediente.equalsIgnoreCase("fine")) {
                    break;
                }

                if (piatto.aggiungiIngrediente(ingrediente)) {
                    System.out.println("Ingrediente aggiunto!");
                } else {
                    System.out.println("Ingrediente non disponibile! Scegli solo dalla lista.");
                }
            }

            piatto.mostraOrdine();
            System.out.println("\nOrdine completato! Vuoi ordinare un altro piatto? (si/no)");
            String continua = scanner.nextLine().toLowerCase();

            if (!continua.equals("si")) {
                System.out.println("Grazie per aver ordinato! Alla prossima.");
                break;
            }
        }
        scanner.close();
    }
}
*/

import java.util.ArrayList;
import java.util.Scanner;

// Classe base per un piatto
class Piatto {
    private String nome;
    private ArrayList<String> ingredienti = new ArrayList<>();
    private double prezzoBase;
    private double prezzoTotale;
    private String[] ingredientiDisponibili;
    private double[] prezziIngredienti;

    // Costruttore
    public Piatto(String nome, double prezzoBase, String[] ingredientiDisponibili, double[] prezziIngredienti) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
        this.prezzoTotale = prezzoBase;
        this.ingredientiDisponibili = ingredientiDisponibili;
        this.prezziIngredienti = prezziIngredienti;
    }

    // Metodo per mostrare gli ingredienti disponibili
    public void mostraIngredienti() {
        System.out.println("\nIngredienti disponibili per " + nome + ":");
        for (int i = 0; i < ingredientiDisponibili.length; i++) {
            System.out.println(" " + (i + 1) + ". " + ingredientiDisponibili[i] + " (€" + prezziIngredienti[i] + ")");
        }
        System.out.println(" 0. Fine ordine");
    }

    // Metodo per aggiungere un ingrediente
    public boolean aggiungiIngrediente(int scelta) {
        if (scelta > 0 && scelta <= ingredientiDisponibili.length) {
            ingredienti.add(ingredientiDisponibili[scelta - 1]);
            prezzoTotale += prezziIngredienti[scelta - 1];
            return true;
        }
        return false;
    }

    // Metodo per mostrare il riepilogo dell'ordine
    public void mostraOrdine() {
        System.out.println("\nOrdine completato per " + nome + ":");
        for (String ingr : ingredienti) {
            System.out.println(" - " + ingr);
        }
        System.out.println("Prezzo totale: €" + prezzoTotale);
    }
}

// Classe Menu
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBenvenuto nel ristorante! Scegli il piatto da ordinare:");
            System.out.println(" 1. Piatto Speciale");
            System.out.println(" 2. Pizza Classica");
            System.out.println(" 3. Insalatona");
            System.out.println(" 0. Esci");
            System.out.print("Scelta: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Errore: Inserisci un numero valido!");
                scanner.next();
                continue;
            }

            int sceltaPiatto = scanner.nextInt();
            scanner.nextLine();

            if (sceltaPiatto == 0) {
                System.out.println("Grazie per la visita! Arrivederci.");
                break;
            }

            // Creazione dell'oggetto piatto scelto
            Piatto piatto = null;
            if (sceltaPiatto == 1) {
                piatto = new Piatto("Piatto Speciale", 1.0,
                        new String[]{"Panino normale", "Panino di sesamo", "Formaggio", "Bacon", "Uovo"},
                        new double[]{2.0, 2.5, 1.5, 2.0, 1.0});
            } else if (sceltaPiatto == 2) {
                piatto = new Piatto("Pizza Classica", 4.0,
                        new String[]{"Mozzarella", "Pomodoro", "Funghi", "Prosciutto", "Olive"},
                        new double[]{1.0, 1.0, 1.5, 2.0, 1.5});
            } else if (sceltaPiatto == 3) {
                piatto = new Piatto("Insalatona", 3.0,
                        new String[]{"Lattuga", "Pomodori", "Tonno", "Uova sode", "Mais"},
                        new double[]{1.0, 1.5, 2.0, 2.0, 1.5});
            } else {
                System.out.println("Scelta non valida! Riprova.");
                continue;
            }

            // Scelta ingredienti
            while (true) {
                piatto.mostraIngredienti();
                System.out.print("\nSeleziona un ingrediente digitando il numero (0 per completare l'ordine): ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Errore: Inserisci un numero valido!");
                    scanner.next();
                    continue;
                }

                int scelta = scanner.nextInt();
                scanner.nextLine();

                if (scelta == 0) {
                    break;
                }

                if (piatto.aggiungiIngrediente(scelta)) {
                    System.out.println("Ingrediente aggiunto!");
                } else {
                    System.out.println("Scelta non valida! Seleziona un numero dalla lista.");
                }
            }

            piatto.mostraOrdine();
            System.out.println("\nOrdine completato! Vuoi ordinare un altro piatto? (si/no)");
            String continua = scanner.nextLine().toLowerCase();

            if (!continua.equals("si")) {
                System.out.println("Grazie per aver ordinato! Alla prossima.");
                break;
            }
        }
        scanner.close();
    }
}
