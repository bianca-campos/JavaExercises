package Lab4;

/**
 * @author biancacampos
 */

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>{
    double numberOfDollarsStolenPerDay;
    final double OVERTYME_PAY_RATE = 1.5;

    /**
     * Constructor
     * @param name of attendant
     * @param numberOfDollarsStolenPerDay number of dollar stolen per day
     */
    public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
        super(name);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTYME_PAY_RATE;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.UNIFORM;
    }

    @Override
    public boolean isPaidSalary() {
        return false;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "pump";
    }

    @Override
    public int compareTo(GasStationAttendant o) {
        // return negative: this  < o
        // return positive: this  > o
        // return 0       : this  == o
        if (this.numberOfDollarsStolenPerDay < o.numberOfDollarsStolenPerDay) {
            return -1;
        } else if (this.numberOfDollarsStolenPerDay > o.numberOfDollarsStolenPerDay) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof GasStationAttendant)){
            return false;
        }
        if (this.numberOfDollarsStolenPerDay == ((GasStationAttendant)obj).numberOfDollarsStolenPerDay){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return (int)numberOfDollarsStolenPerDay;
    }

    @Override
    public String toString(){
        String spaces = "";
        for (int i = 0; i < 20-name.length(); i++){
            spaces += " ";
        }
        String esub = "Gas Station Attendant";
        String spaces2 = "";
        for (int i = 0; i < 25-esub.length(); i++){
            spaces2 += " ";
        }

        return "Gas Station Attendant" + spaces2 + name + spaces + "steals " + numberOfDollarsStolenPerDay + " dollars a day";
    }

}
