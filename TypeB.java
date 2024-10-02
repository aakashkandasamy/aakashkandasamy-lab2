import java.util.Random;

public class TypeB extends Thing {
    public TypeB(int row, int col, int speed, char color) {
        super(row, col, 0, color, true);
        this.speed = speed;
        this.timeSinceLast = 0;
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            if (i == 1) {
                rightTurn();
            } else if (i == 2) {
                leftTurn();
            }
        }
    }
}