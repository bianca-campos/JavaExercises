package Lab3;

/**
 * @author biancacampos
 */

public class Queen extends ChessPiece {
    public Queen() {
        super(9);
    }

    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }
}
