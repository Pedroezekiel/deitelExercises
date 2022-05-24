package Turtle;

import  static  Turtle.Direction.*;
public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private Position position = new Position(0,0);

    public boolean isPenUp() {
        return true;
    }

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.penDown();
    }

    public void penUp() {
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == SOUTH) currentDirection = WEST;
       else if(currentDirection == EAST) currentDirection = SOUTH;
        else currentDirection=NORTH;
    }

    public void turnLeft() {
        if(currentDirection == NORTH) currentDirection = WEST;
        else if(currentDirection == EAST) currentDirection = NORTH;
        else currentDirection = SOUTH;

    }

    public void move(int noOfSteps) {
        if(currentDirection == EAST) increaseColumnBy(noOfSteps);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition= position.getColumn();
        position.setColumn(currentColumnPosition+noOfSteps-1);
    }

    public Position getPosition() {
        return position;
    }

    private void increaseRowBy(int noOfSteps){
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition+noOfSteps-1);
    }
    private void decreaseRowBy(int noOfSteps){
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition+noOfSteps+1);
    }
    private void decreaseColumnBy(int noOfSteps){
        int currentRowPosition = position.getColumn();
        position.setColumn(currentRowPosition+noOfSteps-1);
    }

    public void moveForward(int noOfSteps) {
        if(currentDirection== EAST) increaseColumnBy(noOfSteps);
        if(currentDirection == SOUTH)increaseRowBy(noOfSteps); ;
        if(currentDirection == WEST) decreaseColumnBy(noOfSteps);
        if(currentDirection == NORTH) decreaseRowBy(noOfSteps);
    }
}
