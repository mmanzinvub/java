import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OrderReader implements Runnable {
    private String filePath;
    private List<Order> orders;

    public OrderReader(String filePath, List<Order> orders) {
        this.filePath = filePath;
        this.orders = orders;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 5) {
                    continue;
                }

                int orderID = Integer.parseInt(parts[0].trim());
                String customerName = parts[1].trim();
                String productName = parts[2].trim();
                int quantity = Integer.parseInt(parts[3].trim());
                double pricePerUnit = Double.parseDouble(parts[4].trim());

                Order order = new Order(orderID, customerName, productName, quantity, pricePerUnit);

                synchronized (orders) {
                    orders.add(order);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}