package lab7.cscd211Comparator;

import java.util.Comparator;
import lab7.cscd211Inheritance.Engine;

public class ManufacturerComparator implements Comparator<Engine> {

    public ManufacturerComparator() {
    }

    @Override
    public int compare(Engine e1, Engine e2) {
        return e1.getManufacturer().compareTo(e2.getManufacturer());
    }
}
