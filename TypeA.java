import java.util.Random;

public class TypeA extends Thing {
    public TypeA(int row, int col, int speed, char color) {
        super(row, col, 0, color, false);
        this.speed = speed;  
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
    }
}