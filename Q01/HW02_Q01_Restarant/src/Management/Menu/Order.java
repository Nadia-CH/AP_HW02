package Management.Menu;
import Management.People.Customer;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int _nextOrderId = 1;  

    private int _orderId;
    private Customer _customer;
    private MenuItem[] _items;
    private double _totalAmount;

    public Order(Customer customer, List<MenuItem> items) {
        this._orderId = _nextOrderId++;
        this._customer = customer;


        this._items = new MenuItem[items.size()];
        for (int i = 0; i < items.size(); i++) {
            this._items[i] = items.get(i);
        }

        this._totalAmount = calculateTotal();
    }

    public double calculateTotal() {
        double total = 0;


        for (int i = 0; i < _items.length; i++) {
            MenuItem item = _items[i];
            total += item.getPrice();
        }

        _customer.addLoyaltyPoints(total);

        double discount = _customer.getDiscount();
        double discountAmount = total * discount;
        _totalAmount = total - discountAmount;

        return _totalAmount;
    }

    public String getOrderSummary() {

        String itemsList = "";
        for (int i = 0; i < _items.length; i++) {
            itemsList = itemsList + _items[i].getName();
            if (i < _items.length - 1) {
                itemsList = itemsList + " - ";
            }
        }

        return "Order ID: " + _orderId + ", Customer: " + _customer.getName() + ", Total Amount: " + _totalAmount + "\nItems: " + itemsList;
    }

    public int getOrderId() { return _orderId; }
    public Customer getCustomer() { return _customer; }
    public MenuItem[] getItems() { return _items; }
    public double getTotalAmount() { return _totalAmount; }
}