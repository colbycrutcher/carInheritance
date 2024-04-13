package lab7.cscd211Inheritance;

public class CarEngine extends Engine implements Comparable<Engine>{

    // Constructors
    public CarEngine(String manufacturer, int horsePower) {
        super(manufacturer, horsePower);
    }

    public CarEngine(int horsePower, String manufacturer) {
        super(manufacturer, horsePower);
    }

    @Override
    public String toString() {
        return "Car Engine - " + super.toString();
    }


    @Override
    public int calcOutput() {
        return super.calcOutput() / 12;
    }
}
