import java.util.Scanner;

public class Esercizioarray {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int[] numeri = new int[3]; // Array con 3 posizioni

        // Ciclo per chiedere i numeri all'utente
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un valore:");
            numeri[i] = data.nextInt(); // L'utente inserisce un numero
        }

        // Stampa solo i numeri superiori a 100
        for (int num : numeri) {
            if (num > 100) {
                System.out.println("Numeri maggiori di 100:");
            }
        }

        // Chiusura dello scanner
        data.close();
    }
}
