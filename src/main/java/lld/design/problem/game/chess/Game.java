package lld.design.problem.game.chess;

import lld.design.problem.game.chess.enums.GameStatus;

public class Game {

    ChessBoard board;
    Player whitePlayer, blackPlayer;
    Player currentTern;
    GameStatus gameStatus;

    public Game(Player whitePlayer, Player blackPlayer) {
        this.board = new ChessBoard();
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.currentTern = whitePlayer;
        this.gameStatus = GameStatus.ONGOING;
    }

    public boolean makeMove(int startX, int startY, int endX, int endY) {
        if(board.movePiece(startX, startY, endX, endY)) {
           switchTern();
           return true;
        }
        return false;
    }

    private void switchTern() {
        currentTern = currentTern == whitePlayer ? blackPlayer : whitePlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
