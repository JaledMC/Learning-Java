import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Inputs {
    public void command() {
        /*Take a text from the keyboard and display on the screen*/
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("You said: "+text);
    }
    public void fileRead(String name){
        try{
            /*Read the text  from a given file and display line by line on the screen */
            // create the file
            FileReader file = new FileReader("/home/habib/IdeaProjects/Execises/" + name);
            // open the file
            Scanner fileInput = new Scanner(file);
            // read every line
            while(fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }
            if (fileInput != null)
                // close file
                fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readBook(String name){
        try{
            /*Read the text file, split every line in words and count them*/
            // create the file
            FileReader file = new FileReader("/home/habib/IdeaProjects/Execises/" + name);
            // open the file
            Scanner fileInput = new Scanner(file);
            // read every line
            int word = 0;
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                word += line.split(" ").length;
            }
            System.out.println("Book has: "+ word +" words");
        }
        catch (IOException e){
            System.out.println("File doesn't exist");
        }
    }

}