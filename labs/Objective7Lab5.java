import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      /*If 1 was pressed print Hello World
      If 2 was pressed print a String of your favorite foods Apple, Banana, Coconut.
      If 3 was pressed break the loop.*/

      if (selection == 1) {
        System.out.println("Hello World");
      }
      else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else if (selection ==3) {
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();
  }
}
