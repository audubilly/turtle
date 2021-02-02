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

    public boolean WasLastValuePlayedX() {
        return wasLastValuePlayedX;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean isBoardFull(){
        GameValue[][] grid = gameBoard.getGrid();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == GameValue.EMPTY) {
                    return false;
                }
            }
        }
            return true;
    }


    public void makeMove(int rowNumber) throws GameOverException{
       if(isBoardFull()) {
           throw new GameOverException();
       }
        if (rowNumber> 9 ||  rowNumber< 1) {
            throw new IllegalArgumentException("Grid position must be between 1 and 9");
        }

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

