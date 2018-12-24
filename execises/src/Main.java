import jdk.internal.util.xml.impl.Input;

public class Main {
    public static void main(String[] arg) {
        Inputs contacts = new Inputs();
        contacts.fileRead("contacts.txt");

        Inputs book = new Inputs();
        book.readBook("book.txt");
    }
}






/*import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Printing message = new Printing();
        Mathematical temperature = new Mathematical(100);
        double f_temp = temperature.celsius2fahrenheit();
        message.printMessage("in fahrenheit", String.valueOf(f_temp));
        if(f_temp > 100){
            System.out.println("Whoa, it's too cold!");
        }
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Inputs inputs = new Inputs();
        inputs.command();*/
        //inputs.fileRead("contacts.txt");



        /*File myDir = new File("test");
        myDir.mkdir();
        File myFile = new File("myDir","test1.txt");
        myFile.createNewFile();



        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        File file = new File("/home/habib/IdeaProjects/Execises/contacts.txt");
        boolean bool = file.canRead();
        System.out.println(bool);
        System.out.println(file.exists());/*
        //Scanner fileScanner = new Scanner(file);
        /*while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }*/
//    }
//}



