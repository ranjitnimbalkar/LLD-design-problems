package lld.design.problem.game.chess;

import lld.design.problem.game.chess.piece.Pawn;
import lld.design.problem.game.chess.piece.Queen;

public class ChessBoard {

    Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
        initializeChessBoard();
    }

    public void initializeChessBoard() {
        //initialize piece in their starting position
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        Piece pieceToMove = board[startX][startY];
        //implement move logic
        return true;
    }

    private boolean performCastling() {
        return true;
    }

    private void performEnPassant(int startX, int startY, int endX, int endY) {
        // Implement en passant logic
    }

    private void promotePawn(Pawn pawn, int x, int y) {
        // Promote to a Queen by default
        board[x][y] = new Queen(pawn.getColor(), x, y);
    }

    public Piece pieceAt(int x, int y) {
        return board[x][y];
    }

    public void removePieceAt(int x, int y) {
        board[x][y] = null;
    }

}
