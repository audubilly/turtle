package turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle turtle;
    Pen turtlePen;
    SketchPad sketchPad;

    @BeforeEach
    void setUp() {
        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
        sketchPad = new SketchPad(20, 20);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void turtle_hasAPen() {
        assertNotNull(turtle.getPen());
    }


    @Test
    void turtlePen_CanBeSetToDown() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(turtle.getPen().getPenOrientation(), PenOrientation.PEN_DOWN);
    }


    @Test
    void turtlePen_canBeSetToUp() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(turtle.getPen().getPenOrientation(), PenOrientation.PEN_UP);
    }


    @Test
    void turtle_canTurnRight() {
        //given that
        turtle.setCurrentDirection(CurrentDirection.EAST);
        //when
        turtle.turnRight();
        //assert
        assertEquals(CurrentDirection.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(CurrentDirection.WEST, turtle.getCurrentDirection());
    }


    @Test
    void turtle_canTurnLeft() {
        //given that
        turtle.setCurrentDirection(CurrentDirection.EAST);
        //when
        turtle.turnLeft();
        //assert
        assertEquals(CurrentDirection.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(CurrentDirection.WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(CurrentDirection.SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(CurrentDirection.EAST, turtle.getCurrentDirection());
    }


    @Test
    void turtle_canMoveEastWard_onASketchPad_whilePenIsUp() {
        //given
        //given that
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }


    @Test
    void turtle_canMoveSouthWard_onASketchPad_WhilePenIsUp() {

        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
//        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(5, 0), turtle.getCurrentPosition());

    }


    @Test
    void turtle_canMoveNorthWard_onASketchPad_WhilePenIsUp() {

        turtle.setCurrentDirection(CurrentDirection.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
//        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(3, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(2, 0), turtle.getCurrentPosition());

    }

    @Test
    void turtle_canMoveWestWard_onASketchPad_WhilePenIsUp() {

        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
//        SketchPad sketchPad = new SketchPad(20, 20);
       turtle.setCurrentPosition(new Position(7, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(3, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(2, 0), turtle.getCurrentPosition());

    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingEast() {
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
//        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.setCurrentPosition(new Position(0, 0));

        int numberOfSpaces = 5;
        turtle.move(sketchPad, numberOfSpaces);
        for (int column = 0; column < numberOfSpaces; column++) {
            assertEquals(1, sketchPad.getFloor()[0][column]);
        }
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingWest() {
        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);

        turtle.setCurrentPosition(new Position(0, 10));
        int numberOfSpaces = 5;
//        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.move(sketchPad, numberOfSpaces);
        for (int column = 10; column > numberOfSpaces; column--) {
            assertEquals(1, sketchPad.getFloor()[0][column]);
        }
        assertEquals(new Position(0, 6), turtle.getCurrentPosition());

    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingSouth() {
        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);

        turtle.setCurrentPosition(new Position(0, 0));
        int numberOfSpaces = 5;
//        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.move(sketchPad, numberOfSpaces);
        for (int rows = 0; rows < numberOfSpaces; rows++) {
            assertEquals(1, sketchPad.getFloor()[rows][0]);
        }
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());

    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingNorth() {
        turtle.setCurrentDirection(CurrentDirection.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);

        turtle.setCurrentPosition(new Position(10, 0));
        int numberOfSpaces = 5;
//        SketchPad sketchPad = new SketchPad(20, 20);
        turtle.move(sketchPad, numberOfSpaces);
        for (int rows = 10; rows > numberOfSpaces; rows--) {
            assertEquals(1, sketchPad.getFloor()[rows][0]);
        }
        assertEquals(new Position(6, 0), turtle.getCurrentPosition());


    }

}