//napravi abstract klasu tako da dodas abstract
public abstract class Computer {
    String model;
    String manufacturer;
    String operatingSystem;

    public Computer (String model, String manufacturer, String operatingSystem) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    //abstract metode
    public abstract String getComputerType();

    public abstract int getPortabilityScore();

    //setters
    public void setModel() {
        this.model = model;
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    public void setOperatingSystem() {
        this.operatingSystem = operatingSystem;
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    //generated toString()
    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}