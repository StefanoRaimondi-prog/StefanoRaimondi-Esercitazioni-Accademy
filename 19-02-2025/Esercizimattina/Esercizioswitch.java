import java.util.Scanner;

public class Esercizioswitch {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Dammi il tuo nome:");
        String nome = data.nextLine();

        System.out.println("Dammi il tuo cognome:");
        String cognome = data.nextLine();

        System.out.println("Dammi la tua password:");
        String password = data.nextLine();

        System.out.println("Quale dato vuoi visualizzare? Scrivi: nome, cognome o password");
        String scelta = data.nextLine();

        switch (scelta.toLowerCase()) {
            case "nome":
                System.out.println("Il tuo nome è: " + nome);
                break;
            case "cognome":
                System.out.println("Il tuo cognome è: " + cognome);
                break;
            case "password":
                System.out.println("La tua password è: " + password);
                break;
            default:
                System.out.println("Scelta non valida!");
        }

        data.close();
    }
}
