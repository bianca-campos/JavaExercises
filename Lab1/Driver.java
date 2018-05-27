package Lab1;

/**
 * @author biancacampos
 */
public class Driver {
    public static void main(String[] args) {
        Model model1 = new Model("Bianca", "Campos", 24, 80, true, true);
        model1.printDetails();
        model1.displayModelDetails(true);
    }
}
