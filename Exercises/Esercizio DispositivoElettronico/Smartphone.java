public class Smartphone extends DispositivoElettronico {
  private String x;
  private String y;

  // Costruttore
  public Smartphone(String nome, String password) {
    this.x = nome;
    this.y = password;
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

}
