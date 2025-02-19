import java.util.Scanner;

public class Eserciziofor {
    public static void main(String[] args) {
        Scanner pippo = new Scanner(System.in);

        int passwordCorretta = 123456;
        String utenteCorretto = "Marco Baldi";
        boolean accessoRiuscito = false;

        for (int tentativi = 1; tentativi <= 3; tentativi++) {
            System.out.println("Tentativo " + tentativi + " di 3");

            System.out.println("Inserisci nome utente:");
            String utente = pippo.nextLine();

            System.out.println("Inserisci password:");
            int passwordInserita = pippo.nextInt();
            pippo.nextLine();

            if (utente.equals(utenteCorretto) && passwordInserita == passwordCorretta) {
                System.out.println("Accesso riuscito! Benvenuto, " + utente + "!");
                accessoRiuscito = true;
                break; // Esce dal ciclo se l'accesso è corretto
            } else {
                System.out.println("Nome utente o password errati.");
                if (tentativi < 3) {
                    System.out.println("Riprova.");
                }
            }
        }

        if (!accessoRiuscito) {
            System.out.println("Troppi tentativi falliti.");
        }

        pippo.close();
    }
}
