import java.util.*;

public class OrderProcessor implements Runnable {
    private List<Order> orders;

    public OrderProcessor(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double totalSum = 0;
        Map<String, Double> userTotals = new HashMap<>();
        Order mostExpensive = null;

        synchronized (orders) {
            for (Order o : orders) {
                double totalPrice = o.getTotalPrice();
                totalSum += totalPrice;

                userTotals.put(o.customerName, userTotals.getOrDefault(o.customerName, 0.0) + totalPrice);

                if (mostExpensive == null || totalPrice > mostExpensive.getTotalPrice()) {
                    mostExpensive = o;
                }
            }
        }

        System.out.println("\n----- Sazetak narudzbi -----");
        System.out.printf("Ukupna vrijednost svih narudzbi: %.2f eura\n", totalSum);

        System.out.println("\nUkupna vrijednost po korisniku:");
        for (Map.Entry<String, Double> entry : userTotals.entrySet()) {
            System.out.printf("%s: %.2f eura\n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nNajskuplja narudzba:");
        System.out.println(mostExpensive);
    }
}