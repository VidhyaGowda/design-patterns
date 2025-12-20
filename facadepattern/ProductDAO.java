package design_patterns.facadepattern;

public class ProductDAO {
    public Product getProduct(int productId) {
        System.out.println("Fetching product: " + productId);
        return new Product(productId);
    }
}
