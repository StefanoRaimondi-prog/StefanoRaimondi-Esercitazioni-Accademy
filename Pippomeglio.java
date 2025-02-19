import java.util.Scanner;

public class Pippomeglio {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;

        if (a + b >= c) {
            System.err.println("maggiore uguale");
        }

        // Chiediamo la scelta dell'utente
        System.out.println("Scegli un'operazione: ");
        System.out.println("1: Somma");
        System.out.println("2: Sottrazione");
        System.out.println("3: Moltiplicazione");
        System.out.println("4: Divisione");

        int scelta = data.nextInt();

        // Gestiamo la scelta dell'utente
        switch (scelta) {
            case 1: // Somma
                System.out.println("Inserisci due numeri da sommare:");
                int addendo1 = data.nextInt();
                int addendo2 = data.nextInt();
                System.out.println("Risultato della somma: " + (addendo1 + addendo2));
                break;

            case 2: // Sottrazione
                System.out.println("Inserisci due numeri da sottrarre:");
                addendo1 = data.nextInt();
                addendo2 = data.nextInt();
                System.out.println("Risultato della sottrazione: " + (addendo1 - addendo2));
                break;

            case 3: // Moltiplicazione
                System.out.println("Inserisci due numeri da moltiplicare:");
                addendo1 = data.nextInt();
                addendo2 = data.nextInt();
                System.out.println("Risultato della moltiplicazione: " + (addendo1 * addendo2));
                break;

            case 4: // Divisione
                System.out.println("Inserisci due numeri da dividere:");
                addendo1 = data.nextInt();
                addendo2 = data.nextInt();
                if (addendo2 != 0) {
                    System.out.println("Risultato della divisione: " + (addendo1 / addendo2));
                } else {
                    System.out.println("Errore: divisione per zero!");
                }
                break;

            default:
                System.out.println("Scelta non valida. Per favore scegli un numero tra 1 e 4.");
        }

        // Chiudiamo lo scanner
        data.close();
    }
}