import java.util.Random;

public class Esercizio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int numero;

        while (true) {
            numero = random.nextInt(100) + 1; // Genera un numero casuale tra 1 e 100
            System.out.println("Numero generato: " + numero);

            if (numero > 99) { // Se il numero è maggiore di 90, esce dal ciclo
                System.out.println("Numero alto! Fine del ciclo.");
                break;
            }
        }
    }
}
