public class DispositivoElettronico extends ResocontoDigitale {
  /*
   * Classe base DispositivoElettronico
   * Questa classe contiene il metodo avviaApplicazione(String nomeApp)
   * che stampa un messaggio generico riguardante l'avvio dell'applicazione
   * ogni singola classe deve avere questo metodo per stampare cosa fa.
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
}
