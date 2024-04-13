package lab7.cscd211Inheritance;

public class Engine implements Comparable<Engine> {
    protected int horsePower;
    private String manufacturer;

    // Constructor
    public Engine(String manufacturer, int horsePower) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
    }

    // Getter
    public String getManufacturer() {
        return manufacturer;
    }


    @Override
    public int compareTo(Engine other) {
        return Integer.compare(this.horsePower, other.horsePower);
    }


    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Horsepower: " + horsePower;
    }

    public int calcOutput() {
        return horsePower/5;
    }
}

