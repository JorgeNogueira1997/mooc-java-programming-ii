
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    // Part 1
    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type LicensePlate, the objects aren't the same
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        // let's convert the object to a LicensePlate-object
        LicensePlate comparedBook = (LicensePlate) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.liNumber.equals(comparedBook.liNumber) &&
            this.country == comparedBook.country) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }
    
    // Part 1
    @Override
    public int hashCode() {
        int hash = 7; // non-zero constant
        
        //  multiply by prime and add the local variables:
        hash = 31 * hash + this.country.hashCode();
        hash = 31 * hash + this.liNumber.hashCode();
        
        return hash;
    }
    
}
