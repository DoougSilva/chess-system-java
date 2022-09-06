package src.chess;


import src.boardgame.Board;
import src.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private chess.Color color;

    public ChessPiece(Board board, chess.Color color) {
        super(board);
        this.color = color;
    }

    public chess.Color getColor() {
        return color;
    }

}
