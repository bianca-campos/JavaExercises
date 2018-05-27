package Lab4;

/**
 * @author biancacampos
 */

public enum DressCode {
    JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");
    private String value;

    DressCode(String value) {
        this.value = value;
    }
}
