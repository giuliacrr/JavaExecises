import java.util.Scanner;

public class ResocontoDigitale {

  public static void main(String[] args) {
    Scanner myScanString = new Scanner(System.in);// String scanner
    /*
     * System.out.println("A quale app vuoi accedere?\n");
     */
    String nomeUtente;
    String password;
    DispositivoElettronico dispEle = new DispositivoElettronico();
    dispEle.avviaApplicazione();

    // Faccio scegliere il nome utente all'utente
    // Provo try & catch
    System.out.println("Devi effettuare la registrazione.\n Inserisci Nome Utente:");
    nomeUtente = myScanString.nextLine();
    if (nomeUtente == "") {
      do {
        System.out.println("Il nome utente non può essere vuoto! Riprova:");
        nomeUtente = myScanString.nextLine();
      } while (nomeUtente == "");
    }
    if (nomeUtente.length() < 3) {
      do {
        System.out.println("Il tuo nome utente deve essere minimo 3 caratteri");
        nomeUtente = myScanString.nextLine();
      } while (nomeUtente.length() < 3);
    }

    System.out.println("Inserisci la password");
    password = myScanString.nextLine();
    if (password == "") {
      do {
        System.out.println("La tua pw non può essere vuota! Riprova:");
        password = myScanString.nextLine();
      } while (password == "");
    }
    if (password.length() < 8) {
      do {
        System.out.println("La tua pw deve essere minimo 8 caratteri");
        password = myScanString.nextLine();
      } while (password.length() < 8);
    }
    // Posso fare un costruttore che pusha elementi in un array?
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
