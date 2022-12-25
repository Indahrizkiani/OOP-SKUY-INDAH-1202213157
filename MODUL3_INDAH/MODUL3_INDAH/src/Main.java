import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int customerID, orderQty;
        try{
            System.out.println("Enter Customer ID :");
            customerID = userInput.nextInt();

            System.out.println("Enter how much food to made:");
            orderQty = userInput.nextInt();
            
            Thread t1 = new Thread(restaurant);
            Waiter waiter = new Waiter(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            
        } catch (Exception e) {
            System.out.println("Input must be Integer");

        }
    }
}