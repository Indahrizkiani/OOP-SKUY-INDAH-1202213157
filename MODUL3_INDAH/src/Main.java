import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        boolean report = false;
        Calculation calculation = new Calculation();
do{
    try {
      System.out.println("Menu Program:");
      System.out.println("1. Square");
      System.out.println("2. Circle");
      System.out.println("3. Trapezoid");
      System.out.println("0. Exit");
      System.out.print("Select menu: ");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter the length of the side of the square : ");
          double radius = scanner.nextDouble();
          calculation.setSquare(radius);
          break;
        case 2:
          System.out.print("Enter the radius of the circle : ");
          double side = scanner.nextDouble();
          calculation.setCircle(side);
          break;
        case 3:
          System.out.print("Insert the side of the base of the trapezoid : ");
          double a = scanner.nextDouble();
          System.out.print("Enter the upper side of the trapezoid : ");
          double b = scanner.nextDouble();
          System.out.print("Enter the upper side of the trapezoid : ");
          double t = scanner.nextDouble();
          calculation.setTrapezoid(a, b, t);
          break;
        case 0:
          System.out.println("Program ended");
          break;
        default:
          System.out.println("Option not Available");
          continue;
        }
      repeat = ;

    }catch(Exception a){
      System.out.println("=== Error: input must be a number===");
    }catch(IllegalArgumentException e){
      System.out.println("something went wrong" + e );
    }catch(InterruptedException e){
      System.out.println("something went wrong" + e );
    }
} while (repeat);
scanner.close();  
}
        
}
