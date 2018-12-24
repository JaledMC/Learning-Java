public class Main {
    public static void main(String[] args){
    Game match = new Game();
    if(match.match()){
        System.out.println("Woa, you win!");
    }
    else{
        System.out.println("Oooh, you lose");
    }
    }
}
