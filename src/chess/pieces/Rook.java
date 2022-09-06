package src.chess.pieces;

import chess.Color;
import src.boardgame.Board;
import src.chess.ChessPiece;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
