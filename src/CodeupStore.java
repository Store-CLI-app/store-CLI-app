import java.util.Scanner;

/**
 * Created by micahdisney on 5/15/17.
 */


public class CodeupStore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Codeup store! ");
        menu();
    }

    public static String nameOfTheItem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the item's name? ");
        String itemName = sc.next();
        System.out.println(itemName);
        return itemName;
    }


    public static int numberOfItemsSelected() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many would you like? ");
        int quantity = sc.nextInt();
        System.out.println(quantity);
        return quantity;
    }

    public static String priceOfTheItemsSelected() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the price? ");
        String price = String.format("%.2f", sc.nextDouble());
        System.out.println(price);
        return price;
    }

    public static String sale() {
        String userSelection =  numberOfItemsSelected() + " || " + nameOfTheItem() + " || $" + String.format("%.2f", priceOfTheItemsSelected());
        System.out.println(userSelection);
        return userSelection;
    }

    public static int menu() {
        System.out.println("Please select a number:\n1.Sale\n2.Print receipt\n3.Exit ");
        Scanner sc = new Scanner(System.in);
        int userSelection = sc.nextInt();
        System.out.println(userSelection);
        String yesNo = "Y";

        if(userSelection == 1)
            do {
                nameOfTheItem();
                numberOfItemsSelected();
                priceOfTheItemsSelected();
                System.out.println("Would you like to enter another item? Choose Y/N: ");
                yesNo = sc.next();
                System.out.println();
            }
            while (!yesNo.equalsIgnoreCase("N"));
        return menu();

    }


}


