import java.util.Objects;

public class InventoryItem {
    // Vegyél fel 3 fieldet: minden InventoryItem-nek legyen
    // egy neve (name),
    // egy mennyisége (quantity)
    // és egy ára (price)
    private String name;
    private int quantity;
    private double price;

    // Írj egy konstruktort, ami beállítja az InventoryItem minden értékét!
    InventoryItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    // Írj gettereket az összes fieldhez!
    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Írj settert a mennyiséghez!
    public void setMoreWithParameterQuantity(int earnQuantity){
        this.quantity = earnQuantity;
    }




    // Írj egy calculateValue() metódust, ami kiszámolja a termék össz. értékét (a mennyiség és egységár függvényében)
    public double calculateValue() {
        return this.price * this.quantity;
    }
    public boolean isEquals(InventoryItem other) {
        return other.price == this.price && other.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "InventoryItem[" +
                "name=" + name +
                ", quantity=" + quantity +
                ", price=" + price + "]";
    }
}
