import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class YANN_Food_Delivery {
    private Map<Integer, Restaurant> restaurants;
    private Map<Integer, Order> orders;
    private Map<Integer, Customer> customers;

    public YANN_Food_Delivery() {
        this.restaurants = new HashMap<>();
        this.orders = new HashMap<>();
        this.customers = new HashMap<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
    }

    public List<MenuItem> getMenuItems() {
        List<MenuItem> menuItems = new ArrayList<>();
        for (Restaurant restaurant : restaurants.values()) {
            menuItems.addAll(restaurant.getMenu());
        }
        return menuItems;
    }

    public Order placeOrder(List<MenuItem> selectedItems, String specialInstructions) {
        // Create a new order
        Order order = new Order(selectedItems, specialInstructions);

        // Assign the order to a restaurant
        int restaurantId = getClosestRestaurant(selectedItems).getId();
        order.setRestaurantId(restaurantId);

        // Set the estimated delivery time
        order.setDeliveryTime(LocalDateTime.now().plusMinutes(45));

        // Add the order to the orders map
        orders.put(order.getOrderID(), order);

        return order;
    }

    public Order getOrderStatus(int orderID) {
        return orders.get(orderID);
    }

    public void submitReview(int restaurantID, int rating, String reviewText) {
        Restaurant restaurant = restaurants.get(restaurantID);
        //  restaurant.addReview(new Review(rating, reviewText));
    }

    public void updateCustomerProfile(String name, String email, String address) {
        // Update the customer's profile information
        // (This functionality can be added later)
    }

    private Restaurant getClosestRestaurant(List<MenuItem> menuItems) {
        // Implement logic to find the closest restaurant that can fulfill the order
        return restaurants.values().iterator().next();
    }
}
