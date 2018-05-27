package Lab4;

/**
 * @author biancacampos
 */

public class Parent extends Employee implements Comparable<Parent>{
    int numberOfHoursSpentPerWeekWithKids;

    /**
     * Constructor
     *
     * @param name of parent
     * @param numberOfHoursSpentPerWeekWithKids number of hours with kids per week
     */
    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    @Override
    public double getOverTimePayRate() {
        return -2.0;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.ANYTHING;
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
        return "care";
    }

    @Override
    public int compareTo(Parent o) {
        // return negative: this  < o
        // return positive: this  > o
        // return 0       : this  == o
        if (this.numberOfHoursSpentPerWeekWithKids < o.numberOfHoursSpentPerWeekWithKids) {
            return -1;
        } else if (this.numberOfHoursSpentPerWeekWithKids > o.numberOfHoursSpentPerWeekWithKids) {
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
        if (!(obj instanceof Parent)){
            return false;
        }
        if (this.numberOfHoursSpentPerWeekWithKids == ((Parent)obj).numberOfHoursSpentPerWeekWithKids){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return numberOfHoursSpentPerWeekWithKids;
    }

    @Override
    public String toString(){
        String spaces = "";
        for (int i = 0; i < 20-name.length(); i++){
            spaces += " ";
        }
        String esub = "Parent";
        String spaces2 = "";
        for (int i = 0; i < 25-esub.length(); i++){
            spaces2 += " ";
        }

        return "Parent" + spaces2 + name + spaces + "spends " + numberOfHoursSpentPerWeekWithKids + " hours/week with kids";
    }
}
