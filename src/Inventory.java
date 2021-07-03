import com.pojo.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {

    ArrayList inventoryArray = new ArrayList();

    public void addProduct(Product newProduct) {
        inventoryArray.add(newProduct);
    }

    public void removeProduct(String newProductCode) {
        Iterator iterator = inventoryArray.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            if (newProductCode.equals(product.getProductCode())) {
                iterator.remove();
                break;
            }
        }
    }

    //checks if the product is already in inventory and increases stock instead of adding new product
    public void checkProduct(String newProductCode) {
        Iterator iterator = inventoryArray.iterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            if (newProductCode.equals(product.getProductCode())) {
                product.increaseStock();
                // need to remove duplicate product
            }
        }
    }

    public void printInventory() {
        Iterator iterator = inventoryArray.iterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println("\n——————————————————");
            product.printProductDetails();
            product.printStock();
        }
        System.out.println("\n——————————————————");
    }
}
