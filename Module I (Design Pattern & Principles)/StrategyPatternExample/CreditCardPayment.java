public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        // Simulate credit card processing
        System.out.println("Paid Rs." + amount + " using Credit Card (" + cardHolderName + ")" +",Card Number: "+cardNumber);
    }
}
//concrete class implementing payment strategy