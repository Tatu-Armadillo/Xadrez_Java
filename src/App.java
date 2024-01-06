import tabuleiro.Board;
import tabuleiro.Color;
import tabuleiro.Part;
import tabuleiro.pices.Pawn;

public class App {
    public static void main(String[] args) throws Exception {
        Part[][] parts = new Part[8][8];
        Board board = new Board(8, 8, parts);

        for (int i = 0; i < 8; i++) {
            parts[1][i] = new Pawn(Color.WHITE, board);
        }

        board.createBoard();
    }
}
