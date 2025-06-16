public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("[WebApp - " + name + "] Stock price updated: $" + newPrice);
    }
}
//class webapp that implements observer