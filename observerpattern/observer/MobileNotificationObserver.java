package design_patterns.observerpattern.observer;

import design_patterns.observerpattern.observable.StocksObservable;

public class MobileNotificationObserver implements NotificationObserver {
    private String mobileNumber;
    StocksObservable stocksObservable;

    public MobileNotificationObserver(String mobileNumber, StocksObservable stocksObservable){
        this.mobileNumber = mobileNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){
        sendSMS("product is in stock - hurry up!", mobileNumber);
    }

    public void sendSMS(String msg, String mobileNumber){
        //actual implementation
        System.out.println("SMS sent to " + mobileNumber + " with message " + msg);
    }
}
