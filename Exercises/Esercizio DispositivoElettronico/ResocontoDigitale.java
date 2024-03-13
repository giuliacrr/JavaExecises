import java.util.Scanner;

public class ResocontoDigitale {

  public static void main(String[] args) {
    Scanner myScanString = new Scanner(System.in);// String scanner
    /*
     * System.out.println("A quale app vuoi accedere?\n");
     */
    String nomeUtente;
    String password;
    // Faccio scegliere il nome utente all'utente
    System.out.println("Devi effettuare la registrazione.\n Inserisci Nome Utente:");
    nomeUtente = myScanString.nextLine();
    System.out.println("Inserisci la password");
    password = myScanString.nextLine();
    // Setto nome utente e pw istanziando smartphone (?)
    Smartphone smartphone = new Smartphone(nomeUtente, password);
    smartphone.avviaApplicazione();
    // Login effettuato (?)
    // Cosa devo fare ancora?
    // Richiamare la funzione da tablet che per l'utente corrente
    // mi ritorni il valore dei punti generato random
    // oltre che il suo id (credo?)
    Tablet tablet = new Tablet();
    tablet.getP();
    tablet.getIddì();
    tablet.avviaApplicazione();
  }
}
