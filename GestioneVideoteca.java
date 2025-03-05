
/*
 * import java.util.ArrayList;
 * import java.util.Scanner;
 * 
 * // Classe Film
 * class Film {
 * private String titolo;
 * private int anno;
 * 
 * // Costruttore
 * public Film(String titolo, int anno) {
 * this.titolo = titolo;
 * this.anno = anno;
 * }
 * 
 * // Getter
 * public String getTitolo() {
 * return titolo;
 * }
 * 
 * public int getAnno() {
 * return anno;
 * }
 * 
 * @Override
 * public String toString() {
 * return "🎬 " + titolo + " (" + anno + ")";
 * }
 * }
 * 
 * // Classe Utente
 * class Utente {
 * private String id;
 * private String nome;
 * private ArrayList<Film> filmNoleggiati;
 * 
 * // Costruttore
 * public Utente(String id, String nome) {
 * this.id = id;
 * this.nome = nome;
 * this.filmNoleggiati = new ArrayList<>();
 * }
 * 
 * // Getter
 * public String getId() {
 * return id;
 * }
 * 
 * public String getNome() {
 * return nome;
 * }
 * 
 * public ArrayList<Film> getFilmNoleggiati() {
 * return filmNoleggiati;
 * }
 * 
 * // Metodo per noleggiare un film
 * public void noleggiaFilm(Film film) {
 * if (filmNoleggiati.size() < 3) { // Limite di 3 film noleggiati
 * contemporaneamente
 * filmNoleggiati.add(film);
 * System.out.println("✅ " + nome + " ha noleggiato il film: " +
 * film.getTitolo());
 * } else {
 * System.out.
 * println("❌ Limite di noleggio raggiunto! Restituisci un film per noleggiarne un altro."
 * );
 * }
 * }
 * 
 * // Metodo per restituire un film
 * public void restituisciFilm(Film film) {
 * if (filmNoleggiati.remove(film)) {
 * System.out.println("✅ " + nome + " ha restituito il film: " +
 * film.getTitolo());
 * } else {
 * System.out.println("❌ Film non trovato nei noleggi!");
 * }
 * }
 * 
 * // Metodo per mostrare i film noleggiati
 * public void elencoNoleggi() {
 * if (filmNoleggiati.isEmpty()) {
 * System.out.println("📭 " + nome + " non ha noleggiato nessun film.");
 * } else {
 * System.out.println("🎥 Film noleggiati da " + nome + ":");
 * for (Film film : filmNoleggiati) {
 * System.out.println("   - " + film);
 * }
 * }
 * }
 * }
 * 
 * // Classe Videoteca
 * class Videoteca {
 * private ArrayList<Film> filmDisponibili;
 * private ArrayList<Utente> utenti;
 * 
 * public Videoteca() {
 * this.filmDisponibili = new ArrayList<>();
 * this.utenti = new ArrayList<>();
 * }
 * 
 * // Aggiungi un film
 * public void aggiungiFilm(Film film) {
 * filmDisponibili.add(film);
 * System.out.println("🎬 Film aggiunto: " + film);
 * }
 * 
 * // Rimuovi un film
 * public void rimuoviFilm(String titolo) {
 * filmDisponibili.removeIf(film -> film.getTitolo().equalsIgnoreCase(titolo));
 * System.out.println("❌ Film rimosso: " + titolo);
 * }
 * 
 * // Stampa tutti i film disponibili
 * public void mostraFilmDisponibili() {
 * if (filmDisponibili.isEmpty()) {
 * System.out.println("📭 Nessun film disponibile.");
 * } else {
 * System.out.println("🎬 Film disponibili in videoteca:");
 * for (Film film : filmDisponibili) {
 * System.out.println("   - " + film);
 * }
 * }
 * }
 * 
 * // Aggiungi un utente
 * public void aggiungiUtente(Utente utente) {
 * utenti.add(utente);
 * System.out.println("👤 Utente registrato: " + utente.getNome());
 * }
 * 
 * // Trova un utente per ID
 * public Utente trovaUtente(String id) {
 * for (Utente utente : utenti) {
 * if (utente.getId().equalsIgnoreCase(id)) {
 * return utente;
 * }
 * }
 * return null;
 * }
 * 
 * // Trova un film per titolo
 * public Film trovaFilm(String titolo) {
 * for (Film film : filmDisponibili) {
 * if (film.getTitolo().equalsIgnoreCase(titolo)) {
 * return film;
 * }
 * }
 * return null;
 * }
 * }
 * 
 * // Classe Main con Menu Interattivo
 * public class GestioneVideoteca {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * Videoteca videoteca = new Videoteca();
 * 
 * while (true) {
 * System.out.println("\n📀 **Gestione Videoteca** 📀");
 * System.out.println("1️⃣ Aggiungi Film");
 * System.out.println("2️⃣ Rimuovi Film");
 * System.out.println("3️⃣ Mostra Film Disponibili");
 * System.out.println("4️⃣ Aggiungi Utente");
 * System.out.println("5️⃣ Noleggia Film");
 * System.out.println("6️⃣ Restituisci Film");
 * System.out.println("7️⃣ Elenco Noleggi");
 * System.out.println("8️⃣ Esci");
 * System.out.print("🔹 Scegli un'opzione: ");
 * 
 * int scelta = scanner.nextInt();
 * scanner.nextLine(); // Pulizia buffer
 * 
 * switch (scelta) {
 * case 1: // Aggiungere un film
 * System.out.print("🎬 Inserisci titolo: ");
 * String titolo = scanner.nextLine();
 * System.out.print("📅 Inserisci anno di uscita: ");
 * int anno = scanner.nextInt();
 * scanner.nextLine();
 * videoteca.aggiungiFilm(new Film(titolo, anno));
 * break;
 * 
 * case 2: // Rimuovere un film
 * System.out.print("❌ Inserisci il titolo del film da rimuovere: ");
 * String titoloRimuovi = scanner.nextLine();
 * videoteca.rimuoviFilm(titoloRimuovi);
 * break;
 * 
 * case 3: // Mostrare film disponibili
 * videoteca.mostraFilmDisponibili();
 * break;
 * 
 * case 4: // Aggiungere un utente
 * System.out.print("🆔 Inserisci ID utente: ");
 * String id = scanner.nextLine();
 * System.out.print("👤 Inserisci nome utente: ");
 * String nome = scanner.nextLine();
 * videoteca.aggiungiUtente(new Utente(id, nome));
 * break;
 * 
 * case 5: // Noleggiare un film
 * System.out.print("🆔 Inserisci ID utente: ");
 * String idUtente = scanner.nextLine();
 * Utente utente = videoteca.trovaUtente(idUtente);
 * if (utente != null) {
 * System.out.print("🎥 Inserisci titolo del film da noleggiare: ");
 * String titoloNoleggio = scanner.nextLine();
 * Film filmNoleggio = videoteca.trovaFilm(titoloNoleggio);
 * if (filmNoleggio != null) {
 * utente.noleggiaFilm(filmNoleggio);
 * } else {
 * System.out.println("❌ Film non disponibile.");
 * }
 * } else {
 * System.out.println("❌ Utente non trovato.");
 * }
 * break;
 * 
 * case 6: // Restituzione film
 * // (stesso processo del noleggio ma con restituzione)
 * break;
 * 
 * case 7: // Elenco film noleggiati da un utente
 * System.out.print("🆔 Inserisci ID utente: ");
 * String idElenco = scanner.nextLine();
 * Utente utenteElenco = videoteca.trovaUtente(idElenco);
 * if (utenteElenco != null) {
 * utenteElenco.elencoNoleggi();
 * } else {
 * System.out.println("❌ Utente non trovato.");
 * }
 * break;
 * 
 * case 8:
 * System.out.println("📀 Chiusura del sistema.");
 * scanner.close();
 * return;
 * 
 * default:
 * System.out.println("⚠️ Scelta non valida!");
 * }
 * }
 * }
 * }
 */
