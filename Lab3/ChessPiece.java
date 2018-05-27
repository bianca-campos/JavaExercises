package Lab3;

/**
 * @author biancacampos
 */
public abstract class ChessPiece {
    int value;


    //constructor
    public ChessPiece(int value) {
        this.value = value;
    }

    //getter
    public int getValue() {
        return value;
    }

    //setter
    public void setValue(int value) {
        this.value = value;
    }

    public String equals() {
        switch (value) {
            case 1:
                return "Pawn";
            case 2:
                return "Knight";
            case 3:
                return "Bishop";
            case 5:
                return "Rook";
            case 9:
                return "Queen";
            case 1000:
                return "King";
            default:
                return "None chess piece";
        }
    }

    public abstract void move();

    @Override
    public String toString() {
        return equals();
    }

    @Override
    public int hashCode() {
        return getValue();
    }

    @Override
    public boolean equals(Object value) {
        return this.hashCode() == value.hashCode();
    }

}