//class MobileApp that implement Observer.
public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("[MobileApp - " + name + "] Stock price updated: $" + newPrice);
    }
}

