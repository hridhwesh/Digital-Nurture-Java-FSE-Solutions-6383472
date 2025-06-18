import java.util.Scanner;

public class Search{
    public static void main(String args[]){
        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();

        Scanner sc = new Scanner(System.in);
        Product[] products = {
            new Product("1", "Computer", "Electronics"),
            new Product("2", "Mobile", "Electronics"),
            new Product("3", "Pants", "Apparel"),
            new Product("4", "Shoes", "Apparel"),
            new Product("5", "Watch", "Accessories")
        };

        System.out.println("Enter product name to search: ");
        String nameToBeSearched = sc.nextLine();

        System.out.println("Enter 1 for Linear Search and 2 for Binary Search");
        int n = sc.nextInt();

        if(n==1){
            System.out.println("Using Linear Search..");
            ls.linear(products, nameToBeSearched);
        }
        else if(n==2){
            System.out.println("Using Binary Search..");
            bs.binary(products, nameToBeSearched);
        }
        else{
            System.out.println("Wrong choice");
        }
    }
}