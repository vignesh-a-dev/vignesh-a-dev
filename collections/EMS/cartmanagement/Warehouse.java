package collections.EMS.cartmanagement;



import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    Map<Item, Integer> stock;

    public Warehouse() {
        stock = new HashMap<>();
    }

    public void addItem(Item item, int quantity) {
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }

    public boolean isInStock(Item item, int quantity) {
        return stock.getOrDefault(item, 0) >= quantity;
    }

    public void removeItem(Item item, int quantity) {
        if (isInStock(item, quantity)) {
            stock.put(item, stock.get(item) - quantity);
        } else {
            System.out.println("Not enough stock for item: " + item.getTitle());
        }
    }

    public void displayStock() {
        System.out.println("Current Stock:");
        for (Map.Entry<Item, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
