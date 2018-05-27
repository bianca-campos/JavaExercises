package FinalExame;

/**
 * @author biancacampos
 */

public abstract class Vehicle implements Comparable, Steerable {
    private int weightPounds;

    public Vehicle(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    //The instance variable must NOTcontaina negative number at any time.
    public boolean weightIsValid() {
        if (weightPounds >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Vehicles are equals if they have the same weight.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "" + weightPounds;
    }


    public int compareTo(Vehicle compare) {
        int compareweight = ((Vehicle) compare).getWeightPounds();
        /* For Ascending order*/
        // Lighter vehicles are greaterthan heavier vehicles. That means, anascendant order by weight.
        return this.weightPounds - compareweight;

    }
}
