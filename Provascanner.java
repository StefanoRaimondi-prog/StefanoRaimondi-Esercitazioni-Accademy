import java.util.Scanner;

public class Provascanner {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        // prova scan funzionante che ti chiede il nome
        System.out.println("inserisci il tuo nome");
        String nome = scan1.nextLine();
        System.out.println("Ciao," + nome);

        // prova scan per età che funzionerebbe se non ci fosse la prova precedente
        System.out.print("Inserisci la tua età: ");
        int eta = scan1.nextInt();
        System.out.println("Hai " + eta + " anni.");

        // prova scan per il double che funzionerebbe se non ci fossero le prime 2
        System.out.print("Inserisci il tuo peso (in kg): ");
        double peso = scanner.nextDouble();
        System.out.println("Pesantezza: " + peso + " kg.");

    }

}