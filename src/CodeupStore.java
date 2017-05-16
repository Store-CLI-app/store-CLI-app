import java.util.Scanner;

/**
 * Created by micahdisney on 5/15/17.
 */


public class CodeupStore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Codeup store! ");
        String receipt = "";
        double total = 0;
        menu(receipt, total);
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

    public static double priceOfTheItemsSelected() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the price? ");
//        String price = String.format("%.2f", sc.nextDouble());
        double price = sc.nextDouble();
        System.out.println(price);
        return price;
    }

//    public static String receipt(String name, int quantity, String price) {
//        String userSelection =  name + " || " + quantity + " || " + price;
//        System.out.println(userSelection);
//        return userSelection;
//    }

    public static String menu(String receipt, double total) {
        System.out.println("Please select a number:\n1.Sale\n2.Print receipt\n3.Exit ");
        Scanner sc = new Scanner(System.in);
        int userSelection = sc.nextInt();
        System.out.println(userSelection);
        String yesNo;

//        String name = sc.nextLine();
//        int quantity = sc.nextInt();
//        String price = sc.nextLine();

        if (userSelection == 1) {
            do {
                String name = nameOfTheItem();
                int quantity = numberOfItemsSelected();
                double price = priceOfTheItemsSelected();

                receipt += "\n" + name + " || " + quantity + " || $" + String.format("%.2f", price) + " each";
/* System.out.println(receipt); */

                total += quantity * price;


                System.out.println("Would you like to enter another item? Choose Y/N: ");
                yesNo = sc.next();
                System.out.println();
            }
            while (!yesNo.equalsIgnoreCase("N"));
            menu(receipt, total);
        } else if (userSelection == 2) {
            do {
                System.out.println("-------------------------------");
                System.out.println("Thank you for your business");
                System.out.println(receipt);
                System.out.println("--------------------");
                System.out.println("total: $" + String.format("%.2f", total));
                System.out.println("");
//                menu(receipt, total);

                System.out.println("Would you like to return to the menu? Choose Y/N: ");
                yesNo = sc.next();
                System.out.println();
            }
            while (!yesNo.equalsIgnoreCase("Y")) ;
            menu(receipt, total);
        }
        return receipt;
    }

}


