import java.util.ArrayList;
import java.util.Scanner;

public class AutomaticBakery {
  public static void main(String[] args) {
    // String arrays
    String[] base = { "Crumble", "Bisquit", "Sponge Cake" };
    String[] stuffing = { "Pistachio Cream", "Nutella", "Egg Cream" };
    String[] fruit = { "Banana", "Strawberry", "No fruit" };
    String[] topping = { "Powder Sugar", "Sprinkles", "No topping" };
    // Scannar
    Scanner myScan = new Scanner(System.in);

    // AL in which elements, one for each previous arrays, will be added
    ArrayList<String> cake = new ArrayList<String>();

    System.out.println("");
    System.out.println("Welcome to the best bakery in town!");
    System.out.println("To make a cake, you must choose one of each of the following choices to compose your cake!");
    System.out.println("Are you ready? Let's get Started!");
    System.out.println("");

    // User Base choice
    System.out.println("Choose a base for your cake:");
    for (int b = 0; b < base.length; b++) {
      System.out.print("[" + (b + 1) + "]" + base[b] + " ");
    }
    System.out.println("");
    int userBase = myScan.nextInt();
    // This condition occurs when user chooses a number < 1 or > 3.
    if (userBase < 1 || userBase > 3) {
      System.out.println("The option you entered doesn't exsist! Choose again!");
      userBase = myScan.nextInt();
    }
    switch (userBase) {
      case 1:
        System.out.println("You chose the following base: " + base[userBase - 1]);// base[0]
        break;
      case 2:
        System.out.println("You chose the following base: " + base[userBase - 1]);// base[1]
        break;
      case 3:
        System.out.println("You chose the following base: " + base[userBase - 1]);// base[2]
        break;
    }
    cake.add(base[userBase - 1]);// add the chosen element to cake AL
    // System.out.println(cake.get(0));
    // to check if the item has been added

    // User Stuffing choice
    System.out.println("");
    System.out.println("Choose a stuffing for your cake:");
    for (int b = 0; b < stuffing.length; b++) {
      System.out.print("[" + (b + 1) + "]" + stuffing[b] + " ");
    }
    int userStuffing = myScan.nextInt();
    // This condition occurs when user chooses a number <1 or >3.
    if (userStuffing < 1 || userStuffing > 3) {
      System.out.println("The option you entered doesn't exsist! Choose again!");
      userStuffing = myScan.nextInt();
    }
    switch (userStuffing) {
      case 1:
        System.out.println("You chose the following stuffing: " + stuffing[userStuffing - 1]);// stuffing[0]
        break;
      case 2:
        System.out.println("You chose the following stuffing: " + stuffing[userStuffing - 1]);// stuffing[1]
        break;
      case 3:
        System.out.println("You chose the following stuffing: " + stuffing[userStuffing - 1]);// stuffing[2]
        break;
    }
    cake.add(stuffing[userStuffing - 1]);// add the chosen element to cake AL
    // System.out.println(cake.get(1));
    // to check if the item has been added

    // User Fruit choice
    System.out.println("");
    System.out.println("Choose a fruit for your cake:");
    for (int b = 0; b < fruit.length; b++) {
      System.out.print("[" + (b + 1) + "]" + fruit[b] + " ");
    }
    int userFruit = myScan.nextInt();
    // This condition occurs when user chooses a number <1 or >3.
    if (userFruit < 1 || userFruit > 3) {
      System.out.println("The option you entered doesn't exsist! Choose again!");
      userFruit = myScan.nextInt();
    }
    switch (userFruit) {
      case 1:
        System.out.println("You chose the following fruit: " + fruit[userFruit - 1]);// fruit[0]
        break;
      case 2:
        System.out.println("You chose the following fruit: " + fruit[userFruit - 1]);// fruit[1]
        break;
      case 3:
        System.out.println("You chose to not put fruit");// fruit[2]
        break;
    }
    cake.add(fruit[userFruit - 1]);// add the chosen element to cake AL
    // System.out.println(cake.get(2));
    // to check if the item has been added

    // User Topping choice
    System.out.println("");
    System.out.println("Choose a topping for your cake:");
    for (int b = 0; b < topping.length; b++) {
      System.out.print("[" + (b + 1) + "]" + topping[b] + " ");
    }
    int userTopping = myScan.nextInt();
    // This condition occurs when user chooses a number <1 or >3.
    if (userTopping < 1 || userTopping > 3) {
      System.out.println("The option you entered doesn't exsist! Choose again!");
      userTopping = myScan.nextInt();
    }
    switch (userTopping) {
      case 1:
        System.out.println("You chose the following topping: " + topping[userTopping - 1]);// topping[0]
        break;
      case 2:
        System.out.println("You chose the following topping: " + topping[userTopping - 1]);// topping[1]
        break;
      case 3:
        System.out.println("You chose to not put topping");// topping[2]
        break;
    }
    cake.add(topping[userTopping - 1]);// add the chosen element to cake AL
    // System.out.println(cake.get(2));
    // to check if the item has been added
    System.out.println("");
    System.out.println("Your cake is now ready!");
    System.out.println("Your cake has " + cake.get(0) + " as base, " + cake.get(1) + " as filling, " + cake.get(2)
        + " and " + cake.get(3));
  }
}
