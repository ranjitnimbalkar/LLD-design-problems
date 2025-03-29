package lld.design.problem.game.chess;

import lld.design.problem.game.chess.enums.Color;

public class Player {
    private Color color;
    private String name;

    public Player(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

}
