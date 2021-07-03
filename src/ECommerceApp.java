import com.pojo.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class ECommerceApp {
    public static void main(String[] args) {

        try {
            Inventory inventory = new Inventory();
            Orders userOrder = new Orders();

            File file = new File("C:\\Users\\Tyrek\\IdeaProjects\\eCommerceApplication_TyrekBlanks\\src\\com\\pojo\\InventoryFile");

            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] contentsOfLine = line.split(", ");
                if (contentsOfLine[0].equals("BOOK")) {
                    Book newBook = new Book(line);
                    inventory.addProduct(newBook);
                    //inventory.checkProduct(newBook);
                } else if (contentsOfLine[0].equals("COMPUTER")) {
                    Computer newComputer = new Computer(line);
                    inventory.addProduct(newComputer);
                    //inventory.checkProduct(newComputer);
                } else if (contentsOfLine[0].equals("PHONE")) {
                    Phone newPhone = new Phone(line);
                    inventory.addProduct(newPhone);
                    //inventory.checkProduct(newPhone);
                }
            }

            System.out.println("Welcome to my eCommerceApplication\n");
            System.out.println("Inventory:");
            inventory.printInventory();

            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter the products you would like to purchase (Enter each product's ID, separated by ','): ");
            String purchasedProducts = userInput.nextLine();
            String[] cart = purchasedProducts.split(",");

            for (int i = 0; i < cart.length; i++) {
                inventory.removeProduct(cart[i]);
                userOrder.addProduct(cart[i]);
            }

            System.out.println("\nChecking out...\n\nCart:");
            userOrder.printOrderUsingList2();

            System.out.println("\nFinal Inventory: ");
            inventory.printInventory();

            /*OLD OBJECT CREATION-----------------------------------------------
            Book javaBook = new Book("How to program in java", "John", 42, ECommerceProductType.BOOK);

            Book cPlusPlusBook = new Book("How to program in c++", "Sally", 30, ECommerceProductType.BOOK);

            Computer computer = new Computer("Mac", 1200, ECommerceProductType.COMPUTER);

            Phone phone = new Phone("IPhone", 6, 6, 600, ECommerceProductType.PHONE);

            Orders myOrders = new Orders();
            myOrders.addProduct(javaBook);
            myOrders.addProduct(cPlusPlusBook);
            myOrders.addProduct(computer);
            myOrders.addProduct(phone);

            myOrders.printOrderUsingList1();
             */

        } catch (Exception e){
            System.out.println("An exception occurred during your program");
            System.out.println(e.getMessage());
        }
    }
}