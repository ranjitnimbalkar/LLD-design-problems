package lld.design.problem.game.chess;

import lld.design.problem.game.chess.enums.Color;

import java.util.List;

public abstract class Piece {
    protected Color color;
    protected int x, y; // position on chess board

    public Piece(Color color, int x , int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public abstract List<int[]> getLegalMoves(ChessBoard board);
}
