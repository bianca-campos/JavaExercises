package Lab4;

/**
 * @author biancacampos
 */

public abstract class Employee implements Employable {
    String name;

    /**
     * Constructor of employee class
     *
     * @param name - name of employee
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     *
     * @return return the name of employee
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name set the name of employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the time pay rate
     */
    public abstract double getOverTimePayRate();

}
