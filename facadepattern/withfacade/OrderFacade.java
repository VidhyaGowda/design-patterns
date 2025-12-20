package design_patterns.facadepattern.withfacade;
import design_patterns.facadepattern.*;

public class OrderFacade {

    private ProductDAO productDao;
    private Payment payment;
    private Invoice invoice;
    private Notification notification;

    public OrderFacade() {
        productDao = new ProductDAO();
        payment = new Payment();
        invoice = new Invoice();
        notification = new Notification();
    }

    public void createOrder(int productId) {
        Product product = productDao.getProduct(productId);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
