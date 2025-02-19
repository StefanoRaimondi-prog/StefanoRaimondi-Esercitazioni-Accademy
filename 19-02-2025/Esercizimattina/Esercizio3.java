import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Scrivi se sei 'maggiorenne' o 'minorenne':");

        String risposta = data.nextLine();

        if (risposta.equalsIgnoreCase("maggiorenne"))

            System.out.println("Hai dichiarato di essere maggiorenne.");

        else if (risposta.equalsIgnoreCase("minorenne"))

            System.out.println("Hai dichiarato di essere minorenne.");

        else
            System.out.println("Non hai inserito una risposta valida.");

        data.close();
    }
}
