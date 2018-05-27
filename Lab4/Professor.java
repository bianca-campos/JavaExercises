package Lab4;

/**
 * @author biancacampos
 */

public class Professor extends Employee implements Comparable<Professor>{
    String teachingMajor;
    final double OVERTYME_PAY_RATE = 2.0;
    final String TEACHES = "Computer Science";

    /**
     * Constructor
     *
     * @param name of professor
     * @param teachingMajor name of major
     */
    public Professor(String name, String teachingMajor) {
        super(name);
        this.teachingMajor = teachingMajor;
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTYME_PAY_RATE;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.FANCY;
    }

    @Override
    public boolean isPaidSalary() {
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return true;
    }

    @Override
    public String getWorkVerb() {
        return "teach";
    }

    @Override
    public int compareTo(Professor o) {
        // return negative: this  < o
        // return positive: this  > o
        // return 0       : this  == o
        if ((this.teachingMajor != TEACHES) && (o.teachingMajor == TEACHES)){
            return -1;
        } else if ((this.teachingMajor == TEACHES) && (o.teachingMajor != TEACHES)){
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
        if (!(obj instanceof Professor)){
            return false;
        }
        if (this.teachingMajor == ((Professor)obj).teachingMajor){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return 0;
    }


    @Override
    public String toString(){
        String spaces = "";
        for (int i = 0; i < 20-name.length(); i++){
            spaces += " ";
        }
        String esub = "Professor";
        String spaces2 = "";
        for (int i = 0; i < 25-esub.length(); i++){
            spaces2 += " ";
        }

        return "Professor" + spaces2 + name + spaces + "teaches " + teachingMajor;
    }
}
