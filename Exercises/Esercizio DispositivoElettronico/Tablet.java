public class Tablet extends DispositivoElettronico {
  float p;
  int iddì;

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

  public int getIddì() {
    return iddì++;
  }
}
