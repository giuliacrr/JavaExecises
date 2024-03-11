import java.util.ArrayList;
import java.util.Scanner;

public class TheStadium {
  public static void main(String[] args) {
    /*
     * 1)Creare un sistema di ID che conti quante persone vengono allo stadio
     * quindi devi generare quante persone vengono ogni weekend con random
     * 2)Il sistema deve permetterti di randomizzare X week end per fare stime
     * di affluenza. Le stime da fare sono: max min spettatori, max min incasso
     * 3)Ogni biglietto costa il sabato 20$, domenica 15$, deve essere disponibile
     * filtrare il giorno, cioè quante persone max e min ho avuto domenica e sab
     * e quanto incasso ho avuto sab e dom
     */

    // Genero una quantità di weekends
    int weekends = (int) (Math.random() * 4 + 1);// Genererà un numero tra 1 e 4
    System.out.println(weekends + " weekends");
    int saturdayPrice = 20;
    int sundayPrice = 15;
    int saturdayPeople = (int) (Math.random() + 1);
    int sundayPeople = (int) (Math.random() + 1);
    int saturdayIncome = saturdayPeople * saturdayPrice;
    int sundayIncome = sundayPeople * sundayPrice;
    int totalIncome = 0; // Totale sommato dei singoli weekend moltiplicato per il totale. Come???
    int totalSpectators = 0;
    int maxSpectators;//
    int minSpectators; // Dei x cicli di weekend come vedo qual è il minimo?
    int maxIncome;// ???
    int minIncome;// ???

    for (int i = 0; i < weekends; i++) {
      saturdayPeople += (int) (Math.random() * 1001);// Spectators every saturday
      // System.out.println("We have " + saturdayPeople + "on the " + (i + 1) +
      // "saturday");
      sundayPeople += (int) (Math.random() * 1001);// Spectators every sunday
      // System.out.println("We have " + sundayPeople + "on the " + (i + 1) +
      // "sunday");
    }
    Scanner myScan = new Scanner(System.in);
    System.out.println("Choose one of the following options: \n [1]Total Income \n[2]Total spectators \n [3]Sglorb");
    int scelta = myScan.nextInt();
    boolean repeat;
    do {
      repeat = false;
      switch (scelta) {
        case 1:
          totalIncome += (saturdayPeople * saturdayPrice) + (sundayPeople * sundayPrice);
          System.out.println("Total income for " + weekends + " weekends is " + totalIncome + "$");
          break;
        case 2:
          totalSpectators += saturdayPeople + sundayPeople;
          System.out
              .println("Total spectators for " + weekends + " weekends is " + totalSpectators);
          break;
        case 3:
          System.out.println("jfhsdfusfhsdoufhsduf skuhf skudhfuskdhfujhjskhdf!");
          break;
        default:
          System.out.println(
              "The value is not valid, choose another among:\n [1]Total Income \n [2]Total spectators \n [3]Sglorb ");
          scelta = myScan.nextInt();
          repeat = true;
      }
    } while (repeat);

  }
}
