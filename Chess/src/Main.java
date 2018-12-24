public class Main {
    public static void main(String[] arg) {
        Game newGame;
        Rock rock1  = new Rock(2, 2);
        Position newPosition1 = new Position(2, 9);
        if(rock1.isValidMove(newPosition1)) {
            System.out.println("Yeah, valid position");
        } else {
            System.out.println("Ooooh, invalid position");
        }
    }
}
