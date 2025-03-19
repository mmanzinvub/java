public class Desktop extends Computer {
    double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    /*potrebno je implementirati abstract metode (inace error: Class 'Desktop' must either be declared abstract
    or implement abstract method 'getComputerType()' in 'Computer)*/

    //abstract metode
    @Override
    public String getComputerType() {
        return "desktop computer";
    }

    @Override
    public int getPortabilityScore() {
        return (int)(5 + caseHeight / 30);
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
