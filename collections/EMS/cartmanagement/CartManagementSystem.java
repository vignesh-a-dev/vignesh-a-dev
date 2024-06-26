package collections.EMS.cartmanagement;



import java.util.Scanner;

public class CartManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();
        Cart cart = new Cart();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nWarehouse Manager Menu:");
            System.out.println("1. Add Item to Warehouse");
            System.out.println("2. View Warehouse Stock");
            System.out.println("3. Add Item to Cart");
            System.out.println("4. Remove Item from Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item ID: ");
                    int itemId = scanner.nextInt();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter item description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter item title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    Item newItem = new Item(itemId, price, description, title);
                    warehouse.addItem(newItem, quantity);
                    System.out.println("Item added to warehouse.");
                    break;
                case 2:
                    warehouse.displayStock();
                    break;
                case 3:
                    System.out.print("Enter item ID to add to cart: ");
                    itemId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    Item itemToAdd = getItemById(warehouse, itemId);
                    if (itemToAdd != null) {
                        cart.addItemToCart(itemToAdd, quantity, warehouse);
                    } else {
                        System.out.println("Item not found in warehouse.");
                    }
                    break;
                case 4:
                    System.out.print("Enter item ID to remove from cart: ");
                    itemId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    Item itemToRemove = getItemById(warehouse, itemId);
                    if (itemToRemove != null) {
                        cart.removeItemFromCart(itemToRemove, quantity, warehouse);
                    } else {
                        System.out.println("Item not found in warehouse.");
                    }
                    break;
                case 5:
                    cart.displayCart();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the Warehouse Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * @param warehouse
     * @param itemId
     * @return
     */
    private static Item getItemById(Warehouse warehouse, int itemId) {
        for (Item item : warehouse.stock.keySet()) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }
}
