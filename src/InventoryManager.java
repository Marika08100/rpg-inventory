import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        // TODO
        // Add hozzá (az ebben az osztályban lévő) inventory változóhoz a paraméterként kapott itemet!
        if (inventory.contains(item)) {
            for (InventoryItem actual : inventory) {
                if (actual.equals(item)) {
                    actual.setMoreWithParameterQuantity(item.getQuantity());
                    return;
                }
            }
        }
        inventory.add(item);
    }

    public void addItem(String name, int quantity, double price) {
        // TODO
        // Hívd meg az InventoryItem kosntruktorát a három paraméterrel és mentsd el egy item változóba!
       // Add hozzá az inventoryhoz ezt az item-et!
      InventoryItem item = new InventoryItem(name, quantity, price);
       inventory.add(item);
        //addItem(name, quantity, price);
    }

    public void printItems() {
        // TODO
        for (InventoryItem item : inventory) {
            System.out.println("Name : " + item.getName());
            System.out.println("Quantity" + item.getQuantity());
            System.out.println("Price " + item.getPrice());

            System.out.println(inventory.toString());
        }
    }

    public void removeItem(String name) {
        // TODO
        for (InventoryItem actual : inventory) {
            if (actual.getName().equals(name)) {
                inventory.remove(actual);
                return;
            }


        }
    }

    public void updateQuantity(String name, int newQuantity) {
        // TODO
        for (InventoryItem actual : inventory) {
            if (actual.getName().equals(name)) {
                actual.setQuantity(newQuantity);
                return;
            }


        }


    }

    public double calculateTotalValue() {
        // TODO
        int sum = 0;
        for (InventoryItem actual : inventory) {
            sum += actual.calculateValue();
        }
        return sum;
    }


}
