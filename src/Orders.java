//import com.collectionsexamples.ProductComparator;
import com.pojo.Product;
import java.util.ArrayList;
import java.util.Iterator;

public class Orders {

    ArrayList ordersArray = new ArrayList();

    public void addProduct(Product product) {
        ordersArray.add(product);
    }

    public void printOrder() {
        Iterator iterator = ordersArray.iterator();
        int productCount = 1;
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println("——————————————————\n" + productCount + ".\n");
            product.printProductDetails();
            productCount = productCount + 1;
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