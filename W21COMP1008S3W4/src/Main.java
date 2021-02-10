public class Main {
    public static void main(String[] args) {
        GroceryItem item1 = new GroceryItem("carrots", 4.79, "vegetables");
        GroceryItem item2 = new GroceryItem("bread", 2.79, "bread");

        Purchases shoppingCart = new Purchases();
        shoppingCart.addGroceryItem(item1);
        shoppingCart.addGroceryItem(item2);
        double total = shoppingCart.getTotalPrice();
        System.out.printf("the total price is: $%.2f", total);

        GroceryItem item3 = new GroceryItem("ice cream", 7.89, "dairy");
        shoppingCart.addGroceryItem(item3);
        System.out.println(shoppingCart);
    }
}
