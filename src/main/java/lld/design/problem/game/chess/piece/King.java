package lld.design.problem.game.chess.piece;

import lld.design.problem.game.chess.ChessBoard;
import lld.design.problem.game.chess.Piece;
import lld.design.problem.game.chess.enums.Color;

import java.util.List;

public class King extends Piece {

    private boolean hasMoved = false;

    public King(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public List<int[]> getLegalMoves(ChessBoard board) {
        return List.of();
    }

    public boolean canCastle(ChessBoard board) {
        //implement castle logic
        return !hasMoved;
    }

}