import java.util.ArrayList;
import java.util.Scanner;

// Classe Film
class Film {
    public String titolo;
    public int anno;

    // Costruttore
    public Film(String titolo, int anno) {
        this.titolo = titolo;
        this.anno = anno;
    }

    // Metodo toString() per stampare il film
    @Override
    public String toString() {
        return titolo + " (" + anno + ")";
    }
}

// Classe Utente
class Utente {
    public String id;
    public String nome;
    public ArrayList<Film> filmNoleggiati;

    // Costruttore
    public Utente(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.filmNoleggiati = new ArrayList<>();
    }

    // Metodo per noleggiare un film
    public void noleggiaFilm(Film film) {
        filmNoleggiati.add(film);
        System.out.println(nome + " ha noleggiato: " + film);
    }

    // Metodo per stampare i film noleggiati
    public void elencoNoleggi() {
        if (filmNoleggiati.isEmpty()) {
            System.out.println("Nessun film noleggiato.");
        } else {
            System.out.println("Film noleggiati da " + nome + ":");
            for (Film film : filmNoleggiati) {
                System.out.println("   - " + film);
            }
        }
    }
}

// Classe Videoteca
class Videoteca {
    public ArrayList<Film> filmDisponibili;
    public ArrayList<Utente> utenti;

    // Costruttore
    public Videoteca() {
        this.filmDisponibili = new ArrayList<>();
        this.utenti = new ArrayList<>();
    }

