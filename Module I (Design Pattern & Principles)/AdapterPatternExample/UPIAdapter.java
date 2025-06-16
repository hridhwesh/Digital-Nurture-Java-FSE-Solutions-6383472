public class UPIAdapter implements PaymentProcessor {
    private UPI upi;

    public UPIAdapter() {
        this.upi = new UPI();
    }

    @Override
    public void processPayment() {
        upi.UPIPayment();
    }

    @Override
    public void checkPaymentStatus() {
        upi.UPIStatus();
    }
}
//Adapter Class that implements PaymentProcessor and translates the calls to the gateway-specific methods (UPI in this case.).