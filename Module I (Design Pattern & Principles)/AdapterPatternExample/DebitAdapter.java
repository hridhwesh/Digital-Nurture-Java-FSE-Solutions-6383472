public class DebitAdapter implements PaymentProcessor {
    private Debit debit;

    public DebitAdapter() {
        this.debit = new Debit();
    }

    @Override
    public void processPayment() {
        debit.DebitPayment();
    }

    @Override
    public void checkPaymentStatus() {
        debit.DebitStatus();
    }
}
//Adapter Class that implements PaymentProcessor and translates the calls to the gateway-specific methods (UPI in this case.).