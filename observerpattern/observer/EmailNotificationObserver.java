package design_patterns.observerpattern.observer;

import design_patterns.observerpattern.observable.StocksObservable;

import java.lang.invoke.StringConcatException;

public class EmailNotificationObserver implements NotificationObserver{

    private String email;
    StocksObservable stocksObservable;

    public EmailNotificationObserver(String email, StocksObservable stocksObservable){
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){
        sendMail("product is in stock - hurry up!", email);
    }

    public void sendMail(String msg, String email){
        //actual implememtation
        System.out.println("Email sent to " + email + " with message " + msg);
    }
}
