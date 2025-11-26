package Management.Menu;


public class Beverage extends MenuItem {
    private String _size;
    private String _temperature;

    public Beverage(String itemId, String name, double price, String size, String temperature) {
        super(itemId, name, price, "Beverage");
        this._size = size;
        this._temperature = temperature;
    }

    @Override
    public String getDetails() {
        return "ID: " + getItemId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory() + ", Size: " + _size + ", Temperature: " + _temperature;
    }

    public String getSize() {
        return _size; }
    public String getTemperature() {
        return _temperature; }
}