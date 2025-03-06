// Classe generica Printer con bounded type (T estende Number)
class Printer<T extends Number> {
    private T valoreDaStampare;

    // Costruttore per inizializzare il valore
    public Printer(T valoreDaStampare) {
        this.valoreDaStampare = valoreDaStampare;
    }

    // Metodo per stampare il valore
    public void print() {
        System.out.println("Valore da stampare: " + valoreDaStampare);
    }
}

// Classe Main per testare Printer
public class Mainn {
    public static void main(String[] args) {
        // Creazione di oggetti Printer con diversi tipi numerici
        Printer<Integer> intPrinter = new Printer<>(42);
        Printer<Double> doublePrinter = new Printer<>(3.14);
        Printer<Float> floatPrinter = new Printer<>(9.81f);

        // Stampa dei valori
        intPrinter.print();
        doublePrinter.print();
        floatPrinter.print();
    }
}
