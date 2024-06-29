class Review {
    private int id;
    private int userId;
    private int restaurantId;
    private int rating;
    private String comment;

    public Review(int id, int userId, int restaurantId, int rating, String comment) {
        this.id = id;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.rating = rating;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
