package TicTacToe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;
    TicTacToe game;


    @BeforeEach
    void setUp() {

        board = new Board(3);
        game = new TicTacToe(board);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatBoardCanProvideAGridWhenInitialized(){
        assertNotNull(board.getGrid());
    }

    @Test
    void testThatGridLimitIsEqualsToCollectedValueFromConstructor(){
        assertEquals(3, board.getGrid().length);
        assertEquals(3, board.getGrid()[0].length);
    }



    @Test
    void testThatGameHasABoard(){
        assertNotNull(game.getGameBoard());
    }

    @Test
    void testThatBoardIsEmptyWhenInitialized(){
        Board gameBoard = game.getGameBoard();
        GameValue [][] grid = gameBoard.getGrid();
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                assertEquals(GameValue.EMPTY, grid[row][column]);
            }
        }

    }

    @Test
    void testThatPlayerCanPlaceValueOnTheBoard() throws GameOverException {
        game.makeMove(3);
        game.makeMove(5);

    }


    @Test
    void testThatTwoXValuesCannotBePlayedConsecutively() throws GameOverException {
        game.makeMove(4);
        assertEquals(GameValue.X, game.getGameBoard().getGrid()[1][0]);

        game.makeMove(3);
        assertEquals(GameValue.O, game.getGameBoard().getGrid()[0][2]);

    }

    @Test
    void testThatGameCanPlaceAnyValueOnTheBoard() throws GameOverException{
        game.makeMove(4);
        assertEquals(GameValue.X, game.getGameBoard().getGrid()[1][0]);
        game.makeMove(6);
        assertEquals(GameValue.O, game.getGameBoard().getGrid()[1][2]);
    }

    @Test
    void testThatPlayerCannotPlayTwoConsecutiveXValues()throws GameOverException{
        game.makeMove(5);
        assertEquals(GameValue.X,game.getGameBoard().getGrid()[1][1]);
        game.makeMove(6);
        assertNotEquals(GameValue.X,game.getGameBoard().getGrid()[1][2]);
        game.makeMove(8);
        assertEquals(GameValue.X,game.getGameBoard().getGrid()[2][1]);
        game.makeMove(7);
        assertEquals(GameValue.O,game.getGameBoard().getGrid()[2][0]);


    }


}