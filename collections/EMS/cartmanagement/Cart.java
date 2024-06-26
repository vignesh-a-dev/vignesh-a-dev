package collections.EMS.cartmanagement;


import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> cartItems;

    public Cart() {
        cartItems = new HashMap<>();
    }

    public void addItemToCart(Item item, int quantity, Warehouse warehouse) {
        if (warehouse.isInStock(item, quantity)) {
            cartItems.put(item, cartItems.getOrDefault(item, 0) + quantity);
            warehouse.removeItem(item, quantity);
            System.out.println(quantity + " " + item.getTitle() + "(s) added to the cart.");
        } else {
            System.out.println("Not enough stock for item: " + item.getTitle());
        }
    }

    public void removeItemFromCart(Item item, int quantity, Warehouse warehouse) {
        if (cartItems.getOrDefault(item, 0) >= quantity) {
            cartItems.put(item, cartItems.get(item) - quantity);
            warehouse.addItem(item, quantity);
            System.out.println(quantity + " " + item.getTitle() + "(s) removed from the cart.");
        } else {
            System.out.println("Not enough quantity in the cart to remove.");
        }
    }

    public void displayCart() {
        System.out.println("Current Cart:");
        for (Map.Entry<Item, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}

