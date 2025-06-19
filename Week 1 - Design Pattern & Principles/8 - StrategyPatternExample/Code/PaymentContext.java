public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        if (strategy == null) {
            System.out.println("No payment strategy set.");
        } else {
            strategy.pay(amount);
        }
    }
}

//context class holding reference to payment strategy and method to execute strategy