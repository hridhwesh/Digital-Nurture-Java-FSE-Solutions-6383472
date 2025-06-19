import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public void binary(Product[] products, String productName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(productName);

            if (comparison == 0) {
                System.out.println(productName+" found in array. Product ID: "+products[mid].getProductId()+". Product Category: "+products[mid].getCategory()+"."); return;
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Product couldn't be found!");
        
    }
}