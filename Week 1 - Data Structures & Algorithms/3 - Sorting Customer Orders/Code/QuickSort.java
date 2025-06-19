public class QuickSort {
    public static void quickSort(Order[] orders, int low, int high){
        if(low<high){
            //partition the array to get pivot index
            int pivotIndex = partition(orders, low, high);

            quickSort(orders, low, pivotIndex-1);
            quickSort(orders,pivotIndex+1, high);
        }
        
    }
    private static int partition(Order[] orders, int low, int high){
        double pivot = orders[high].getPrice();
        int i = low-1;
        for(int j=low; j<high;j++){
            if(orders[j].getPrice()<=pivot){
                i++;
                //swapping orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        //swapping orders[i+1] and orders[high]
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i+1;
    }

}
