
/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class Main {

    public static void main(String[] args) {

        process();
    }

    private static void process() {

        ChecksExceptions check = new ChecksExceptions();
        System.out.println("** CREATION SALE...........");
        Sale sale = new Sale();

        System.out.println("* Check Exceptions with error...........");

        check.CheckEmptySaleException(sale);

        check.CheckIndexOutOfBoundsException(sale);

        loadProducts(sale);

        System.out.println("* Check Exceptions no error...........");

        check.CheckEmptySaleException(sale);

        check.CheckIndexOutOfBoundsException(sale);
    }

    private static void loadProducts(Sale sale) {

        System.out.println("** Load articles in Sale...........");
        Product product;
        sale.addProduct(new Product("Book of Java", 48.90));
        sale.addProduct(new Product("Windows 8 Pro", 28.65));
        sale.addProduct(new Product("The bible of Microsoft Excel", 76.84));

    }
}

