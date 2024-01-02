package tabuleiro;

public abstract class Part {

    private Integer quantyMoviments;
    private Position position;
    private Color color;
    private Board board;

    public Part(
            final Color color,
            final Position position,
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
