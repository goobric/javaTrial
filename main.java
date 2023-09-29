public class Main {

  public static void main(String[] args){
    // value a, b, c
    double a = 2.3, b =4, c = 5.6;
    double root1, root2;

    // calculate the determinant (b2-4ac)
    double determinant = b * b - 4 * a * c;

    // check if the determinant is greater than zero 0
    if (determinant > 0){
      // two real and distinct roots
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }
    // check if the determinant is equal to zero
    else if (determinant == 0){
      // two real and equal roots
      //determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f:", root1);
    }
  }
}