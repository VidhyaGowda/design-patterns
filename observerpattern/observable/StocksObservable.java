package design_patterns.observerpattern.observable;

import design_patterns.observerpattern.observer.NotificationObserver;

public interface StocksObservable {
    public void registerObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public void stockUpdated(int newStockCount);
    public int getStockCount();
}
