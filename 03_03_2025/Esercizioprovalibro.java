/*public class Esercizioprovalibro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(); // Crea la biblioteca con il libro "I Promessi Sposi"
        biblioteca.stampaLibro(); // Stampa i dettagli del libro
    }
}

class Libro {
    String nomeAutore;
    int numeroPagine;

    // Costruttore
    public Libro(String nomeAutore, int numeroPagine) {
        this.nomeAutore = nomeAutore;
        this.numeroPagine = numeroPagine;
    }

    // Metodo per stampare i dettagli del libro
    public void stampaDettagli() {
        System.out.println("Autore: " + nomeAutore);
        System.out.println("Numero di pagine: " + numeroPagine);
    }
}

class Biblioteca {
    private Libro libro;

    // Costruttore: inizializza la biblioteca con "I Promessi Sposi"
    public Biblioteca() {
        this.libro = new Libro("Alessandro Manzoni", 720);
    }

    // Metodo per stampare il libro presente in biblioteca
    public void stampaLibro() {
        if (libro != null) {
            System.out.println("Libro in biblioteca:");
            libro.stampaDettagli();
        } else {
            System.out.println("Nessun libro in biblioteca.");
        }
    }
}*/

public class Esercizioprovalibro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
    }
}

class Libro {
    String nomeAutore;
    int numeroPagine;

    // Costruttore
    public Libro(String nomeAutore, int numeroPagine) {
        this.nomeAutore = nomeAutore;
        this.numeroPagine = numeroPagine;
    }

    // Metodo per stampare direttamente i dettagli del libro
    public void stampaDettagli() {
        System.out.println("Autore: " + nomeAutore);
        System.out.println("Numero di pagine: " + numeroPagine);
    }
}

class Biblioteca {
    Libro libro;

    // Costruttore: inizializza la biblioteca con "I Promessi Sposi" e stampa il
    // libro
    public Biblioteca() {
        this.libro = new Libro("Alessandro Manzoni", 720);
        System.out.println("Libro in biblioteca:");
        libro.stampaDettagli(); // Stampa diretta nel costruttore
    }
}
