public class Desktop extends Computer {
    double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    //setter
    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }

    //getter
    public double getCaseHeight() {
        return caseHeight;
    }

    //generated toString()
    @Override
    public String toString() {
        return "Desktop{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", caseHeight=" + caseHeight +
                '}';
    }
}
