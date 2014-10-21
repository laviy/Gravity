import java.util.Scanner;

public class EqualPull {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double G = 6.673e-11;
      double M = 5.98e24;
      double distance = 3.844e8;
      double m = 7.3477e22;
      double F = 0;
      
      F = (G * M * m)/(distance * distance);
      
      System.out.println("the eqaul force is at " + F + " meters from earth");
   
  }
  
}
