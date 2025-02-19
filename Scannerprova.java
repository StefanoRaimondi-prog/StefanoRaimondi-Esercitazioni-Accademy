import java.util.Scanner;

public class Scannerprova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");

        int numero = scanner.nextInt();

        boolean Pari = (numero % 2 == 0);
        if (Pari) {
            System.out.println("Il numero " + numero + " è pari.");
        } else {
            System.out.println("Il numero " + numero + " è dispari.");
        }
        scanner.close();
    }
}
