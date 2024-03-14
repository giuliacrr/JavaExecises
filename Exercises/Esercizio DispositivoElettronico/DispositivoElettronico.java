import java.util.ArrayList;

public class DispositivoElettronico extends ResocontoDigitale {
  /*
   * Classe base DispositivoElettronico
   * Questa classe contiene il metodo avviaApplicazione(String nomeApp)
   * che stampa un messaggio generico riguardante l'avvio dell'applicazione
   * ogni singola classe deve avere questo metodo per stampare cosa fa.
   * 
   * Devo convertire tutta la linea di flow in static per creare quest'idea
   * 
   */

  public String nameApp; // serve a diversificare chi porta i valori
  /* Devo creare un costruttore che mi riporti un */

  public void avviaApplicazione() {
    System.out.println("Avvio di " + nameApp + " in corso. Attendere prego!");
  }

  public String getNameApp() {
    return nameApp;
  }

  public void setNameApp(String nameApp) {
    this.nameApp = nameApp;
  }

  /*
   * public increaseIdPerName(){
   * for (int i = 0; i < arraynomi.length; i++) {
   * 
   * }
   * }
   */
}
