import java.util.ArrayList;

/*IDEA MULTIUSER:
 * E' possibile creare un arraylist non precompilato per aggiungere più persone
 * senza avere una memoria fissa che mi salvi ogni singolo utente?
 * O meglio, come ciclo il tutto in modo che l'utente resti nell'applicazione e possa
 * effettuare il login con un account diverso? Devo perforza impostarli di default?
 */
public class Smartphone extends DispositivoElettronico {
  private String x;
  private String y;
  private ArrayList<String> names = new ArrayList<String>(); // Riesco a pushare da costruttore qui i nomi da Resoconto?
  private ArrayList<String> passwords = new ArrayList<String>();// Riesco a pushare da costruttore le passwordz?

  // Costruttore
  public Smartphone(String nome, String password) {
    this.x = nome;
    this.y = password;
    // Pusho nell'arraylist di stringhe
    this.names.add(nome);
    this.passwords.add(password);
  }

  public void avviaApplicazione() {
    System.out.println("Login Effettuato! Benvenuto " + x + ".");
  }

  public String getNome() {
    return x;
  }

  public void setNome(String nome) {
    this.x = nome;
  }

  public String getPassword() {
    return y;
  }

  public void setPassword(String password) {
    this.y = password;
  }

  // SETTERS & GETTERSI DEGLI ARRAY LIST PER MULTIUSER
  public ArrayList<String> getNames() {
    return names;
  }

  public void setNames(ArrayList<String> names) {
    this.names = names;
  }

  public ArrayList<String> getPasswords() {
    return passwords;
  }

  public void setPasswords(ArrayList<String> passwords) {
    this.passwords = passwords;
  }
}
