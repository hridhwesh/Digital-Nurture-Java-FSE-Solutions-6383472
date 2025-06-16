public class Test {
    public static void testCode(PaymentProcessor pp) {
        pp.processPayment();
        pp.checkPaymentStatus();
    }

    public static void main(String[] args) {
        UPIAdapter upiAdapter = new UPIAdapter();
        testCode(upiAdapter);

        System.out.println();

        DebitAdapter debitAdapter = new DebitAdapter();
        testCode(debitAdapter);
    }
}
//Test class