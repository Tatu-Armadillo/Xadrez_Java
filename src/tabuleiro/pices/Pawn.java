package tabuleiro.pices;

import tabuleiro.Board;
import tabuleiro.Color;
import tabuleiro.Part;
import tabuleiro.Position;

public class Pawn extends Part {

    public Pawn(final Color color, final Board board) {
        super(color, board);
    }

    @Override
    public String toString() {
        return "P";
    }

    private boolean existsEnemies(Position position) {
        Part part = this.getBoard().returnedPart(position);
        return part != null && part.getColor() != this.getColor();
    }

    private boolean freeMovement(Position position) {
        return this.getBoard().returnedPart(position) == null;
    }

    @Override
    public boolean[][] possibleMovements() {

        boolean[][] match = new boolean[getBoard().getQuantityLine()][getBoard().getQuantityLine()];

        Position position = new Position(0, 0);

        position.newPosition(this.getPosition().getLine() - 1, this.getPosition().getColumn());
        if (this.getBoard().validPosicao(position) && freeMovement(position)) {
            match[position.getLine()][position.getColumn()] = true;
        }
        return match;
    }

}
