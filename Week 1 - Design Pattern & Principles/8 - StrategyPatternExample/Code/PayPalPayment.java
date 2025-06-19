public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        // Simulate PayPal processing
        System.out.println("Paid Rs." + amount + " using PayPal account: " + email);
    }
}
//concrete class implementing payment strategy