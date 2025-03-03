public class Esercizioprovachef {
    public static void main(String[] args) {
        Chef cannavaciuolo = new Chef("Antonino Cannavacciuolo", "Pasta");
    }
}

class Chef {
    String nome;
    String ingrediente;

    // Costruttore
    public Chef(String nome, String ingrediente) {
        this.nome = nome;
        this.ingrediente = ingrediente;
        creaPiatto();
    }

    // Metodo per creare il piatto in base all'ingrediente
    public void creaPiatto() {
        switch (ingrediente.toLowerCase()) {
            case "pasta":
                System.out.println(nome + " ha preparato: Pasta alla Carbonara");
                break;
            case "carne":
                System.out.println(nome + " ha preparato: Bistecca alla Fiorentina");
                break;
            case "pesce":
                System.out.println(nome + " ha preparato: Branzino al forno");
                break;
            case "verdure":
                System.out.println(nome + " ha preparato: Insalata mista");
                break;
            case "cioccolato":
                System.out.println(nome + " ha preparato: Torta al cioccolato");
                break;
            default:
                System.out.println(nome + " ha preparato un piatto speciale!");
                break;
        }
    }
}
