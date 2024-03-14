public class Tablet extends DispositivoElettronico {
  private float p;
  private int iddì = 0;

  public void avviaApplicazione() {
    System.out.println("I tuoi punti ammontano a: " + p + " (ID:" + iddì + ")");
  }

  public void setP(float p) {
    this.p = p;
  }

  public float getP() {
    return p = (float) Math.random() * 10;
  }

  public void setIddì(int iddì) {
    this.iddì = iddì;
  }

  // Come gli dico si di incrementare id ma ad ogni elemento di arraylist names?
  // Magari con un metodo in DispositivoElettronico facendo iddi++ ad ogni ciclo
  // di nomi? ANCORA NON FATTO
  public int getIddì() {
    return iddì++;
  }
}
