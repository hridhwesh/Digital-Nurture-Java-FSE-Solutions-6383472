public class Order{
    private int orderId;
    private String customerName;
    private int totalPrice;

    public Order(int orderid, String customername, int totalprice){
        this.orderId = orderid;
        this.customerName = customername;
        this.totalPrice = totalprice;
    }
    //Getters
    public int getId(){
        return orderId;
    }
    public String getName(){
        return customerName;
    }
    public int getPrice(){
        return totalPrice;
    }
}