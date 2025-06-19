public class Test{
    public static void main(String[] args) {
        //Create dependency
        CustomerRepository repo = new CustomerRepositoryImpl();

        //dependency injection
        CustomerService service = new CustomerService(repo);

        //use service
        service.displayCustomer(101);
    }
}
//test class