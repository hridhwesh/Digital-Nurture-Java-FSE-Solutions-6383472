public class BubbleSort {
    public Order[] bubble(Order[] orders, int n){
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if (orders[j].getPrice() > orders[j + 1].getPrice()) {
                    // swapping orders[j] and orders[j+1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
        return orders;
    }
}
