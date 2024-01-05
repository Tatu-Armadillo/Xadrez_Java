package tabuleiro.pices;

import tabuleiro.Board;
import tabuleiro.Color;
import tabuleiro.Part;

public class Pawn extends Part {

    public Pawn(final Color color, final Board board) {
        super(color, board);
    }

    @Override
    public Boolean[][] possibleMovements() {

        throw new UnsupportedOperationException("Unimplemented method 'possibleMovements'");
    }

    @Override
    public String toString() {
        return "P";
    }
    
}
