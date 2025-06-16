public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public String findCustomerById(int id){
        //simulating data fetching
        return "Customer #" +id + "-Hridhwesh";
    }
}
//concrete repository implementing customer repository