import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        ArrayList<Integer> numeriInseriti = new ArrayList<>(); // Lista per salvare i numeri inseriti

        int numero;

        while (true) {
            System.out.println("Inserisci un numero:");
            numero = data.nextInt();
            numeriInseriti.add(numero); // Aggiunge il numero alla lista

            // Verifica se il numero è dispari
            if (numero % 2 != 0) {
                System.out.println("Hai inserito un numero dispari: " + numero);
                break; // Esce dal ciclo se il numero è dispari
            } else {
                System.out.println("Il numero inserito è pari: " + numero);
            }
        }

        // Stampa tutti i numeri inseriti
        System.out.println("Numeri inseriti: " + numeriInseriti);

        // Chiusura dello scanner
        data.close();
    }
}
