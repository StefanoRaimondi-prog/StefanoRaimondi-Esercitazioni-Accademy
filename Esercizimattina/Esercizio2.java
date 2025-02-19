import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("scrivi un numero");

        int numero = data.nextInt();

        System.out.println("Scrivi un altro numero");

        int numero2 = data.nextInt();

        if (numero > numero2)

            System.out.println("il primo numero è maggiore del secondo");

        if (numero < numero2)

            System.out.println("il primo numero è minore del secondo");

        if (numero == numero2)

            System.out.println("il primo numero è uguale al secondo");

        data.close();
    }
}