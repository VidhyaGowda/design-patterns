package design_patterns.observerpattern;

import design_patterns.observerpattern.observable.IphoneObservableImpl;
import design_patterns.observerpattern.observer.EmailNotificationObserver;
import design_patterns.observerpattern.observer.MobileNotificationObserver;

public class Main {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();
        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver("abc@gmail.com", iphoneObservable);
        MobileNotificationObserver mobileNotificationObserver = new MobileNotificationObserver("1234567890", iphoneObservable);
        iphoneObservable.registerObserver(emailNotificationObserver);
        iphoneObservable.registerObserver(mobileNotificationObserver);
        iphoneObservable.stockUpdated(10);
        iphoneObservable.stockUpdated(0);
        iphoneObservable.stockUpdated(10);
    }
}
