package Puzzle;

/**
 * Cristiano Vicente RA 443913
 * Claudio Roberto Costa RA 527033
 * Rafael Anselmo RA 525650
 * Melisa Cordeiro RA 532533
 */
public class No {
    int estado[] = new int[9];
    String acao;
    No pai;
    int custocaminho;
    int heuristic;
    int pos_ant;

    public No() {
    }

    public No(int[] estado, String acao, No pai, int custocaminho, int pos_ant) {
        this.estado = estado;
        this.acao = acao;
        this.pai = pai;
        this.custocaminho = custocaminho;
        this.heuristic = getHeuristic(estado);
        this.pos_ant = pos_ant;
    }

    public void printEstado() {
        for (int x = 0; x < 9; x++) {
            System.out.printf("%d ", this.estado[x]);
            if (x == 2 || x == 5)
                System.out.println();
        }
        System.out.println();
    }

    public int getHeuristic() {
        return getHeuristic(this.estado);
    }

    public int getHeuristic(int[] array) {
        int heuristic = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                heuristic += Math.abs((i / 3) - ((array[i] - 1) / 3)) + Math.abs((i % 3) - ((array[i] - 1) % 3));
        }
        return heuristic;
    }
}
