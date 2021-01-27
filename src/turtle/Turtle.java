package turtle;

public class Turtle {

    private Pen pen;
    private CurrentDirection currentDirection;
    private Position currentPosition;
    //constructor Injection of pen in every turtle created

    public Turtle(Pen pen) {
        this.pen = pen;
        this.currentDirection = CurrentDirection.EAST;
        currentPosition = new Position(0, 0);
    }


    public Pen getPen() {
        return pen;
    }


    public void setCurrentDirection(CurrentDirection currentDirection) {
        this.currentDirection = currentDirection;

    }
        public CurrentDirection getCurrentDirection() {
        return currentDirection;
    }


    public void turnRight() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.SOUTH);
            case WEST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.EAST);
            case SOUTH -> setCurrentDirection(CurrentDirection.WEST);
        }

    }


    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.WEST);
            case WEST -> setCurrentDirection(CurrentDirection.SOUTH);
            case SOUTH -> setCurrentDirection(CurrentDirection.EAST);
        }
    }


    public void move(SketchPad sketchPad, int numberOfSpaces) {
        numberOfSpaces -= 1;
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();

        switch (getPen().getPenOrientation()) {
            case PEN_UP ->  moveWithPenUp(numberOfSpaces);
            case PEN_DOWN -> {

                    int[][] floor = sketchPad.getFloor();

                switch (currentDirection){
                    case EAST -> {
                        int positionAfterLoop = currentColumn + numberOfSpaces;
                        for (int column = currentColumn; column <= positionAfterLoop; column++) {
                            floor[currentRow][column] = 1;
                        }
                        currentPosition.setColumnPosition(positionAfterLoop);

                    }
                    case WEST -> {
                        int positionAfterLoop = currentColumn - numberOfSpaces;
                        for (int column = currentColumn; column >= positionAfterLoop; column--) {
                            floor[currentRow][column] = 1;
                        }
                        currentPosition.setColumnPosition(positionAfterLoop);

                    }
                    case SOUTH -> {
                        int positionAfterLoop = currentColumn  + numberOfSpaces;
                    for(int row = currentRow; row <= positionAfterLoop; row++){
                        floor[row][currentColumn] =  1;
                    }
                        currentPosition.setRowPosition(positionAfterLoop);
                    }

                    case NORTH -> {
                        int positionAfterLoop = currentRow  - numberOfSpaces;
                        for(int row = currentRow; row >= positionAfterLoop; row--){
                            floor[row][currentColumn] = 1;
                        }
                        currentPosition.setRowPosition(positionAfterLoop);
                    }

                }
            }
        }
    }

    private void moveWithPenUp(int numberOfSpaces) {
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        switch (currentDirection) {
            case EAST -> currentPosition.setColumnPosition(currentColumn + numberOfSpaces);
            case SOUTH -> currentPosition.setRowPosition(currentRow + numberOfSpaces);
            case NORTH -> currentPosition.setRowPosition(currentRow - numberOfSpaces);
            case WEST -> currentPosition.setColumnPosition(currentColumn - numberOfSpaces);
        }
    }


    public Position getCurrentPosition () {
                return currentPosition;
            }
            public void setCurrentPosition (Position position){
                currentPosition = position;
            }
        }
