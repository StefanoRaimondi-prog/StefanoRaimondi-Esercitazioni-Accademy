import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner pippo = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numero = pippo.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        pippo.close();
    }
}
