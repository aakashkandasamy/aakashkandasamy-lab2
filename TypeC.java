import java.util.Random;

public class TypeC extends Thing {
    private boolean movingRight;
    private boolean movingDown;

    public TypeC(int row, int col, int speed, char color) {
        super(row, col, 0, color, false);
        this.speed = speed;
        this.movingRight = true;
        this.movingDown = true;
        this.isDiagonalMover = true;  // i want type c to just move diagnolly 
    }

    @Override
    public void maybeTurn(Random rand) {  
    }
}