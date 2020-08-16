public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third;
    /*Simulate a rolled die to get 3 random values
    between 1 and 6.*/

    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);

    //calculate sum of first, second, and third. Print result

    int result = first + second + third;
    System.out.println(first + " + " + second + " + " + third + " = " + result);

  }
}
