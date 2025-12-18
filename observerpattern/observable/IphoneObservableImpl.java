package design_patterns.observerpattern.observable;

import design_patterns.observerpattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    private int stockCount;
    private List<NotificationObserver> observers;

    public IphoneObservableImpl(){
        this.stockCount = 0;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(NotificationObserver obj){
        observers.add(obj);
    }
    @Override
    public void removeObserver(NotificationObserver obj){
        observers.remove(obj);
    }
    @Override
    public void notifyObservers(){
        for(NotificationObserver observer: observers){
            observer.update();
        }
    }

    @Override
    public void stockUpdated(int newStockCount){
        if(stockCount==0){
            notifyObservers();
        }
        this.stockCount = newStockCount;
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}
