package Lab3;

/**
 * @author biancacampos
 */

public class Bishop extends ChessPiece {
    public Bishop() {
        super(3);
    }

    @Override
    public void move() {
        System.out.println("diagonally");
    }
}

