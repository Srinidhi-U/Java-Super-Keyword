class FoodOrder {
    String food;
    int price;

    FoodOrder() {
        this("Pizza", 250);
    }

    FoodOrder(String food, int price) {
        this.food = food;
        this.price = price;
    }

    void show() {
        System.out.println("Food: " + this.food);
        System.out.println("Price: ₹" + this.price);
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.show();
    }
}
