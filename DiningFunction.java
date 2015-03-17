import java.util.*;

public class DiningFunction {

  public static double diningFunction(double num) {
    double result = 2450.0 - ((2450.0/33.0) * num);
    return Math.round(result*100.0)/100.0;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter current quarter (fall, winter, or spring): ");
    String quarter = input.next();
    String fall = new String("FALL");
    String winter = new String("WINTER");
    String spring = new String("SPRING");

      while (!quarter.equalsIgnoreCase(fall) && !quarter.equalsIgnoreCase(spring) && !quarter.equalsIgnoreCase(winter)) {
        System.out.print("Invalid input: " + quarter + ". Enter current quarter (fall, winter, or spring): ");
        quarter = input.next();
      }

    System.out.print("Enter current week (1-11): ");
    double week = input.nextDouble();

    
    while (week < 0 || week > 11) {
      System.err.print("Invalid number: " + week + ". Enter current week (1-11): ");
      week = input.nextDouble();    
    } 

    double seasonNumber;
    
      if (quarter.equalsIgnoreCase(fall)) seasonNumber = 1.0;
      else if (quarter.equalsIgnoreCase(winter)) seasonNumber = 2.0;
      else seasonNumber = 3.0;


    double numOfWeeks = week * seasonNumber;
    
    System.gc();
    long startTime = System.nanoTime();
    
    double n = diningFunction(numOfWeeks);
    System.out.println("You should have " + n + " dining dollars.");

    long endTime = System.nanoTime();
    double time = (double) (endTime - startTime) / 1000000;
    System.err.println("time: " + time + "s");
   }
}
