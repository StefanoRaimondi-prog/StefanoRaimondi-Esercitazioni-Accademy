/*
 * public class Eserciziogetter {
 * private String name; // private
 * 
 * public String getName() { // Getter
 * return name;
 * }
 * 
 * public void setName(String newName) { // Setter
 * this.name = newName;
 * }
 * }
 */

public class Eserciziogetter {

    public static void main(String[] args) {

        Person myObj = new Person();

        myObj.setName("Pippo"); // Settiamo il valore name = "pippo"

        System.out.println(myObj.getName());

    }

}