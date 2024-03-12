import java.util.ArrayList;
import java.util.Scanner;

public class Menù {
  // paneType[0][1][2];
  private static String[] paneType = { "Brioche", "Di grano", "Integrale" };// Tipo di pane
  private int[] panePrice = { 2, 1, 2 };// Prezzo del pane
  private String[] farcituraDolce = { "Nutella", "Marmellata", "Crema" };
  private int[] farcituraPrezzo = { 3, 2, 4 };

  public static void main(String[] args) {
    // Stampo i tipi di pane
    System.out.println("Scegli un tipo di pane:");
    Scanner myScan = new Scanner(System.in);
    for (int i = 0; i < paneType.length; i++) {
      System.out.println("[" + (i + 1) + "]" + paneType[i]);
    }
  }
}
