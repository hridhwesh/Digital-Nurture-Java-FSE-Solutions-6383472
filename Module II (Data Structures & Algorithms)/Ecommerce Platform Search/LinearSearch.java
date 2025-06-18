public class LinearSearch{
    public void linear(Product[] products, String name){
        int found = 0;
        for (Product product : products){
            if(product.getProductName().equalsIgnoreCase(name)){
                System.out.println(product.getProductName() + " found in array. Product ID: "+product.getProductId()+". Product Category: "+product.getCategory()+".");
                found = 1;
                return;                
            }
        }
        if (found == 0){
            System.out.println("Product couldn't be found!");
        }
    }
}
