package TicTacToe;

public class Board {
    private GameValue [][] grid;
    public Board(int number){
        grid = new GameValue[number][number];
    }

    public GameValue[][] getGrid() {
        return grid;
    }
}
