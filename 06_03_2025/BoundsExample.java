import java.util.ArrayList;
import java.util.List;

public class BoundsExample {

    // Metodo con Upper Bound: accetta liste di Number o sue sottoclassi
    public static void printNumbers(List<? extends Number> numbers) {
        System.out.println("Stampo i numeri:");
        for (Number num : numbers) {
            System.out.println(num);
        }
        // numbers.add(3.14); // ERRORE: non si può aggiungere elementi!
    }

    // Metodo con Lower Bound: accetta liste che contengono Integer o suoi supertipi
    public static void addInteger(List<? super Integer> list) {
        list.add(42); // OK: Integer può essere aggiunto
        // list.add(3.14); // ERRORE: non può aggiungere Double!
    }

    public static void main(String[] args) {
        // Creiamo una lista di Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        // Creiamo una lista di Double
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.718);

        // Creiamo una lista di Number
        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2.5);

        // TEST Upper Bound: Posso stampare Integer e Double
        printNumbers(intList);
        printNumbers(doubleList);

        // TEST Lower Bound: Posso aggiungere Integer a Number e Object
        addInteger(numberList);
        System.out.println("Lista Number dopo addInteger: " + numberList);

        List<Object> objectList = new ArrayList<>();
        addInteger(objectList);
        System.out.println("Lista Object dopo addInteger: " + objectList);
    }
}
