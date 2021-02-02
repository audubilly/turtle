package TicTacToe;

public class Board {

    private GameValue [][] grid;

    public Board(int number) {

        grid = new GameValue[number][number];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = GameValue.EMPTY;



        }   }
    }

    public GameValue[][] getGrid() {
        return grid;
    }
}
