import java.util.ArrayList;
import java.util.Scanner;

public class Menù {
  // paneType[0][1][2];
  private static String[] paneType = { "Brioche", "Di grano", "Integrale" };// Tipo di pane
  private static int[] panePrice = { 2, 1, 2 };// Prezzo del pane
  private static String[] farcituraType = { "Nutella", "Marmellata", "Crema" };
  private static int[] farcituraPrezzo = { 3, 2, 4 };

  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in); // Scanner
    // Stampo i tipi di pane con il prezzo
    System.out.println("Scegli un tipo di pane:");
    for (int i = 0; i < paneType.length; i++) {
      System.out.println("[" + (i + 1) + "]" + paneType[i] + " " + panePrice[i] + "$.");
    }
    int userPaneScelta = myScan.nextInt(); // Scelgo una delle 3
    switch (userPaneScelta) {
      case 1:
        System.out.println("Hai scelto pane " + paneType[userPaneScelta - 1]);
        break;
      case 2:
        System.out.println("Hai scelto pane " + paneType[userPaneScelta - 1]);
        break;
      case 3:
        System.out.println("Hai scelto pane " + paneType[userPaneScelta - 1]);
        break;
      default:
        System.out.println("Questo valore non esiste.");// Fare in modo di riprovare la scelta
    }

    // Stampo i tipi di farciture con prezzo
    System.out.println("Scegli un tipo di farcitura:");
    for (int i = 0; i < farcituraType.length; i++) {
      System.out.println("[" + (i + 1) + "]" + farcituraType[i] + " " + farcituraPrezzo[i] + "$.");
    }
    int userFarcituraScelta = myScan.nextInt(); // Scelgo una delle 3
    switch (userFarcituraScelta) {
      case 1:
        System.out.println("Hai scelto pane " + paneType[userFarcituraScelta - 1]);
        break;
      case 2:
        System.out.println("Hai scelto pane " + paneType[userFarcituraScelta - 1]);
        break;
      case 3:
        System.out.println("Hai scelto pane " + paneType[userFarcituraScelta - 1]);
        break;
      default:
        System.out.println("Questo valore non esiste."); // Fare in modo di riprovare la scelta
    }

    PiattoSpeciale myPiattoExample = new PiattoSpeciale("esempio", 1, "esempio2", 3);
    PiattoSpeciale myPiatto = new PiattoSpeciale(paneType[userPaneScelta - 1], panePrice[userPaneScelta - 1],
        farcituraType[userFarcituraScelta - 1], farcituraPrezzo[userFarcituraScelta - 1]);
    System.out.println("Il tuo piatto è composto da pane " + myPiatto.getTipoPane() + " con "
        + myPiatto.getTipoFarcitura() + " come farcitura.\nBuon appetito!");
    System.out.println("Il prezzo totale del tuo piatto è di " + myPiatto.getTotalePiatto());
  }
}
