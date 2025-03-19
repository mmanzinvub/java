public class Laptop extends Computer {
    int batteryCapacity;
    double weight;

    public Laptop (String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    //setter
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //getter
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    //generated toString()
    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                '}';
    }
}