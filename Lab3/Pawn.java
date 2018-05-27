package Lab3;

/**
 * @author biancacampos
 */

public class Pawn extends ChessPiece {
    boolean hasBeenPromoted;
    ChessPiece newPiece;

    public Pawn() {
        super(1);
    }

    public void promote(ChessPiece newPiece){
        this.newPiece = newPiece;
        hasBeenPromoted = true;
        this.setValue(newPiece.getValue());
    }

    @Override
    public void move() {
        if(hasBeenPromoted)
            this.newPiece.move();
        else
            System.out.println("forward 1");
    }

    @Override
    public boolean equals(Object value) {

        if(hasBeenPromoted)
            return this.hashCode() == value.hashCode();

        return this.newPiece.hashCode() == value.hashCode();
    }
}


