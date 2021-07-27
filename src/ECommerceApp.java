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
                } else if (contentsOfLine[0].equals("COMPUTER")) {
                    Computer newComputer = new Computer(line);
                    inventory.addProduct(newComputer);
                } else if (contentsOfLine[0].equals("PHONE")) {
                    Phone newPhone = new Phone(line);
                    inventory.addProduct(newPhone);
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
                Product product = inventory.removeProduct(cart[i]);
                if (product != null) {
                    userOrder.addProduct(product);
                }
            }

            System.out.println("\nChecking out...\n\nCart:");
            userOrder.printOrderUsingList2();

            userOrder.printTotalPrice();

            System.out.println("\nFinal Inventory: ");
            inventory.printInventory();

        } catch (Exception e){
            System.out.println("An exception occurred during your program");
            System.out.println(e.getMessage());
        }
    }
}