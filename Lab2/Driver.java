package Lab2;

/**
 * @author biancacampos
 */

public class Driver {
    public static void main(String[] args) {

        Country ca = new Country();
        ca.displayAllProvinces();
        int c = ca.howManyHaveThisPopulation(5, 15);
        System.out.println(c);
    }
}

