import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(Sring[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckoutFacade facade = new CheckoutFacadeImpl();

        List<Transaction> cart = new ArrayList<>();


        while (true) {

            System.out.print("Enter Customer Name (or 'checkout'): ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("checkout")) break;

            Customer customer = facade.getCustomer(input);

            System.out.println("Customer found: " + customer.getName());


            System.out.print("Enter Item ID: ");

            String itemId = scanner.nextLine();

            Item item = facade.getItem(itemId);

            System.out.println("Item: " + item.getDescription() + ", Price: " + item.getUnitPrice());


            System.out.print("Enter Quantity: ");

            int qty = Integer.parseInt(scanner.nextLine());


            Transaction t = new Transaction();

            t.setCustomerName(customer.getName());

            t.setItemId(itemId);

            t.setQuantity(qty);

            t.setTransactionNumber(new Random().nextInt(1000));

            t.setDate("2024-04-11");

            cart.add(t);

        }


        facade.checkout(cart);

        double total = cart.stream().mapToDouble(t -> t.getQuantity() * facade.getItem(t.getItemId()).getUnitPrice()).sum();

        System.out.println("Total: " + total);

    }

}