    // Aggiungere un film
    public void aggiungiFilm(Film film) {
        filmDisponibili.add(film);
        System.out.println("Film aggiunto: " + film);
    }

    // Rimuovere un film
    public void rimuoviFilm(String titolo) {
        filmDisponibili.removeIf(f -> f.toString().contains(titolo));
        System.out.println("Film rimosso: " + titolo);
    }

    // Mostrare film disponibili
    public void mostraFilmDisponibili() {
        if (filmDisponibili.isEmpty()) {
            System.out.println("Nessun film disponibile.");
        } else {
            System.out.println("Film disponibili:");
            for (Film film : filmDisponibili) {
                System.out.println("   - " + film);
            }
        }
    }

    // Aggiungere un utente
    public void aggiungiUtente(Utente utente) {
        utenti.add(utente);
        System.out.println("Utente registrato: " + utente.toString());
    }

    // Trova un utente per ID
    public Utente trovaUtente(String id) {
        for (Utente utente : utenti) {
            if (utente.toString().contains(id)) {
                return utente;
            }
        }
        return null;
    }

    // Trova un film per titolo
    public Film trovaFilm(String titolo) {
        for (Film film : filmDisponibili) {
            if (film.toString().contains(titolo)) {
                return film;
            }
        }
        return null;
    }
}

// Classe Main con Menu Interattivo
public class GestioneVideoteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Videoteca videoteca = new Videoteca();

        while (true) {
            System.out.println("\n**Gestione Videoteca**");
            System.out.println("1. Aggiungi Film");
            System.out.println("2. Rimuovi Film");
            System.out.println("3. Mostra Film Disponibili");
            System.out.println("4. Aggiungi Utente");
            System.out.println("5. Noleggia Film");
            System.out.println("6. Elenco Noleggi");
            System.out.println("7. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia buffer

            switch (scelta) {
                case 1: // Aggiungere un film
                    System.out.print("Inserisci titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Inserisci anno di uscita: ");
                    int anno = scanner.nextInt();
                    scanner.nextLine();
                    videoteca.aggiungiFilm(new Film(titolo, anno));
                    break;

                case 2: // Rimuovere un film
                    System.out.print("Inserisci il titolo del film da rimuovere: ");
                    String titoloRimuovi = scanner.nextLine();
                    videoteca.rimuoviFilm(titoloRimuovi);
                    break;

                case 3: // Mostrare film disponibili
                    videoteca.mostraFilmDisponibili();
                    break;

                case 4: // Aggiungere un utente
                    System.out.print("Inserisci ID utente: ");
                    String id = scanner.nextLine();
                    System.out.print("Inserisci nome utente: ");
                    String nome = scanner.nextLine();
                    videoteca.aggiungiUtente(new Utente(id, nome));
                    break;

                case 5: // Noleggiare un film
                    System.out.print("Inserisci ID utente: ");
                    String idUtente = scanner.nextLine();
                    Utente utente = videoteca.trovaUtente(idUtente);
                    if (utente != null) {
                        System.out.print("Inserisci titolo del film da noleggiare: ");
                        String titoloNoleggio = scanner.nextLine();
                        Film filmNoleggio = videoteca.trovaFilm(titoloNoleggio);
                        if (filmNoleggio != null) {
                            utente.noleggiaFilm(filmNoleggio);
                        } else {
                            System.out.println("Film non disponibile.");
                        }
                    } else {
                        System.out.println("Utente non trovato.");
                    }
                    break;

                case 6: // Elenco film noleggiati da un utente
                    System.out.print("Inserisci ID utente: ");
                    String idElenco = scanner.nextLine();
                    Utente utenteElenco = videoteca.trovaUtente(idElenco);
                    if (utenteElenco != null) {
                        utenteElenco.elencoNoleggi();
                    } else {
                        System.out.println("Utente non trovato.");
                    }
                    break;

                case 7:
                    System.out.println("Chiusura del sistema.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Scelta non valida!");
            }
        }
    }
}