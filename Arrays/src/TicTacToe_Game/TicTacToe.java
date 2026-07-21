package TicTacToe_Game;

public class TicTacToe {
    private static final char EMPTY = ' ';

    private char[][] board;

    //One of three rows in the board was marked with all of single player's markers => WIN
    public boolean checkRows() {
        for (int i = 0; i < board.length; i++) {
            if (
                    board[i][0] != EMPTY
                    && board[i][0] == board[i][1]
                    && board[i][1] == board[i][2]
            ) return true;
        }
        return false;
    }

    //One of three columns in the board was marked with all of single player's markers => WIN
    public boolean checkColumns() {
        for (int i = 0; i < board.length; i++) {
            if (
                    board[i][0] != EMPTY
                    && board[0][i] == board[1][i]
                    && board[1][i] == board[2][i]
            ) return true;
        }
        return false;
    }

    //One of two diagonals in the board was marked with all of single player's markers => WIN
    public boolean checkDiagonals() {
        boolean mainDialog = board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2];
        boolean antiDialog = board[0][2] != EMPTY && board[0][2] == board[1][1] && board[1][1] == board[0][2];

        return mainDialog || antiDialog;
    }

    static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', EMPTY, 'X'},
                {EMPTY, 'O', 'O'}
        };

        TicTacToe game = new TicTacToe();
        game.board = board;

        System.out.println();

        System.out.println("Rows: " + game.checkRows());
        System.out.println("Columns: " + game.checkColumns());
        System.out.println("Diagonals: " + game.checkDiagonals());
    }
}
