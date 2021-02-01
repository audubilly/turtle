package TicTacToe;

public class TicTacToe {

    private Board gameBoard;
    private boolean wasLastValuePlayedX;
    private boolean gameWon;

    public TicTacToe(Board gameBoard) {
        this.gameBoard = gameBoard;
        this.wasLastValuePlayedX = false;
        this.gameWon = true;
    }


    public Board getBoard() {
    }
}
