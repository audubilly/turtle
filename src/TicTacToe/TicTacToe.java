package TicTacToe;

public class TicTacToe {

    private Board gameBoard;
    private boolean wasLastValuePlayedX;
    private boolean gameWon;

    public TicTacToe(Board gameBoard) {
        this.gameBoard = gameBoard;
        this.wasLastValuePlayedX = false;
        this.gameWon = false;
    }

    public Board getGameBoard() {
        return gameBoard;
    }

    public boolean isWasLastValuePlayedX() {
        return wasLastValuePlayedX;
    }

    public boolean isGameWon() {
        return gameWon;
    }



    public void makeMove(int rowNumber) {
        rowNumber -= 1;
        int row = rowNumber / 3;
        int col = rowNumber % 3;
        GameValue[][] grid = gameBoard.getGrid();
        if (grid[row][col].equals(GameValue.EMPTY)) {
            if (wasLastValuePlayedX) {
                grid[row][col] = GameValue.O;
                wasLastValuePlayedX = false;
            } else {
                grid[row][col] = GameValue.X;
                wasLastValuePlayedX= true;
            }
        }
    }

    }

