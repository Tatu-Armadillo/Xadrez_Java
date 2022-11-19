package tabuleiro;

public class Tabuleiro {

    private Integer qtdLinha;
    private Integer qtdColuna;

    public Tabuleiro(Integer qtdLinha, Integer qtdColuna) {
        this.qtdLinha = qtdLinha;
        this.qtdColuna = qtdColuna;
    }

    public Integer getQtdColuna() {
        return qtdColuna;
    }

    public Integer getQtdLinha() {
        return qtdLinha;
    }

    public void createTabuleiro() {
        StringBuilder tabuleiro = new StringBuilder();
        for (Integer i = 1; i <= qtdLinha; i++) {
            tabuleiro.append(i.toString());
            for (Integer j = 1; j <= qtdLinha; j++) {
                tabuleiro.append(" =");
            }
            tabuleiro.append("\n");
        }
        tabuleiro.append("  A B C D E F G H");
        System.out.println(tabuleiro.toString());
    }

}
