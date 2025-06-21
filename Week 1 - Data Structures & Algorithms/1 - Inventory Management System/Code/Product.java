public class Product{
    private int productId;
    private String productName;
    private int quantity;
    private int price;

    public Product(int id, String name, int quants, int pr){
        this.productId = id;
        this.productName = name;
        this.quantity = quants;
        this.price = pr;
    }
    public int getId(){
        return productId;
    }
    public String getName(){
        return productName;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getPrice(){
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity; 
    }
    public void setName(String name){
        this.productName = name;
    }
    public void setPrice(int price) {
        this.price = price; 
    }
    @Override
    public String toString() {
        return "[ID: " + productId + ", Name: " + productName +", Quantity: " + quantity + ", Price: " + price + "]";
    }
}