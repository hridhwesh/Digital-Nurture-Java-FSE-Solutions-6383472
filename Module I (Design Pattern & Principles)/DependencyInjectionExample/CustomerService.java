public class CustomerService{
    private final CustomerRepository repository;

    //constructor injection
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public void displayCustomer(int id){
        String customer = repository.findCustomerById(id);
        System.out.println("Customer Details: "+customer);
    }
}
//service class 