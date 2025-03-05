import java.util.Scanner;

// Eccezione personalizzata per numeri negativi
class NegativeQuantityException extends Exception {
    public NegativeQuantityException(String message) {
        super(message);
    }
}

public class AcquistoCioccolatini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PREZZO_CIOCCOLATINO = 1.5; // Prezzo fisso per cioccolatino

        try {
            // 1️⃣ Chiede all'utente la quantità di cioccolatini
            System.out.print("Quanti cioccolatini vuoi acquistare? ");
            String input = scanner.nextLine();

            // 2️⃣ Prova a convertire l'input in un intero
            int quantita = Integer.parseInt(input);

            // 3️⃣ Controlla se il numero è negativo
            if (quantita < 0) {
                throw new NegativeQuantityException("Errore: Non puoi acquistare un numero negativo di cioccolatini!");
            }

            // 4️⃣ Calcola il costo totale
            double costoTotale = quantita * PREZZO_CIOCCOLATINO;
            System.out.println("Hai acquistato " + quantita + " cioccolatini per un totale di €" + costoTotale);

        } catch (NumberFormatException e) {
            System.out.println("Errore: Devi inserire un numero intero valido!");
        } catch (NegativeQuantityException e) {
            System.out.println(e.getMessage());
        } finally {
            // 5️⃣ Messaggio finale sempre eseguito
            System.out.println("Grazie per aver visitato il nostro negozio!");
            scanner.close();
        }
    }
}
