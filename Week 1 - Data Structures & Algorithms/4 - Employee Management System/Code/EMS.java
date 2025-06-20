import java.util.*;

public class EMS{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];
        int count = 0;
        int id,sal; 
        String name, pos;
        int choice = 0;
        while(choice!=5){
            System.out.println("Employee Management System: \n1.Add Employee\n2.Search Employee \n3.Traverse the list of employees \n4.Delete employee\n5.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    if(count<5)
                    {
                        System.out.println("Adding Employee... \nEnter employee ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Name: ");                        
                        name = sc.nextLine();
                        System.out.println("Enter Position: ");
                        pos = sc.nextLine();
                        System.out.println("Enter Salary: ");
                        sal = sc.nextInt();
                        emp[count++]= new Employee(id, name, pos, sal);
                    }
                    else{
                        System.out.println("Employee array is filled.");
                    }
                    break;
                case 2:
                    if(count<=0){
                        System.out.println("Array is empty. Nothing to search for.");
                    }
                    else{
                        System.out.println("Searching Employee...\nEnter ID to search: ");
                        int idSearch = sc.nextInt(); int flag = 0;
                        for(int i=0; i<count;i++){
                            if(emp[i].getId()==idSearch){
                                System.out.println("Record found! \n"+emp[i]); flag =1 ;
                                break;
                            }
                        }
                        if(flag==0) System.out.println("No record found with corresponding ID entered.");
                    }
                    break;
                case 3:
                    if(count<=0){
                        System.out.println("Array empty, cannot traverse.");
                    }
                    else{
                        System.out.println("Traversing array...");
                        for(int i=0; i<count;i++){
                            System.out.println(emp[i]);
                        }
                    }
                    break;
                case 4:
                    if(count<=0){
                        System.out.println("Array empty, nothing to delete.");
                    }
                    else{
                        boolean deleted = false;
                        System.out.println("Enter ID of employee to be deleted: ");
                        int idDel = sc.nextInt();
                        for (int i = 0; i < count; i++) {
                            if (emp[i].getId() == idDel) {       
                                for (int j = i; j < count - 1; j++) {
                                    emp[j] = emp[j + 1];
                                }
                        count--;
                        deleted = true;
                        System.out.println("Employee record deleted successfully.");
                            }
                        }
                        if (!deleted) {
                        System.out.println("No employee found with ID: " + idDel);
                        }
                    }
                    break;  
                case 5:
                    return;
                default:
                    System.out.println("Wrong value inputted. Try Again.");
            }
        }
        sc.close();
    }
}