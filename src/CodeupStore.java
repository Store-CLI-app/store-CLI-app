import java.util.Scanner;

/**
 * Created by micahdisney on 5/15/17.
 */


public class CodeupStore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Codeup store! ");
        System.out.println("Please select an option:\n1.Sale\n2.Print receipt\n3.Exit ");
        Scanner sc = new Scanner(System.in);
        String userSelection = sc.nextLine();
        System.out.println(userSelection);
        Sale();
    }

    public static String Sale() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the item's name? ");
        String itemName = sc.nextLine();
        System.out.println(itemName);

        System.out.println("How many would you like? ");
        String quantity = sc.nextLine();
        System.out.println(quantity);

        System.out.println("What is the price? ");
        double price = sc.nextDouble();
        System.out.println(price);

        System.out.println(quantity + " || " + itemName + " || $" + price);
        return userSelection;
    }



}
