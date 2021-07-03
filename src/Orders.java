//import com.collectionsexamples.ProductComparator;
import com.pojo.Product;
import java.util.ArrayList;
import java.util.Iterator;

public class Orders extends Inventory{

    ArrayList ordersArray = new ArrayList();

    public void addProductToOrders(String newProductCode) {
        Iterator iterator = inventoryArray.iterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            if (newProductCode.equals(product.getProductCode())) {
                inventoryArray.add(product);
                break;
            }
        }
    }

    public void printOrderUsingList1() {
//        arrayList.sort(new ProductComparator());
        for (int i = 0; i < ordersArray.size(); i++) {
            Product product = (Product) ordersArray.get(i);
            product.printProductDetails();
        }
    }

    public void printOrderUsingList2() {
//        arrayList.sort(new ProductComparator());
        Iterator iterator = ordersArray.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println("\n——————————————————");
            product.printProductDetails();
        }
        System.out.println("\n——————————————————");
    }
}