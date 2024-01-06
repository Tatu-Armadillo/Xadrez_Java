package tabuleiro;

public abstract class Part {

    private Integer quantyMoviments;
    private Position position;
    private Color color;
    private Board board;

    protected Part(
            final Color color,
            final Board board) {
        this.quantyMoviments = 0;
        this.position = null;
        this.color = color;
        this.board = board;
    }

    public void increaseMovements() {
        this.quantyMoviments++;
    }

    public void decreaseMovements() {
        this.quantyMoviments--;
    }

    public boolean existpossibleMovements() {
        boolean[][] mat = possibleMovements();
        for (int i = 0; i < board.getQuantityLine(); i++) {
            for (int j = 0; j < board.getQuantityColumn(); j++) {
                if (Boolean.TRUE.equals(mat[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean possibleMovement(final Position position) {
        return possibleMovements()[position.getLine()][position.getColumn()];
    }

    public abstract boolean[][] possibleMovements();

    public Color getColor() {
        return color;
    }

    public Board getBoard() {
        return board;
    }

    public Integer getQuantyMoviments() {
        return quantyMoviments;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
