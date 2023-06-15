
public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Elemek hozzáadása
        inventoryManager.addItem("Bloodforged Gauntlets", 10, 5000);
        inventoryManager.addItem("Serpent's Bite", 5, 1400);
        inventoryManager.addItem("Soulreaper", 3, 666666);

        // Miután megírtad az InventoryItem kosntruktorát, futtatható lesz ez a kód is:
        // inventoryManager.addItem(new InventoryItem("Shadowmantle Cloak", 1, 7000));

        inventoryManager.printItems();

        // Mennyiség változtatása
        inventoryManager.updateQuantity("Bloodforged Gauntlets ", 8);

        // Elem eltávolítása
        inventoryManager.removeItem("Serpent's Bite");

        // Teljes érték kiszámítása
        System.out.println("Total inventory value: " + inventoryManager.calculateTotalValue());
    }
}
