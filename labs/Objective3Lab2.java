public class Objective3Lab2 {
  public static void main(String[] args){
    double side1, side2, hypotenuse;
    /*calculate hypotenuse of right triangle given 2 sides.
    print hypotenuse*/

    side1 = 12.33;
    side2 = 16.47;

    hypotenuse = Math.sqrt(side1 * side1 + side2 *side2);
    System.out.println("The hypotenuse of a triangle with sides " +
    side1 + " and " + side2 + " is " + hypotenuse);
  }
}
