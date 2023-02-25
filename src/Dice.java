/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

    public void roll() {
        this.sideFacingUp = this.randomGenerator.nextInt(this.sides) + 1;

    }

    public int view() {
        return this.sideFacingUp;

    }

    // Dice d1 = new Dice(6);
    //Dice d2 = new Dice(20);
}


