package tabuleiro;

public class Board {

    private final Integer quantityLine;
    private final Integer quantityColumn;

    public Board(final Integer quantityLine, final Integer quantityColumn) {
        this.quantityLine = quantityLine;
        this.quantityColumn = quantityColumn;
    }

    public Integer getQuantityLine() {
        return quantityLine;
    }

    public Integer getQuantityColumn() {
        return quantityColumn;
    }

    public void createBoard() {
        StringBuilder strb = new StringBuilder();
        for (Integer i = 1; i <= quantityLine; i++) {
            strb.append(i.toString());
            for (Integer j = 1; j <= quantityColumn; j++) {
                strb.append(" =");
            }
            strb.append("\n");
        }
        strb.append("  A B C D E F G H");
        System.out.println(strb.toString());
    }

}
