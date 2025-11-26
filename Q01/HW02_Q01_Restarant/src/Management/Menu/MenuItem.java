package Management.Menu;


public abstract class MenuItem {
    private String _itemId;
    private String _name;
    private double _price;
    private String _category;

    public MenuItem(String itemId, String name, double price, String category) {
        this._itemId = itemId;
        this._name = name;
        this._price = price;
        this._category = category;
    }

    public abstract String getDetails();

    public String getItemId() {
        return _itemId; }
    public String getName() {
        return _name; }
    public double getPrice() {
        return _price; }
    public String getCategory() {
        return _category; }
}