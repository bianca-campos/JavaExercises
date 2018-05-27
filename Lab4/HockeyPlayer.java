package Lab4;

import java.util.Objects;

/**
 * @author biancacampos
 */

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>{
    int numberOfGoals;
    final double OVERTYME_PAY_RATE = 0.0;

    /**
     * Constructor
     *
     * @param name name of hockey player
     * @param numberOfGoals - number o goals of player
     */
    public HockeyPlayer(String name, int numberOfGoals) {
        super(name);
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTYME_PAY_RATE;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.JERSEY;
    }

    @Override
    public boolean isPaidSalary() {
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "play";
    }


    @Override
    public int compareTo(HockeyPlayer o) {
        // return negative: this  < o
        // return positive: this  > o
        // return 0       : this  == o
        if (this.numberOfGoals < o.numberOfGoals) {
            return -1;
        } else if (this.numberOfGoals > o.numberOfGoals) {
            return 1;
        }
        return 0;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null){
//            return false;
//        }
//        if (!(obj instanceof HockeyPlayer)){
//            return false;
//        }
//        if (this.numberOfGoals == ((HockeyPlayer)obj).numberOfGoals){
//            return true;
//        }
//        return false;
//    }
//
//    public int hashCode(){
//        return numberOfGoals;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HockeyPlayer)) return false;

        HockeyPlayer that = (HockeyPlayer) o;

        if (numberOfGoals != that.numberOfGoals) return false;
        return Double.compare(that.OVERTYME_PAY_RATE, OVERTYME_PAY_RATE) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberOfGoals;
        temp = Double.doubleToLongBits(OVERTYME_PAY_RATE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString(){
        String spaces = "";
        for (int i = 0; i < 20-name.length(); i++){
            spaces += " ";
        }
        String esub = "Hockey Player";
        String spaces2 = "";
        for (int i = 0; i < 25-esub.length(); i++){
            spaces2 += " ";
        }

        return "Hockey Player" + spaces2 + name + spaces + "score " + numberOfGoals + " goals";
    }
}
