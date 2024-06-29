import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

class Order {
    private int orderID;
    private List<MenuItem> items;
    private String specialInstructions;
    private int restaurantId;
    private LocalDateTime deliveryTime;
    private OrderStatus status;

    public Order(List<MenuItem> items, String specialInstructions) {
        this.orderID = UUID.randomUUID().hashCode();
        this.items = items;
        this.specialInstructions = specialInstructions;
        this.status = OrderStatus.PENDING;
    }

    public int getOrderID() {
        return orderID;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
