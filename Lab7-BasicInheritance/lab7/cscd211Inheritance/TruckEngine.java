package lab7.cscd211Inheritance;

public class TruckEngine extends Engine implements Comparable<Engine> {
    // Additional field
    private boolean diesel;

    // Constructor
    public TruckEngine(String manufacturer, int horsePower, boolean diesel) {
        super(manufacturer, horsePower);
        this.diesel = diesel;
    }

    // toString method override
    @Override
    public String toString() {
        String engineType;
        if (diesel) {
            engineType = "is a diesel engine";
        } else {
            engineType = "is NOT a diesel engine";
        }
        return "Truck Engine - " + super.toString() + " " + engineType;
    }


    // Method to calculate engine output (overrides parent method)
    @Override
    public int calcOutput() {
        // Calculate output based on diesel or non-diesel
        if (diesel) {
            return super.calcOutput() / 18;
        } else {
            return super.calcOutput() / 8;
        }
    }
}
