import java.util.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws StackOverflowError{
        // Create a new instance of the YANN_Food_Delivery system
        YANN_Food_Delivery yannFoodDelivery = new YANN_Food_Delivery();

        // Create some sample restaurants and add them to the system
        Restaurant restaurant1 = new Restaurant(1, "Tasty Treats", "123 Main St");
        Restaurant restaurant2 = new Restaurant(2, "Delicious Dishes", "456 Oak Rd");
        yannFoodDelivery.addRestaurant(restaurant1);
        yannFoodDelivery.addRestaurant(restaurant2);

        // Create a new customer and have them browse the menu
        Customer customer = new Customer(yannFoodDelivery);
        customer.browseMenu();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of menu items to order: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        List<MenuItem> selectedItems = new ArrayList<>();
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the name of menu item " + (i + 1) + ": ");
            String itemName = scanner.nextLine();
            MenuItem menuItem = customer.findMenuItem(itemName);
            if (menuItem != null) {
                selectedItems.add(menuItem);
            } else {
                System.out.println("Menu item not found. Skipping item " + (i + 1));
            }
        }

        System.out.print("Enter any special instructions for the order: ");
        String instructions = scanner.nextLine();

        // Have the customer place the order
        Order order = customer.placeOrder(selectedItems, instructions);
        System.out.println("Order ID: " + order.getOrderID());

        // Have the customer track the order
        Order trackedOrder = customer.trackOrder(order.getOrderID());
        System.out.println("Order Status: " + trackedOrder.getStatus());

        // Have the customer write a review
        System.out.print("Enter the restaurant ID to write a review for: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the review text: ");
        String reviewText = scanner.nextLine();
        customer.writeReview(restaurantId, rating, reviewText);

        // Have the customer update their profile
        System.out.print("Enter the new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the new address: ");
        String address = scanner.nextLine();
        customer.updateProfile(name, email, address);
    }
}


