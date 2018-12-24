import java.util.Arrays;
import java.util.Scanner;

// can't clear the screen
// better with list than arrays


public class Display {

    /**Take the title, ask for a new character every time in a loop. If the letter appears in it, reveal the position,
     * and increase the hits by one. When hits equals the title size, is a win. All fails are stored until 10**/
    private String title;
    private char[] underscores;
    private int attempts = 10;
    private int hits = 0;
    // private boolean[] hits;

    public Display(String title) {
        this.title = title;
        this.underscores = new char[title.length()];
        //this.hits= new boolean[title.length()];
        Arrays.fill(this.underscores, '_');
        System.out.println(this.underscores);
    }

    public char question() {
        Scanner scanner = new Scanner(System.in);
        char attempt = scanner.next().charAt(0);
        return attempt;
    }

    public void check(char attempt) {
        int notMatch = 0;
        for (int i=0; i<this.title.length(); i++) {
            // if the  letter appears in the title, but hasn't been said
            if (attempt == this.title.charAt(i) & attempt != this.underscores[i]) {
                this.underscores[i] = attempt;
                this.hits++;
            }
            else {
                notMatch++;
                if(notMatch == this.title.length()) {
                    this.attempts--;
                }
            }
        }
    }
    public boolean victory() {
        if(this.attempts == 0) {
            System.out.println("You loose");
            return true;
        }
        if(this.hits == this.title.length()) {
            System.out.println("You win");
            return true;
        }
        return false;
    }
    public void game() {
        while (true) {
            char attempt = question();
            check(attempt);
            System.out.println(this.underscores);
            System.out.println("You have: " +(attempts)+ " attempts");
            if(victory()) {
                break;
            }
        }

    }
}