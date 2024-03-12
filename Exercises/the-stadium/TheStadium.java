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
    System.out.println("----------\nChoose one option: \n[1] Total Income \n[2] Total spectators");
    System.out.println("[3] Max spectators\n[4] Min spectators\n----------");

    boolean repeat; // Declare boolean variable "repeat"
    do {
      repeat = false;
      int scelta = myScan.nextInt();// User scelta
      switch (scelta) {
        case 1:// CASE 1 TOTAL INCOME OF ALL X WEEKENDS
          System.out.println(scelta);
          System.out.println("CASO UNO");
          System.out.println(
              "Total Saturdays spectators: " + saturdayPeople + ", for an income of: "
                  + (saturdayIncome * saturdayPeople)
                  + "$.\nTotal Sundays spectators: " + sundayPeople + ", for an income of: "
                  + (sundayIncome * sundayPeople) + "$.");
          totalIncome += (saturdayPeople * saturdayPrice) + (sundayPeople * sundayPrice);
          System.out.println("Total income for " + weekends + " weekends is " + totalIncome + "$");
          System.out.println("Want to ask something else?");
          System.out.println("----------\nChoose one option: \n[1] Total Income \n[2] Total spectators");
          System.out.println("[3] Max spectators\n[4] Min spectators\n[5]Exit\n----------");
          break;
        case 2:// CASE 2 TOTAL SPECTATOR OF ALL X WEEKENDS
          System.out.println(scelta);
          System.out.println("CASO DUE");
          System.out.println(
              "Total Saturdays spectators: " + saturdayPeople +
                  "\nTotal Sundays spectators: " + sundayPeople);
          totalSpectators += saturdayPeople + sundayPeople;
          System.out.println("Spectators for " + weekends + " weekends is " + totalSpectators);
          System.out.println("Want to ask something else?");
          System.out.println("----------\nChoose one option: \n[1] Total Income \n[2] Total spectators");
          System.out.println("[3] Max spectators\n[4] Min spectators\n[5]Exit\n----------");
          break;
        case 3:// CASE 3 MAX SPECTATORS (how many spectators I had more in between the two
               // days)
          System.out.println(scelta);
          System.out.println("CASO TRE");
          System.out
              .println("Saturdays spectators: " + saturdayPeople + "\nSundays spectators: " + sundayPeople);
          if (sundayPeople > saturdayPeople) {
            System.out.println("In between the two days, Sunday had more spectators: " + sundayPeople
                + " compared to Saturday: " + saturdayPeople);
          } else {
            System.out.println("In between the two days, Saturday had more spectators: " + saturdayPeople
                + " compared to Sunday: " + sundayPeople);
          }
          System.out.println("Want to ask something else?");
          System.out.println("----------\nChoose one option: \n[1] Total Income \n[2] Total spectators");
          System.out.println("[3] Max spectators\n[4] Min spectators\n[5]Exit\n----------");
          break;
        /*
         * case 4:// CASE 4 MIN SPECTATORS (how many spectators I had less in between
         * the two
         * // days)
         * System.out.println("CASO QUATTRO");
         * System.out.println("Saturdays spectators: " + saturdayPeople +
         * "\nSundays spectators: " + sundayPeople);
         * if (sundayPeople < saturdayPeople) {
         * System.out.println("In between the two days, Sunday had less spectators: " +
         * sundayPeople
         * + " compared to Saturday: " + saturdayPeople);
         * } else {
         * System.out.println("In between the two days, Saturday had less spectators: "
         * + saturdayPeople
         * + " compared to Sunday: " + sundayPeople);
         * }
         * System.out.println("Want to ask something else?");
         * System.out.
         * println("----------\nChoose one option: \n[1] Total Income \n[2] Total spectators"
         * );
         * System.out.
         * println("[3] Max spectators\n[4] Min spectators\n[5]Exit\n----------");
         *
         * repeat = false;
         */
        case 4:// DEFAULT
          System.out.println(scelta);
          System.out.println("Goodbye!");
          System.out.println("CASO QUATTRO");
          repeat = true;
          break;
      }
    } while (repeat == false);// While repeat is false, repeat the thing up there^
  }
}
