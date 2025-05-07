public class Order {
    int orderID;
    String customerName;
    String productName;
    int quantity;
    double pricePerUnit;
    double totalPrice;

    public Order(int orderID, String customerName, String productName, int quantity, double pricePerUnit) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalPrice() {
        return totalPrice = getQuantity() * getPricePerUnit();
    }

    @Override
    public String toString() {
        return "Order: " +
                "orderID=" + orderID +
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                ", totalPrice=" + totalPrice;
    }
}