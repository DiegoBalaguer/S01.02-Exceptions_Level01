
/**
 * PROGRAM: Product
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    private void setName(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty object name cannot be assigned.");
        } else
            this.name = r;
    }

    private void setPrice(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("The base price must be greater than 1€.");
        } else
            this.price = r;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
