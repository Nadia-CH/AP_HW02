package Management.Menu;


public class Food extends MenuItem {
    private String _spiceLevel;
    private int _preparationTime;

    public Food(String itemId, String name, double price, String spiceLevel, int preparationTime) {
        super(itemId, name, price, "Food");
        this._spiceLevel = spiceLevel;
        this._preparationTime = preparationTime;
    }

    @Override
    public String getDetails() {
        return "ID: " + getItemId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory() + ", Spice: " + _spiceLevel + ", Preparation Time: " + _preparationTime + "min";
    }

    public String getSpiceLevel() {
        return _spiceLevel; }
    public int getPreparationTime() {
        return _preparationTime; }
}