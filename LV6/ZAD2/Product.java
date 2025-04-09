package ZAD2;

public class Product<T> {
    public String name;
    public double price;
    public int quantity;
    public T category;

    public Product(String name, double price, int quantity, T category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
}
