// class StockMarket that implements Stock and maintains a list of observers.

import java.util.List;
import java.util.ArrayList;

public class StockMarket implements Stock{
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
    @Override
    public void deRegisterObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(stockPrice);
        }
    }
    @Override
    public void setPrice(double price) {
    this.stockPrice = price;
    System.out.println("Stock price updated to: $" + price);
    notifyObservers();
    }
}