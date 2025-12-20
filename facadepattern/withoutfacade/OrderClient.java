package design_patterns.facadepattern.withoutfacade;

import design_patterns.facadepattern.*;

public class OrderClient {
    public static void main(String[] args) {

        ProductDAO productDao = new ProductDAO();
        Payment payment = new Payment();
        Invoice invoice = new Invoice();
        Notification notification = new Notification();

        Product product = productDao.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();

        System.out.println("Order created successfully");
    }
}
