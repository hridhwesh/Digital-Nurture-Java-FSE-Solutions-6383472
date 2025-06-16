public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(null);

        // Use Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Hridhwesh"));
        context.executePayment(1000);

        // Switch to PayPal
        context.setPaymentStrategy(new PayPalPayment("hridhwesh@example.com"));
        context.executePayment(1500);
    }
}
