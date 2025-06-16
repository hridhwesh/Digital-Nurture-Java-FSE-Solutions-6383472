//interface Stock with methods to register, deregister, and notify observers.

public interface Stock{
    void registerObserver(Observer observer);
    void deRegisterObserver(Observer observer);
    void notifyObservers();
    void setPrice(double price);
}

//added extra method  to set price