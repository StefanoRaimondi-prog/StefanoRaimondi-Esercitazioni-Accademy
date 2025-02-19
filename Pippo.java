import java.util.Scanner;

public class Pippo {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;

        if (a + b >= c) {
            System.err.println("maggiore uguale");
        }

        int scelta = data.nextInt();
        if (scelta == 1) {
            int addendo1, addendo2;
            addendo1 = data.nextInt();
            addendo2 = data.nextInt();
            System.out.println(addendo1 + addendo2);
        }

        if (scelta == 2) {
            int addendo1, addendo2;
            addendo1 = data.nextInt();
            addendo2 = data.nextInt();
            System.out.println(addendo1 - addendo2);
        }

        if (scelta == 4) {
            int addendo1, addendo2;
            addendo1 = data.nextInt();
            addendo2 = data.nextInt();
            System.out.println(addendo1 / addendo2);
        }
        if (scelta == 3) {
            int addendo1, addendo2;
            addendo1 = data.nextInt();
            addendo2 = data.nextInt();
            System.out.println(addendo1 * addendo2);
        }

    }
}
