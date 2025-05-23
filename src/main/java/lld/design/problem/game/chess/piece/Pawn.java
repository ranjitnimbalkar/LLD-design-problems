package lld.design.problem.game.chess.piece;

import lld.design.problem.game.chess.ChessBoard;
import lld.design.problem.game.chess.Piece;
import lld.design.problem.game.chess.enums.Color;

import java.util.List;

public class Pawn extends Piece {

    public Pawn(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public List<int[]> getLegalMoves(ChessBoard board) {
        return List.of();
    }

    public boolean canEnPassant(ChessBoard board, int targetX, int targetY) {
        // Implement en passant logic
        return false;
    }

    public boolean canPromote() {
        return (color == Color.WHITE && x == 0) || (color == Color.BLACK && x == 7);
    }

}
