import java.util.List;

class Customer {
    private YANN_Food_Delivery yannFoodDelivery;

    public Customer(YANN_Food_Delivery yannFoodDelivery) {
        this.yannFoodDelivery = yannFoodDelivery;
    }

    public void browseMenu() {
        // Fetch the menu items from the YANN_Food_Delivery system
        List<MenuItem> menuItems = yannFoodDelivery.getMenuItems();

        // Display the menu items to the customer
        System.out.println("Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item.getId() + ". " + item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
        }

        // Allow the customer to filter, sort, and search the menu
        // (This functionality can be added later)
    }

    public MenuItem findMenuItem(String name) throws StackOverflowError {
        YANN_Food_Delivery yannFoodDelivery = new YANN_Food_Delivery();
// Add restaurants and menu items to the yannFoodDelivery instance

        // Customer customer = new Customer(yannFoodDelivery);
        //  MenuItem menuItem = customer.findMenuItem("Burger");
        if (name != null) {
            System.out.println("Found menu item: " + name);
        } else {
            System.out.println("Menu item not found.");
        }
        return null;
    }
    // If the menu item is not found, return null


    public Order placeOrder(List<MenuItem> selectedItems, String specialInstructions) {
        // Submit the order to the YANN_Food_Delivery system
        Order order = yannFoodDelivery.placeOrder(selectedItems, specialInstructions);

        // Provide the customer with an order confirmation and estimated delivery time
        System.out.println("Order Confirmation:");
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("Estimated Delivery Time: " + order.getDeliveryTime());
        return order;
    }

    public Order trackOrder(int orderID) {
        // Fetch the order status from the YANN_Food_Delivery system
        Order order = yannFoodDelivery.getOrderStatus(orderID);

        // Display the current status of the order
        System.out.println("Order Status: " + order.getStatus());
        return order;
    }

    public void writeReview(int restaurantID, int rating, String reviewText) {
        // Submit the review to the YANN_Food_Delivery system
        yannFoodDelivery.submitReview(restaurantID, rating, reviewText);
        System.out.println("Review submitted successfully.");
    }

    public void updateProfile(String name, String email, String address) {
        // Submit the updated profile information to the YANN_Food_Delivery system
        yannFoodDelivery.updateCustomerProfile(name, email, address);
        System.out.println("Profile updated successfully.");
    }
}
