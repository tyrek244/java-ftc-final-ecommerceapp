import com.pojo.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory {

    ArrayList inventoryArray = new ArrayList();
    Map inventoryCountMap = new HashMap<>();

    public void addProduct(Product newProduct) {
        inventoryArray.add(newProduct);
        int count;
        if (inventoryCountMap.get(newProduct.getProductCode()) == null) {
            count = 1;
        } else {
            count = (int) inventoryCountMap.get(newProduct.getProductCode());
            count = count + 1;
        }
        inventoryCountMap.put(newProduct.getProductCode(), count);
    }

    public Product removeProduct(String newProductCode) {
        Iterator iterator = inventoryArray.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            if (newProductCode.equals(product.getProductCode())) {
                iterator.remove();
                int count = (int) inventoryCountMap.get(newProductCode);
                count = count - 1;
                inventoryCountMap.put(newProductCode, count);
                return product;
            }
        }
        return null;
    }

    public void printInventory() {
        Iterator iterator = inventoryArray.iterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println("——————————————————");
            product.printProductDetails();
            System.out.println("\nStock: " + inventoryCountMap.get(product.getProductCode()));
        }
        System.out.println("——————————————————");
    }
}
