import java.util.Scanner;

public class Esercizio1.0
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Ciclo while per chiedere un numero negativo
        while (true) {
            System.out.print("Inserisci un numero negativo: ");
            if (!scanner.hasNextInt()) {
                // Se l'input non è un numero, mostra un messaggio di errore
                System.out.println("Per favore, inserisci un numero valido.");
                scanner.next(); // Consuma l'input non valido
                continue; // Riprende il ciclo
            }

            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Hai inserito un numero: " + numero);

                // Aggiungi controllo per verificare se il numero è pari o dispari
                if (numero % 2 == 0) {
                    System.out.println("Il numero è pari.");
                } else {
                    System.out.println("Il numero è dispari.");
                }

            } else {
                System.out.println("Numero non valido! Devi inserire un numero negativo.");
                break; // Esce dal ciclo se il numero è negativo
            }
        }

        scanner.close();
    }
}
