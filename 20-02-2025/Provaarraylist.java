import java.util.ArrayList;
import java.util.Arrays;

public class Provaarraylist {
    public static void main(String[] args) {
        /*
         * ArrayList<String> cars = new ArrayList<String>();
         * cars.add("Volvo");
         * cars.add("BMW");
         * cars.add("Ford");
         * cars.add("Mazda");
         * System.out.println(cars);
         * 
         */

        /*
         * ArrayList<String> cars = new ArrayList<String>();
         * cars.add("Volvo");
         * cars.add("BMW");
         * cars.add("Ford");
         * cars.add("Mazda");
         * System.out.println(cars.size());
         * cars.remove(0);
         * cars.clear();
         */

        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array:" + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array dopo aggiunta: " + Arrays.toString(arr));
    }
}