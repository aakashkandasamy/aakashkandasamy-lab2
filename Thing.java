import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir, timeSinceLast, speed;
    protected char lab;
    protected boolean isTypeB;
    protected boolean isDiagonalMover;  // using this for a helper function 

    public Thing(int row, int col, int dir, char lab, boolean isTypeB) {
        this.row = row;
        this.col = col;
        this.dir = dir;
        this.lab = lab;
        this.isTypeB = isTypeB;
        this.speed = 1;  
        this.isDiagonalMover = false;  
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    @Override
    public String toString() {
        return row + " " + col + " " + lab;
    }

    public void step() {
        if (isDiagonalMover) {
            moveDiagonally();
        } else {
            final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
            row += dr[dir] * speed;
            col += dc[dir] * speed;
        }
    }

    private void moveDiagonally() {
        if (dir == 0 || dir == 2) {  
            row += (dir == 0) ? speed : -speed;
            col += (row % 2 == 0) ? speed : -speed;  
        } else {  
            col += (dir == 1) ? speed : -speed;
            row += (col % 2 == 0) ? speed : -speed;  // math to make it move diagnolly 
        }

    }
public abstract void maybeTurn(Random rand);
}