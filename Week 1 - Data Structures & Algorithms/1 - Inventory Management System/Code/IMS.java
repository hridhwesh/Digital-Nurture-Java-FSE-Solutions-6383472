import java.util.Scanner;
import java.util.ArrayList;

public class IMS{
    public static void main(String args[]){
        ArrayList<Product> inventory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=4){
            System.out.println("Inventory Management System\n1.Add product\n2.Update product\n3.Delete product\n4.Exit");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Product ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Product Name: ");sc.nextLine();
                    String nm = sc.nextLine();
                    System.out.println("Enter quantity: ");
                    int q = sc.nextInt();
                    System.out.println("Enter price: ");
                    int p = sc.nextInt();
                    inventory.add(new Product(id,nm,q,p));
                    System.out.println("Product added sucessfully.: "+inventory.get(inventory.size() - 1));
                    System.out.println("Inventory List:");
                    for (Product product : inventory) {
                        System.out.println(product);
                    }
                break;
                case 2:
                    System.out.println("Enter ID of product to update: ");
                    int id1 = sc.nextInt(); boolean found = false;
                    for(Product product:inventory){
                        if(product.getId()==id1){ found = true;
                            System.out.println("Enter new name: ");sc.nextLine();
                            String nm1 = sc.nextLine();
                            System.out.println("Enter new quantity: ");
                            int q1 = sc.nextInt();
                            System.out.println("Enter new price: ");
                            int p1 = sc.nextInt();
                            product.setName(nm1); product.setQuantity(q1); product.setPrice(p1);
                            System.out.println("Product updated"); 
                            break;
                        }
                        
                    }
                    if(!found){
                        System.out.println("Product with given ID was not found.");
                    }
                    System.out.println("Inventory List:");
                    for (Product product : inventory) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.println("Enter ID of product to be deleted: ");
                    int id2 = sc.nextInt(); boolean deleted = false;
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).getId()==(id2)) {
                        inventory.remove(i);
                        System.out.println("Product deleted."); deleted = true;
                        break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Product with given ID was not found.");
                        
                    }
                    System.out.println("Inventory List:");
                    for (Product product : inventory) {
                        System.out.println(product);
                    }
                    break;
                case 4:    
                    return;
                default:
                    System.out.println("Enter valid option.");
            }

        }
        sc.close();
    }
}