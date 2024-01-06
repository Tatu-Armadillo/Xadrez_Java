package tabuleiro;

public class Position {

    private Integer line;
    private Integer column;

    public Position(Integer line, Integer column) {
        this.line = line;
        this.column = column;
    }

    public void newPosition(Integer line, Integer column) {
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
