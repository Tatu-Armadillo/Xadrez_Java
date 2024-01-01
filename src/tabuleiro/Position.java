package tabuleiro;

public class Position {

    public final Integer line;
    public final Integer column;

    public Position(final Integer line, final  Integer column) {
        this.line = line;
        this.column = column;
    }

    public Integer getLine() {
        return this.line;
    }

    public Integer getColumn() {
        return this.column;
    }
    
    @Override
    public String toString() {
        return this.line + ", " + this.column;
    }
}
