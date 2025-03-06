
/*
 * // Interfaccia base per tutti i prodotti
 * interface IProdotto {
 * double getPrezzo();
 * 
 * String getDettagli();
 * }
 * 
 * // Interfaccia per prodotti con sconto
 * interface IScontabile {
 * double calcolaSconto();
 * }
 * 
 * // Interfaccia per prodotti con garanzia
 * interface IGarantibile {
 * boolean inGaranzia(int mesiTrascorsi);
 * }
 * 
 * // Interfaccia per prodotti restituibili
 * interface IRestituibile {
 * boolean puòEssereRestituito(int giorniDallAcquisto);
 * }
 * 
 * // Classe Alimentare - Implementa IProdotto e IScontabile
 * class Alimentare implements IProdotto, IScontabile {
 * private String codice;
 * private String nome;
 * private double prezzo;
 * private int giorniAllaScadenza;
 * 
 * public Alimentare(String codice, String nome, double prezzo, int
 * giorniAllaScadenza) {
 * this.codice = codice;
 * this.nome = nome;
 * this.prezzo = prezzo;
 * this.giorniAllaScadenza = giorniAllaScadenza;
 * }
 * 
 * @Override
 * public double getPrezzo() {
 * return prezzo - calcolaSconto();
 * }
 * 
 * @Override
 * public String getDettagli() {
 * return "Alimentare: " + nome + " | Prezzo: " + prezzo + "€ | Scade tra: " +
 * giorniAllaScadenza + " giorni";
 * }
 * 
 * @Override
 * public double calcolaSconto() {
 * return (giorniAllaScadenza <= 3) ? prezzo * 0.2 : 0;
 * }
 * }
 * 
 * // Classe Elettronico - Implementa IProdotto, IGarantibile e IRestituibile
 * class Elettronico implements IProdotto, IGarantibile, IRestituibile {
 * private String codice;
 * private String nome;
 * private double prezzo;
 * private int mesiGaranzia;
 * 
 * public Elettronico(String codice, String nome, double prezzo, int
 * mesiGaranzia) {
 * this.codice = codice;
 * this.nome = nome;
 * this.prezzo = prezzo;
 * this.mesiGaranzia = mesiGaranzia;
 * }
 * 
 * @Override
 * public double getPrezzo() {
 * return prezzo;
 * }
 * 
 * @Override
 * public String getDettagli() {
 * return "Elettronico: " + nome + " | Prezzo: " + prezzo + "€ | Garanzia: " +
 * mesiGaranzia + " mesi";
 * }
 * 
 * @Override
 * public boolean inGaranzia(int mesiTrascorsi) {
 * return mesiTrascorsi <= mesiGaranzia;
 * }
 * 
 * @Override
 * public boolean puòEssereRestituito(int mesiTrascorsi) {
 * return inGaranzia(mesiTrascorsi);
 * }
 * }
 * 
 * // Classe Abbigliamento - Implementa IProdotto e IRestituibile
 * class Abbigliamento implements IProdotto, IRestituibile {
 * private String codice;
 * private String nome;
 * private double prezzo;
 * private String taglia;
 * private String materiale;
 * 
 * public Abbigliamento(String codice, String nome, double prezzo, String
 * taglia, String materiale) {
 * this.codice = codice;
 * this.nome = nome;
 * this.prezzo = prezzo;
 * this.taglia = taglia;
 * this.materiale = materiale;
 * }
 * 
 * @Override
 * public double getPrezzo() {
 * return prezzo;
 * }
 * 
 * @Override
 * public String getDettagli() {
 * return "Abbigliamento: " + nome + " | Prezzo: " + prezzo + "€ | Taglia: " +
 * taglia + " | Materiale: "
 * + materiale;
 * }
 * 
 * @Override
 * public boolean puòEssereRestituito(int giorniDallAcquisto) {
 * return giorniDallAcquisto <= 30;
 * }
 * }
 * 
 * // Classe Main per testare il codice
 * public class Supermercato {
 * public static void main(String[] args) {
 * // Creazione dei prodotti
 * Alimentare pane = new Alimentare("A001", "Pane", 2.50, 2); // Scade tra 2
 * giorni
 * Elettronico telefono = new Elettronico("E001", "Smartphone", 699.99, 24); //
 * 24 mesi di garanzia
 * Abbigliamento maglietta = new Abbigliamento("C001", "Maglietta", 19.99, "M",
 * "Cotone");
 * 
 * // Simulazione del tempo trascorso
 * int mesiTrascorsi = 12;
 * int giorniDallAcquisto = 15;
 * 
 * // Stampa informazioni prodotti
 * System.out.println(pane.getDettagli());
 * System.out.println("Prezzo scontato: " + pane.getPrezzo() + "€");
 * System.out.println();
 * 
 * System.out.println(telefono.getDettagli());
 * System.out.println("In garanzia? " + telefono.inGaranzia(mesiTrascorsi));
 * System.out.println("Restituibile? " +
 * telefono.puòEssereRestituito(mesiTrascorsi));
 * System.out.println();
 * 
 * System.out.println(maglietta.getDettagli());
 * System.out.println("Restituibile entro 30 giorni? " +
 * maglietta.puòEssereRestituito(giorniDallAcquisto));
 * }
 * }
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interfaccia base per tutti i prodotti
interface IProdotto {
    double getPrezzo();

    String getDettagli();
}

// Interfaccia per prodotti con sconto
interface IScontabile {
    double calcolaSconto();
}

// Interfaccia per prodotti con garanzia
interface IGarantibile {
    boolean inGaranzia(int mesiTrascorsi);
}

// Interfaccia per prodotti restituibili
interface IRestituibile {
    boolean puòEssereRestituito(int giorniDallAcquisto);
}

// Classe Alimentare - Implementa IProdotto e IScontabile
class Alimentare implements IProdotto, IScontabile {
    private String nome;
    private double prezzo;
    private int giorniAllaScadenza;

    public Alimentare(String nome, double prezzo, int giorniAllaScadenza) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.giorniAllaScadenza = giorniAllaScadenza;
    }

    @Override
    public double getPrezzo() {
        return prezzo - calcolaSconto();
    }

    @Override
    public String getDettagli() {
        return "Alimentare: " + nome + " | Prezzo: " + prezzo + "€ | Scade tra: " + giorniAllaScadenza + " giorni";
    }

    @Override
    public double calcolaSconto() {
        return (giorniAllaScadenza <= 3) ? prezzo * 0.2 : 0;
    }
}

// Classe Elettronico - Implementa IProdotto, IGarantibile e IRestituibile
class Elettronico implements IProdotto, IGarantibile, IRestituibile {
    private String nome;
    private double prezzo;
    private int mesiGaranzia;

    public Elettronico(String nome, double prezzo, int mesiGaranzia) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.mesiGaranzia = mesiGaranzia;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String getDettagli() {
        return "Elettronico: " + nome + " | Prezzo: " + prezzo + "€ | Garanzia: " + mesiGaranzia + " mesi";
    }

    @Override
    public boolean inGaranzia(int mesiTrascorsi) {
        return mesiTrascorsi <= mesiGaranzia;
    }

    @Override
    public boolean puòEssereRestituito(int mesiTrascorsi) {
        return inGaranzia(mesiTrascorsi);
    }
}

// Classe Abbigliamento - Implementa IProdotto e IRestituibile
class Abbigliamento implements IProdotto, IRestituibile {
    private String nome;
    private double prezzo;
    private String taglia;
    private String materiale;

    public Abbigliamento(String nome, double prezzo, String taglia, String materiale) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.taglia = taglia;
        this.materiale = materiale;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String getDettagli() {
        return "Abbigliamento: " + nome + " | Prezzo: " + prezzo + "€ | Taglia: " + taglia + " | Materiale: "
                + materiale;
    }

    @Override
    public boolean puòEssereRestituito(int giorniDallAcquisto) {
        return giorniDallAcquisto <= 30;
    }
}

// Classe Supermercato con menu interattivo
public class Supermercato {
    private static List<IProdotto> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        int mesiTrascorsi = 0;
        int giorniDallAcquisto = 0;

        while (running) {
            System.out.println("\n=== MENU SUPERMERCATO ===");
            System.out.println("1. Visualizza prodotti");
            System.out.println("2. Aggiungi un nuovo prodotto");
            System.out.println("3. Simula il tempo trascorso");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia buffer

            switch (scelta) {
                case 1:
                    visualizzaProdotti(mesiTrascorsi, giorniDallAcquisto);
                    break;
                case 2:
                    aggiungiProdotto();
                    break;
                case 3:
                    System.out.print("Inserisci i mesi trascorsi: ");
                    mesiTrascorsi = scanner.nextInt();
                    System.out.print("Inserisci i giorni dall'acquisto: ");
                    giorniDallAcquisto = scanner.nextInt();
                    System.out.println("Tempo aggiornato!");
                    break;
                case 4:
                    running = false;
                    System.out.println("Grazie per aver usato il supermercato!");
                    break;
                default:
                    System.out.println("Scelta non valida! Riprova.");
            }
        }
        scanner.close();
    }

    private static void visualizzaProdotti(int mesiTrascorsi, int giorniDallAcquisto) {
        if (inventario.isEmpty()) {
            System.out.println("Nessun prodotto disponibile.");
            return;
        }
        System.out.println("\n=== PRODOTTI DISPONIBILI ===");
        for (IProdotto prodotto : inventario) {
            System.out.println(prodotto.getDettagli() + " | Prezzo: " + prodotto.getPrezzo() + "€");
            if (prodotto instanceof IGarantibile) {
                System.out.println("   - In garanzia? " + ((IGarantibile) prodotto).inGaranzia(mesiTrascorsi));
            }
            if (prodotto instanceof IRestituibile) {
                System.out.println(
                        "   - Restituibile? " + ((IRestituibile) prodotto).puòEssereRestituito(giorniDallAcquisto));
            }
        }
    }

    private static void aggiungiProdotto() {
        System.out.println("\nScegli il tipo di prodotto da aggiungere:");
        System.out.println("1. Alimentare");
        System.out.println("2. Elettronico");
        System.out.println("3. Abbigliamento");
        System.out.print("Scelta: ");

        int scelta = scanner.nextInt();
        scanner.nextLine(); // Pulizia buffer

        System.out.print("Inserisci il nome del prodotto: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il prezzo: ");
        double prezzo = scanner.nextDouble();
        scanner.nextLine(); // Pulizia buffer

        switch (scelta) {
            case 1:
                System.out.print("Inserisci i giorni alla scadenza: ");
                int giorniAllaScadenza = scanner.nextInt();
                scanner.nextLine();
                inventario.add(new Alimentare(nome, prezzo, giorniAllaScadenza));
                break;
            case 2:
                System.out.print("Inserisci i mesi di garanzia: ");
                int mesiGaranzia = scanner.nextInt();
                scanner.nextLine();
                inventario.add(new Elettronico(nome, prezzo, mesiGaranzia));
                break;
            case 3:
                System.out.print("Inserisci la taglia: ");
                String taglia = scanner.nextLine();
                System.out.print("Inserisci il materiale: ");
                String materiale = scanner.nextLine();
                inventario.add(new Abbigliamento(nome, prezzo, taglia, materiale));
                break;
            default:
                System.out.println("Scelta non valida.");
        }
    }
}
