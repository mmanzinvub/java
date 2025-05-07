import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Collections.synchronizedList(new ArrayList<>());
        String filePath = "src/orders.txt";

        Thread readerThread = new Thread(new OrderReader(filePath, orders));
        Thread processorThread = new Thread(new OrderProcessor(orders));

        readerThread.start();

        try {
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        processorThread.start();
    }
}