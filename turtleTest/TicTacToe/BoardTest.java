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
    void testThatPlayerCanPlaceValueOnTheBoard(){
        game.makeMove(3);
        game.makeMove(5);

    }


    @Test
    void testThatTwoXValuesCannotBePlayedConsecutively(){
        game.makeMove(4);
        assertEquals(GameValue.X, game.getGameBoard().getGrid()[1][0]);
    }

}