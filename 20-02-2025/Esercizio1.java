import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Ciclo while per chiedere un numero negativo
        while (true) {
            System.out.print("Inserisci un numero negativo: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Hai inserito un numero negativo: " + numero);
                break; // Esce dal ciclo se il numero è negativo
            } else {
                System.out.println("Numero non valido! Devi inserire un numero negativo.");
                // Il ciclo riprende automaticamente grazie al while(true)
            }
        }

        scanner.close();
    }
}
