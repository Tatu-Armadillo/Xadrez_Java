package tabuleiro;

public class Board {

    private final Integer quantityLine;
    private final Integer quantityColumn;
    private final Part[][] parts;

    public Board(
            final Integer quantityLine,
            final Integer quantityColumn,
            final Part[][] parts) {
        this.quantityLine = quantityLine;
        this.quantityColumn = quantityColumn;
        this.parts = parts;
    }

    public Integer getQuantityLine() {
        return quantityLine;
    }

    public Integer getQuantityColumn() {
        return quantityColumn;
    }

    public Part returnedPart(Integer line, Integer column) {
        return parts[line][column];
    }

    public Part returnedPart(Position position) {
        return returnedPart(position.getLine(), position.getColumn());
    }

    public boolean validPosicao(Position position) {
        if (position.getLine() < 0
                || position.getLine() >= quantityLine
                || position.getColumn() < 0
                || position.getColumn() >= quantityColumn) {
            // throw new BoardException("Invalid Position");
            return false;
        }
        return true;
    }

    public void removePart(Position position) {
        Part part = returnedPart(position);
        if (part != null) {
            part.setPosition(null);
            parts[position.getLine()][position.getColumn()] = null;
        }
    }

    public void createBoard() {
        final StringBuilder strb = new StringBuilder();
        for (Integer i = 1; i <= quantityLine; i++) {
            strb.append(i.toString());
            for (Integer j = 1; j <= quantityColumn; j++) {
                Part part = parts[i - 1][j - 1];
                if (part != null) {
                    strb.append(" " + part.toString());
                } else {
                    strb.append(" =");
                }
            }
            strb.append("\n");
        }
        strb.append("  A B C D E F G H");
        System.out.println(strb.toString());
    }

}
