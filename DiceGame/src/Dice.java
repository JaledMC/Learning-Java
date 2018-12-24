import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int state;
    public void roll(){
        state = ThreadLocalRandom.current().nextInt(0, 6);
    }
    public int getDice() {
        return state;
    }
}
