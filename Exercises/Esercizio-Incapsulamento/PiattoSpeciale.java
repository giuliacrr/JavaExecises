/*
   * Esercizio Incapsulamento
   * 
   * Creare due classi Piatto Speciale e Ingredienti. Piatto speciale ha
   * ingredienti di tipo PRIVATE e ingredienti public ( es: un panino normale o di
   * sesamo ) e un prezzo specifico per ognuno di loro ( es ingr1 = 2 euro ) + una
   * base di fisso (prezzo = 1 euro )
   * 
   * I private sono gli ingredienti fissi, qualcosa di statico.
   * Se invece voglio dare più scelta e far scegliere allo user
   * posso creare qualcosa di dinamico e public
   * 
   * Creare poi una classe menu che permetta in loop di ordinare il piatto
   * speciale selezionando tra una lista gli ingredienti public e facendo inserire
   * a mano gli ingredienti PRIVATE dopo aver stampato una lista dei possibili
   * casi ( solo quelli devono essere accettati ) a quel punto calcolare il totale
   * e riportare all'inizio
   */
public class PiattoSpeciale {
  private String tipoPane;
  private String tipoFarcitura;
  private int prezzoPane;
  private int prezzoFarcitura;
  private int totalePiatto;

  public PiattoSpeciale(String pane, int prezzoPane, String farcitura, int prezzoFarcitura) {
    this.tipoPane = pane;
    this.prezzoPane = prezzoPane;
    this.tipoFarcitura = farcitura;
    this.prezzoFarcitura = prezzoFarcitura;
    this.totalePiatto = prezzoPane + prezzoFarcitura + 1;
  }

  public String getTipoPane() {
    return tipoPane;
  }

  public void setTipoPane(String tipoPane) {
    this.tipoPane = tipoPane;
  }

  public String getTipoFarcitura() {
    return tipoFarcitura;
  }

  public void setTipoFarcitura(String tipoFarcitura) {
    this.tipoFarcitura = tipoFarcitura;
  }

  public int getPrezzoPane() {
    return prezzoPane;
  }

  public void setPrezzoPane(int prezzoPane) {
    this.prezzoPane = prezzoPane;
  }

  public int getPrezzoFarcitura() {
    return prezzoFarcitura;
  }

  public void setPrezzoFarcitura(int prezzoFarcitura) {
    this.prezzoFarcitura = prezzoFarcitura;
  }

}
