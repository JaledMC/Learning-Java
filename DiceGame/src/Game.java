public class Game {
    private boolean win;
    Game(){
        this.win = false;
    }
    public boolean match(){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        for(int i=0; i < 5; i++){
            dice1.roll();
            dice2.roll();
            if(dice1.getDice() == dice2.getDice()){
                this.win = true;
                break;
            }
        }
        return this.win;
    }
}
