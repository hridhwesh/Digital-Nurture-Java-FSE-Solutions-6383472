import java.util.Scanner;
public class Sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();

        Order[] orders = {
            new Order(1,"Hridhwesh",500),
            new Order(2, "Ramesh", 300),
            new Order(3, "Srinivas", 250),
            new Order(4, "Avantika", 700),
            new Order(5,"Tanmay",1000),
        };
        int length = orders.length;

        System.out.println("Enter 1 for Quick Sort, 2 for Bubble Sort and anything else to exit.");
        int n = sc.nextInt();
        switch(n){
            case 1:
                QuickSort.quickSort(orders, 0, orders.length - 1);
                System.out.println("Using Quick Sort...\nSorted Array: \n");
                for(Order order: orders){
                System.out.println("[Order ID: "+order.getId()+" Customer Name: "+order.getName()+" Total Price: "+order.getPrice()+"]");
                }
                break;
            case 2:
                Order[] sortedOrder2 = bs.bubble(orders,length);
                System.out.println("Using Bubble Sort...\nSorted Array: \n");
                for(Order order: sortedOrder2){
                System.out.println("[Order ID: "+order.getId()+" Customer Name: "+order.getName()+" Total Price: "+order.getPrice()+"]");
                }

                break;
            default:
            System.out.println("Exiting..");

        }
        sc.close();
    }
}