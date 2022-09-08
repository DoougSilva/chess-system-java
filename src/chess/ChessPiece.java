package src.chess;


import src.boardgame.Board;
import src.boardgame.Piece;
import src.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private chess.Color color;
    private int moveCount;

    public ChessPiece(Board board, chess.Color color) {
        super(board);
        this.color = color;
    }

    public chess.Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount ++;
    }

    public void decreaseMoveCount() {
        moveCount --;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
