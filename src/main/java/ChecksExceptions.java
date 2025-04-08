
/**
 * PROGRAM: ChecksExceptions
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class ChecksExceptions {

    public void CheckEmptySaleException(Sale sale) {
        System.out.println("* Check Exception EmptySaleException...........");

        try {
            sale.calculateTotal();
            System.out.println("Total price: " + sale.getTotalPrice());
        } catch (
                EmptySaleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void CheckIndexOutOfBoundsException(Sale sale) {
        System.out.println("* Check Exception IndexOutOfBoundsException...........");

        try {
            System.out.println(sale.getProducts().get(sale.getProducts().size() - 1));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
