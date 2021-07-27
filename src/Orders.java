//import com.collectionsexamples.ProductComparator;
import com.pojo.Product;
import java.util.ArrayList;
import java.util.Iterator;

public class Orders {

    ArrayList ordersArray = new ArrayList();

    // not working
    public void addProduct(Product product) {
        ordersArray.add(product);
    }

    public void printOrderUsingList1() {
        for (int i = 0; i < ordersArray.size(); i++) {
            Product product = (Product) ordersArray.get(i);
            product.printProductDetails();
        }
    }

    public void printOrderUsingList2() {
        Iterator iterator = ordersArray.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println("——————————————————");
            product.printProductDetails();
        }
        System.out.println("——————————————————");
    }

    public void printTotalPrice() {
        Iterator iterator = ordersArray.iterator();
        double totalPrice = 0;
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            totalPrice = totalPrice + product.getPrice();
        }
        System.out.println("\nFinal Total: $" + totalPrice);
    }
}