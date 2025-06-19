public class Test {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        market.registerObserver(mobileUser);
        market.registerObserver(webUser);

        market.setPrice(105.75);
        System.out.println();

        market.setPrice(110.20);
        System.out.println();

        market.deRegisterObserver(webUser);
        market.setPrice(108.00);
    }
}
