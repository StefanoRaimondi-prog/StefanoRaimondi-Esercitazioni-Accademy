public class Esercizio2 {
    public static void main(String[] args) {

        // Ciclo per i numeri da 1 a 7
        for (int i = 1; i <= 7; i++) {
            System.out.print("Numero " + i + ": ");

            // Usa il switch per associare il numero al giorno della settimana
            switch (i) {
                case 1:
                    System.out.println("Lunedì");
                    break;
                case 2:
                    System.out.println("Martedì");
                    break;
                case 3:
                    System.out.println("Mercoledì");
                    break;
                case 4:
                    System.out.println("Giovedì");
                    break;
                case 5:
                    System.out.println("Venerdì");
                    break;
                case 6:
                    System.out.println("Sabato");
                    break;
                case 7:
                    System.out.println("Domenica");
                    break;
                default:
                    System.out.println("Numero non valido");
            }
        }
    }
}
