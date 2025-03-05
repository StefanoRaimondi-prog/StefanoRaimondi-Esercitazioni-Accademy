public class Main {
    static void myStaticMethod() { // metodo statico
        System.out.println("I metodi statici possono essere chiamati senza creare oggetti");
    }

    public void myPublicMethod() { // metodo pubblico
        System.out.println("I metodi pubblici devono essere chiamati creando oggetti");
    }

    public static void main(String[] args) { // Main method
        myStaticMethod(); // Chiamiamo lo static method
        // myPublicMethod(); Questo produrrebbe un errore

        Main myObj = new Main(); // Creiamo un oggetto main
        myObj.myPublicMethod(); // Chiamo il metodo pubblico }

    }
}
