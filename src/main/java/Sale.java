import java.util.ArrayList;

/**
 * PROGRAM: Sale
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class Sale {

    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void calculateTotal() throws EmptySaleException {

        double total = 0;

        if (products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            for (Product p : products) {
                total += p.getPrice();

            }
            this.totalPrice = total;
        }
    }
}

