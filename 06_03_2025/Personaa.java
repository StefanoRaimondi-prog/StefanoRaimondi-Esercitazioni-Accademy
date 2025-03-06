// Classe base Persona
class Persona {
    private String nome;

    // Costruttore per inizializzare il nome
    public Persona(String nome) {
        this.nome = nome;
    }

    // Metodo per far salutare l'oggetto
    public void saluta() {
        System.out.println("Ciao! Mi chiamo " + nome + ".");
    }

    // Getter per ottenere il nome (necessario per la classe Pirata)
    public String getNome() {
        return nome;
    }
}

// Classe Pirata che eredita da Persona
class Pirata extends Persona {

    // Costruttore che chiama il costruttore della superclasse
    public Pirata(String nome) {
        super(nome);
    }

    // Override del metodo saluta() per il pirata
    @Override
    public void saluta() {
        System.out.println("Ahoy! Io sono un pirata e mi chiamo " + getNome() + "!");
    }
}

// Classe Main per eseguire il programma
public class Personaa {
    public static void main(String[] args) {
        // Creazione di due oggetti Persona
        Persona persona1 = new Persona("Luca");
        Persona persona2 = new Persona("Anna");

        // Creazione di un Pirata
        Pirata pirata = new Pirata("Barbanera");

        // Tutti salutano
        persona1.saluta();
        persona2.saluta();
        pirata.saluta();
    }
}
