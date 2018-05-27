package Lab3;

public class Driver {
    public static void main(String[] args) {
        Pawn chessPawn = new Pawn();
        System.out.println(chessPawn);
        chessPawn.move();
        ChessPiece chessKnight = new Knight();
        System.out.println(chessKnight);
        chessKnight.move();
        ChessPiece chessBishop = new Bishop();
        System.out.println(chessBishop);
        chessBishop.move();
        ChessPiece chessRook = new Rook();
        System.out.println(chessRook);
        chessRook.move();
        ChessPiece chessQueen = new Queen();
        System.out.println(chessQueen);
        chessQueen.move();
        ChessPiece chessKing = new King();
        System.out.println(chessKing);
        chessKing.move();

        chessPawn.promote(new Bishop());
        System.out.println(chessPawn);
        chessPawn.move();
        chessKing.equals(chessPawn);
    }
}
