package Management.People;


public class Customer extends Person {
    private String _customerID;
    private int _loyaltyPoints;

    public Customer(String name, String phoneNumber, String customerID) {
        super(name, phoneNumber);
        this._customerID = customerID;
        this._loyaltyPoints = 0;
    }

    public void addLoyaltyPoints(double totalAmount) {
        if (totalAmount > 1000000) {
            _loyaltyPoints += 2;
        } else if (totalAmount > 500000) {
            _loyaltyPoints += 1;
        }
    }

    public double getDiscount() {
        if (_loyaltyPoints > 5) {
            return 0.10;
        } else if (_loyaltyPoints > 3) {
            return 0.05;
        }
        return 0.0;
    }

    @Override
    public String getInfo() {
        return "ID: " + _customerID + ", Name: " + getName() + ", Phone: " + getPhoneNumber() + ", Loyalty Points: " + _loyaltyPoints;
    }

    public String getCustomerID() {
        return _customerID; }
    public int getLoyaltyPoints() {
        return _loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) {
        this._loyaltyPoints = loyaltyPoints; }
}