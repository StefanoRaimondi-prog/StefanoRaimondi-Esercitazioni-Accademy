public class Prova {
    int x;

    public Prova() {
        x = 5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Prova myObj = new Prova(); // call the constructor
        System.out.println(myObj.x); // Print the value of x
    }
}
