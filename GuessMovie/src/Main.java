import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        LetterFinder game = new LetterFinder();
        game.getFile();
        game.readTitles();
        game.selectTitle();
        String title = game.getTitle();
        System.out.println(title);
        Display word = new Display(title);
        word.game();
    }
}
