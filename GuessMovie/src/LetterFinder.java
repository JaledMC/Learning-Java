import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class LetterFinder {
    /**Read the file, store all the titles in an array, and select a random one**/
    private ArrayList titles= new ArrayList();
    private String title;
    private String fileName = "/home/habib/IdeaProjects/GuessMovie/movieTitles.txt";

    public void getFile() {
        Scanner scanner = new Scanner(System.in);
        this.fileName = scanner.nextLine();
    }
    public String getTitle() {
        return this.title;
    }
    public void readTitles() {
        try {
            FileReader file = new FileReader("/home/habib/IdeaProjects/GuessMovie/" + this.fileName);
            Scanner fileInput = new Scanner(file);
            while(fileInput.hasNextLine()){
                this.titles.add(fileInput.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("File doesn't exist");
        }
    }
    public void selectTitle() {
        int randNumber = ThreadLocalRandom.current().nextInt(0, this.titles.size());
        this.title = (String) this.titles.get(randNumber);
    }
}
