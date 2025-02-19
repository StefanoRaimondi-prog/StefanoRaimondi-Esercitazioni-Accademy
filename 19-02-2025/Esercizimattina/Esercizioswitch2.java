import java.util.Scanner;

public class Esercizioswitch2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Dammi il tuo nome:");
        String nome = data.nextLine();

        System.out.println("Dammi il tuo cognome:");
        String cognome = data.nextLine();

        System.out.println("Dammi la tua password:");
        String password = data.nextLine();

        System.out.println("Quale dato vuoi modificare?");
        int dato = data.nextInt();

        switch (dato) {
            case 1:
                System.out.println("Dammi il nuovo nome:");
                nome = data.nextLine();
                break;
            case 2:
                System.out.println("Dammi il tuo nuovo cognome:");
                cognome = data.nextLine();
                break;

            case 3:
                System.out.println("Modifica la tua password");
                dato = data.nextInt();

                break;
        }
    }
}
